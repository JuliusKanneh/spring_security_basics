package com.spring_security_demo1.spring_security_demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/")
    public String goHome(Model model){
        model.addAttribute("test","Welcome Home");
        return "home";
    }

    @RequestMapping("/home")
    public String goHome1(){
        return "home";
    }

    @RequestMapping("/hello")
    public String getHello(Model model){
        model.addAttribute("test","Welcome Home");
        return "Hello";
    }

    @RequestMapping("/login")
    public String getLogin(){
        return "login";
    }
}
