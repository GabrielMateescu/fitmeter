package com.fitmeter.fitmeter.model;
import java.io.Serializable;
import java.util.Objects;


public class CalorieCalculator implements Serializable{

    private int age;
    private boolean male;
    private boolean female;
    private int weight;
    private int height;
    private boolean lightExercise = false;
    private boolean moderateExercise = false;
    private boolean heavyExercise = false;
    private double sum = 0;

    public CalorieCalculator(){}

    public CalorieCalculator(int age, boolean male, boolean female, int weight, int height, boolean lightExercise, boolean moderateExercise, boolean heavyExercise, double sum) {
        this.age = age;
        this.male = male;
        this.female = female;
        this.weight = weight;
        this.height = height;
        this.lightExercise = lightExercise;
        this.moderateExercise = moderateExercise;
        this.heavyExercise = heavyExercise;
        this.sum = sum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isLightExercise() {
        return lightExercise;
    }

    public void setLightExercise(boolean lightExercise) {
        this.lightExercise = lightExercise;
    }

    public boolean isModerateExercise() {
        return moderateExercise;
    }

    public void setModerateExercise(boolean moderateExercise) {
        this.moderateExercise = moderateExercise;
    }

    public boolean isHeavyExercise() {
        return heavyExercise;
    }

    public void setHeavyExercise(boolean heavyExercise) {
        this.heavyExercise = heavyExercise;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalorieCalculator that = (CalorieCalculator) o;
        return age == that.age &&
                male == that.male &&
                female == that.female &&
                weight == that.weight &&
                height == that.height &&
                lightExercise == that.lightExercise &&
                moderateExercise == that.moderateExercise &&
                heavyExercise == that.heavyExercise &&
                Double.compare(that.sum, sum) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, male, female, weight, height, lightExercise, moderateExercise, heavyExercise, sum);
    }

    @Override
    public String toString() {
        return "CalorieCalculator{" +
                "age=" + age +
                ", male=" + male +
                ", female=" + female +
                ", weight=" + weight +
                ", height=" + height +
                ", lightExercise=" + lightExercise +
                ", moderateExercise=" + moderateExercise +
                ", heavyExercise=" + heavyExercise +
                ", sum=" + sum +
                '}';
    }
}

