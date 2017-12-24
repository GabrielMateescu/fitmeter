package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller

public class LoginController {

    @Autowired
    LoginService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(Model model){
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String email, @RequestParam String pass) {



        boolean isValidUser = service.validateUser(email, pass);
        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        } else {

            model.put("name", email);
            model.put("pass", pass);

            return "dashboard";
        }
    }
}
