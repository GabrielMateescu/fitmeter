package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.User;
import com.fitmeter.fitmeter.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller

public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(Model model){
        return "login";
    }

    @RequestMapping("/dashboard")
    public String userFront(Principal principal, Model model) {
        User user = userService.findByUsername(principal.getName());

        return "dashboard";
    }

}
