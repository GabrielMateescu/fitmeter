package com.fitmeter.fitmeter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String register(){
        return "register";
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String saveUser( ){
        return "";
        }
    }
