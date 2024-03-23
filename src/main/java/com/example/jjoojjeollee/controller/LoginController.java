package com.example.jjoojjeollee.controller;

import com.example.jjoojjeollee.DB.entity.User;
import com.example.jjoojjeollee.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginForm(){
        return "LoginForm";
    }
    @PostMapping(path = "login")
    public String loginValid(@RequestParam String userId, @RequestParam String userPw, Model model){
        if (loginService.isValidUser(userId, userPw)){
            User myUser = new User();
            model.addAttribute("myUser", myUser);
            return "Login";
        };
        return "LoginForm";
    }

    @RequestMapping(value = "myInfo")
    public String userInfo(){
        return "userManage";
    }
}
