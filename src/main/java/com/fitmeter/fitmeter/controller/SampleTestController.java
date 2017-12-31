package com.fitmeter.fitmeter.controller;

import com.fitmeter.fitmeter.model.FoodStats;
import com.fitmeter.fitmeter.model.service.FoodStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SampleTestController {

    @Autowired
    private FoodStatsService foodStatsService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    	@GetMapping("/all-tasks")
	public String allTasks(){
		return foodStatsService.findAll().toString();
	}

    	@GetMapping("/save-task")
	public String saveTask(@RequestParam String customer, @RequestParam String description ){
		FoodStats stats = new FoodStats(1, customer, description, new Date(), 23, 43, 34, 32, 32);
            foodStatsService.save(stats);
		return "Food saved!";
	}
}
