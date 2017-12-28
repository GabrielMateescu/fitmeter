package com.fitmeter.fitmeter.model.service;

import com.fitmeter.fitmeter.model.FoodStats;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class FoodStatsService {
    public static List<FoodStats> foodStats = new ArrayList<>();
    private static int foodCount = 2;

    static {
        foodStats.add(new FoodStats(1, "Gabriel", "Papanasi", new Date(), 55, 344, 32, 12, 33));
        foodStats.add(new FoodStats(2, "Gabriel", "Banane", new Date(), 66, 553, 23, 44, 32));
    }

    public List<FoodStats> retrieveFoodStats(String user) {
        List<FoodStats> fileteredFoodStats = new ArrayList<>();
        for(FoodStats food : foodStats ) {
            if(food.getUser().equals(user)){
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
        foodStats.add(new FoodStats(++foodCount, name, desc, targetDate, carbs, calories, protein, fat, sugar));
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
