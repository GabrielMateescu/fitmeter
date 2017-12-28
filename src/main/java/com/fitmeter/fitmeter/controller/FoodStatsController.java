package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.FoodStats;
import com.fitmeter.fitmeter.model.service.FoodStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller

public class FoodStatsController {

    @Autowired
    FoodStatsService service;

    @RequestMapping(value = "/list-foods", method = RequestMethod.GET)
        public String showFoodList(ModelMap model){
        model.put("foods", service.retrieveFoodStats("Gabriel"));
        return "list-foods";
    }

    @RequestMapping(value = "/add-food", method = RequestMethod.GET)
    public String showAddFoodPage(ModelMap model){
        return "add-food";
    }

    @RequestMapping(value = "/add-food", method = RequestMethod.POST)
    public String addFood(ModelMap model, @RequestParam String desc, @RequestParam int carbs,
                  @RequestParam int calories, @RequestParam int protein, @RequestParam int fat, @RequestParam int sugar){
        service.addFoodStats("Gabriel", desc, new Date(),  carbs, calories, protein, fat, sugar);

        return "redirect:/list-foods";
    }

    @RequestMapping(value = "/delete-food", method = RequestMethod.GET)
    public String deleteFood(@RequestParam int id){
        service.deleteFoodStats(id);
        return "redirect:/list-foods";
    }
}
