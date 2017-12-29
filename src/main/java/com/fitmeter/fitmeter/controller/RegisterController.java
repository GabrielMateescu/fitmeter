package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @RequestMapping("/newaccount")
    public String register() {
        return "newaccount";
    }


    @RequestMapping(value = "/newaccount", method = RequestMethod.POST)
    public String saveUser(Model model) {
        model.addAttribute("user", new User());

        return "accountcreated";
    }

}
