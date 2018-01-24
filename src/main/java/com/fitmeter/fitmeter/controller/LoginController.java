package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.User;
import com.fitmeter.fitmeter.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller

public class LoginController {

    @RequestMapping(value="/login", method = GET)
    public String login(Principal principal) {
        return principal == null ?  "login" : "redirect:/";
    }

}
