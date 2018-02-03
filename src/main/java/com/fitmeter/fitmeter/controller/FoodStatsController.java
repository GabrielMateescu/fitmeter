package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.FoodStats;
import com.fitmeter.fitmeter.model.User;
import com.fitmeter.fitmeter.model.service.FoodStatsService;
import com.fitmeter.fitmeter.model.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.Date;
import java.util.List;

@Controller
public class FoodStatsController {

    private final Logger LOG = LoggerFactory.getLogger(FoodStatsController.class);

    @Autowired
    FoodStatsService foodStatsService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/list-foods", method = RequestMethod.GET)
    public String showFoodList(ModelMap model, Principal principal) {

        List<FoodStats> userFoodStatsList = foodStatsService.findUserFoodStatsList(principal.getName());

        model.put("foods", userFoodStatsList);
        return "list-foods";
    }

    @RequestMapping(value = "/add-food", method = RequestMethod.GET)
    public String showAddFoodPage() {
        return "add-food";
    }


    @RequestMapping(value = "/add-food", method = RequestMethod.POST)
    public String addFood(@ModelAttribute FoodStats foodStats, Principal principal) {
        foodStats.setTargetDate(new Date());

        //delete functionality will fail when I add this
        User user = userService.findByUsername(principal.getName());
        foodStats.setUser(user);

        foodStatsService.save(foodStats);
        return "redirect:/list-foods";
    }

    @RequestMapping(value = "/delete-food", method = RequestMethod.GET)
    public String deleteFood(@RequestParam int id) {

        LOG.info("Deleting food with id: {}", id);

        foodStatsService.deleteFoodStats(id);

//        List<FoodStats> userFoodStatsList = foodStatsService.findUserFoodStatsList(principal.getName());
//
//        model.put("foods", userFoodStatsList);

        return "redirect:/list-foods";
    }
}
