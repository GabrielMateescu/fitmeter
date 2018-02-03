package com.fitmeter.fitmeter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller

public class LoginController {

    @RequestMapping(value = "/login", method = GET)
    public String login(Principal principal) {
        return principal == null ? "login" : "redirect:/";
    }

}
