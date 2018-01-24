package com.fitmeter.fitmeter.model.service;

import org.springframework.stereotype.Service;

@Service
public class CalorieCalculatorService {

    public double sum(int age, float weight, float height) {

        return 10 * weight + 6.25 * height - 5 * age + 5;
    }

}
