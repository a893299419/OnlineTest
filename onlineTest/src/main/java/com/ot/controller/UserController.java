package com.ot.controller;

import com.ot.model.UserDomain;
import com.ot.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserDomain user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

//    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "admin_user_list";
    }

    @ResponseBody
    @GetMapping("/test2")
    public String test2(){
        return "111";
    }

    @GetMapping("/index")
    public String index(Model model){

        return "admin_user_list";
    }
}
