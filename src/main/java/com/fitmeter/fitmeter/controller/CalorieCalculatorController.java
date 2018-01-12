package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.CalorieCalculator;
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

    @RequestMapping("/calorie-calculator")
    public String home(){
        return "calorie-calculator";
    }

    @RequestMapping(value = "/calorie-calculator", method = RequestMethod.POST )
    public String showCalculatedResultsPage(ModelMap model, @RequestParam int age){
        calorieCalculatorService.addStats(age,false,true,100, 10900, false, false, false,  100);

        return "redirect:/list-calorie-results";
    }


    @RequestMapping(value = "/list-calorie-results", method = RequestMethod.GET)
    public String showCaloriesInput(ModelMap model){
       model.put("calcInput", calorieCalculatorService.retrieveCalorieCalculatorStats());
        return "list-calorie-results";
    }


}
