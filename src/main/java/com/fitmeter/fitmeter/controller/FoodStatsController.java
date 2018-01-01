package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.FoodStats;
import com.fitmeter.fitmeter.model.service.FoodStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller

public class FoodStatsController {

    @Autowired
    FoodStatsService service;

    @RequestMapping(value = "/list-foods", method = RequestMethod.GET)
        public String showFoodList(ModelMap model){
//        model.put("foods", service.retrieveFoodStats("Gabriel"));
        model.put("foods", service.findAll());
        return "list-foods";
    }

    @RequestMapping(value = "/add-food", method = RequestMethod.GET)
    public String showAddFoodPage(ModelMap model){
        return "add-food";
    }


    @RequestMapping(value = "/add-food", method = RequestMethod.POST)
    public String addFood(@ModelAttribute FoodStats foodStats, BindingResult bindingResult, HttpServletRequest request){
        foodStats.setTargetDate(new Date());
        service.save(foodStats);
        return "redirect:/list-foods";
    }

    @RequestMapping(value = "/delete-food", method = RequestMethod.GET)
    public String deleteFood(@RequestParam int id){
        service.delete(id);
        return "redirect:/list-foods";
    }
}
