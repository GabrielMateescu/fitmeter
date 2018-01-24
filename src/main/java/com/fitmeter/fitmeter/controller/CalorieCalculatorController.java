package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.service.CalorieCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalorieCalculatorController {

    @Autowired
    CalorieCalculatorService calorieCalculatorService;

    @RequestMapping(value = "/calorie-calculator", method = RequestMethod.GET)
    public String showCalorieCalculatorHome(){
        return "calorie-calculator";
    }

    @RequestMapping(value = "/calorie-calculator", method = RequestMethod.POST)
    public String showResultsPage(ModelMap model, @RequestParam int age, @RequestParam float weight, @RequestParam float height){

        model.put("age", age);
        model.put("weight", weight);
        model.put("height", height);
        model.put("sum", calorieCalculatorService.sum(age, weight, height));

        return "list-calorie-results";
    }
}
