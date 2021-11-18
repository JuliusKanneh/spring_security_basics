package com.spring_security_demo1.spring_security_demo1.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class HelloController implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("Hello");
        registry.addViewController("/login").setViewName("login");
    }

//    @RequestMapping("/home")
//    public String home(){
//        return "home";
//    }
//
//    @RequestMapping("/hello")
//    public String hello(){
//        return "Hello";
//    }
//
//    public String login(){
//        return "login";
//    }
//
//    @RequestMapping
//    public String home1(){
//        return "home";
//    }
}
