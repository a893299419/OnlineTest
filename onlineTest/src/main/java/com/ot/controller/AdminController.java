package com.ot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping("/knowledgeList")
    public String knowledgeList(){
        return "admin_knowledge_list";
    }

    @RequestMapping("/questionList")
    public String questionList(){
        return "admin_question_list";
    }

    @RequestMapping("/questionOption")
    public String questionOption(){
        return "admin_question_option";
    }

    @RequestMapping("/userList")
    public String userList(){
        return "admin_user_list";
    }

    @RequestMapping("/userQuestion")
    public String userQuestion(){
        return "admin_user_question";
    }


}
