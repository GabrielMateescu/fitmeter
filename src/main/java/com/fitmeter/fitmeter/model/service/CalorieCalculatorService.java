package com.fitmeter.fitmeter.model.service;

import com.fitmeter.fitmeter.model.CalorieCalculator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalorieCalculatorService {

    public static List<CalorieCalculator> calorieCalculatorList = new ArrayList<>();

    public List<CalorieCalculator> retrieveCalorieCalculatorStats(){
        List filteredCalorieCalculatorStats = new ArrayList();
        for (CalorieCalculator calorieCalculatorItem : calorieCalculatorList){
            filteredCalorieCalculatorStats.add(calorieCalculatorItem);
        }
        return  filteredCalorieCalculatorStats;
    }

    public void addStats(int age, boolean male, boolean female, int weight, int height,  boolean lightExercise, boolean moderateExercise, boolean heavyExercise, double sum){
        calorieCalculatorList.add(new CalorieCalculator(age, male, female, weight, height, lightExercise, moderateExercise, heavyExercise, sum));
    }

}
