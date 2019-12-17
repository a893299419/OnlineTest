package com.ot.controller;

import com.ot.model.User;
import com.ot.service.user.UserService;
import com.ot.utils.PasswordHelper;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;

@Controller
public class LoginController {
    @Autowired
    PasswordHelper passwordHelper;
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public String login(User user){
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        try{
            subject.login(token);
            return "index";
        } catch (Exception e){
            e.printStackTrace();
            return "login";
        }
    }

    @PostMapping("/register")
    public String register(User user){
        passwordHelper.encryptPassword(user);
        userService.addUser(user);
        return "login";
    }
}
