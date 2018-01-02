package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.User;
import com.fitmeter.fitmeter.model.service.LoginService;
import com.fitmeter.fitmeter.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller

public class LoginController {

    @Autowired
    LoginService service;

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

//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String showWelcomePage(ModelMap model, @RequestParam String username, @RequestParam String pass) {
//
//
//
//        boolean isValidUser = service.validateUser(username, pass);
//        if (!isValidUser) {
//            model.put("errorMessage", "Invalid Credentials");
//            return "login";
//        } else {
//
//            model.put("name", getLoggedInUserName());
//            model.put("pass", pass);
//
//            return "dashboard";
//        }
//    }

    private String getLoggedInUserName(){
       Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

       if(principal instanceof UserDetails) {
           return ((UserDetails) principal).getUsername();
       }

       return principal.toString();
    }
}
