package com.fitmeter.fitmeter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalorieCalculator {

    @RequestMapping("/calorie-calculator")
    public String home(){
        return "calorie-calculator";
    }


}
