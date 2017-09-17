package com.hehe.fhblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2017/9/17
 * Time: 0:10
 * email: qinghe101@qq.com
 * Author: hehe
 */
@RestController
@RequestMapping
public class MainController {
    @GetMapping("/")
    public String root(){
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(){
        //登陆失败
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        //注册
        return "register";
    }

}
