package com.fitmeter.fitmeter.model.service;

import com.fitmeter.fitmeter.model.FoodStats;
import com.fitmeter.fitmeter.model.dao.FoodStatsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class FoodStatsService {
    public static List<FoodStats> foodStats = new ArrayList<>();

    private FoodStatsRepository foodStatsRepository;

    public FoodStatsService(FoodStatsRepository foodStatsRepository){
        this.foodStatsRepository = foodStatsRepository;
    }

    public List<FoodStats> findAll() {
        List<FoodStats> foods = new ArrayList<>();
        for (FoodStats foodStats : foodStatsRepository.findAll()) {
            foods.add(foodStats);
        }
        return foods;
    }

    public void save(FoodStats foodStats){
        foodStatsRepository.save(foodStats);
    }

    public void delete(int id){
        foodStatsRepository.deleteById(id);
    }

    public Optional<FoodStats> findFoodStats(int id){
        return foodStatsRepository.findById(id);
    }

    public List<FoodStats> retrieveFoodStats(String user) {
        List<FoodStats> fileteredFoodStats = new ArrayList<>();
        for(FoodStats food : foodStats ) {
            if(food.getName().equals(user)){
                fileteredFoodStats.add(food);
            }
        }
        return fileteredFoodStats;
    }

    public FoodStats retrieveFood(int id) {
        List<FoodStats> fileteredFoodStats = new ArrayList<>();
        for(FoodStats food : foodStats ) {
            if(food.getId() == id){
                fileteredFoodStats.add(food);
                return food;
            }
        }
        return null;
    }

    public void addFoodStats(String name, String desc, Date targetDate, int carbs, int calories, int protein, int fat, int sugar){
        foodStats.add(new FoodStats(name, desc, targetDate, carbs, calories, protein, fat, sugar));
    }

    public void deleteFoodStats(int id){
        Iterator<FoodStats> iterator = foodStats.iterator();
        while (iterator.hasNext()){
            FoodStats foodStats = iterator.next();
            if (foodStats.getId() == id){
                iterator.remove();
            }
        }
    }
}
