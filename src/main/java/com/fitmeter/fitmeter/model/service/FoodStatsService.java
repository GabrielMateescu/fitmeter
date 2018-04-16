package com.fitmeter.fitmeter.model.service;

import com.fitmeter.fitmeter.model.FoodStats;
import com.fitmeter.fitmeter.model.User;
import com.fitmeter.fitmeter.model.dao.FoodStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class FoodStatsService {

    @Autowired
    private UserService userService;

    public static List<FoodStats> foodStats = new ArrayList<>();

    private FoodStatsRepository foodStatsRepository;

    public FoodStatsService(FoodStatsRepository foodStatsRepository) {
        this.foodStatsRepository = foodStatsRepository;
    }


    public List<FoodStats> findUserFoodStatsList(String username) {
        User user = userService.findByUsername(username);
        List<FoodStats> findUserFoodStatsList = user.getFoodStats();

        return findUserFoodStatsList;
    }

    public void save(FoodStats foodStats) {
        foodStatsRepository.save(foodStats);
    }

    public void delete(int id) {
        foodStatsRepository.deleteById(id);
    }

    public void deleteFoodStats(int id) {
        Iterator<FoodStats> iterator = foodStats.iterator();
        while (iterator.hasNext()) {
            FoodStats foodStats = iterator.next();
            if (foodStats.getId() == id) {
                iterator.remove();
            }
        }
    }

    public int sumSugar(String username) {
        User user = userService.findByUsername(username);
        List<FoodStats> findUserFoodStatsList = user.getFoodStats();
        return findUserFoodStatsList
                .stream()
                .mapToInt(FoodStats::getSugar)
                .sum();
    }

    public int sumCalories(String username) {
        User user = userService.findByUsername(username);
        List<FoodStats> findUserFoodStatsList = user.getFoodStats();
        return findUserFoodStatsList
                .stream()
                .mapToInt(FoodStats::getCalories)
                .sum();
    }

    public int sumFat(String username) {
        User user = userService.findByUsername(username);
        List<FoodStats> findUserFoodStatsList = user.getFoodStats();
        return findUserFoodStatsList
                .stream()
                .mapToInt(FoodStats::getFat)
                .sum();
    }

    public int sumProtein(String username) {
        User user = userService.findByUsername(username);
        List<FoodStats> findUserFoodStatsList = user.getFoodStats();
        return findUserFoodStatsList
                .stream()
                .mapToInt(FoodStats::getProtein)
                .sum();
    }

    public int sumCarbs(String username) {
        User user = userService.findByUsername(username);
        List<FoodStats> findUserFoodStatsList = user.getFoodStats();
        return findUserFoodStatsList
                .stream()
                .mapToInt(FoodStats::getCarbs)
                .sum();
    }
}
