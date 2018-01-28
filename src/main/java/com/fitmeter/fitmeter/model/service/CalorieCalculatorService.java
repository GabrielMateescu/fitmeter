package com.fitmeter.fitmeter.model.service;


import com.sun.tools.javac.util.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CalorieCalculatorService {

    public double sum(int age, float weight, float height, String male) {

        if (Objects.equals(male,"male")) {
            return 10 * weight + 6.25 * height - 5 * age + 5;
        } else
            return 10 * weight + 6.25 * height - 5 * age - 161;

    }

}
