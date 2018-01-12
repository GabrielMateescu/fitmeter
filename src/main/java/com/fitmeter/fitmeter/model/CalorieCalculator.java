package com.fitmeter.fitmeter.model;
import java.io.Serializable;
import java.util.Objects;


public class CalorieCalculator implements Serializable{

    private int age;
    private boolean male;
    private boolean female;
    private int weight;
    private int height;
    private boolean noExcercise = false;
    private boolean lightExercise = false;
    private boolean moderateExercise = false;
    private boolean intesiveExercise = false;
    private boolean heavyExercise = false;
    private double cal;

    public CalorieCalculator(){}

    public CalorieCalculator(int age, boolean male, boolean female, int weight, int height, boolean noExcercise, boolean lightExercise, boolean moderateExercise, boolean intesiveExercise, boolean heavyExercise, double cal) {
        this.age = age;
        this.male = male;
        this.female = female;
        this.weight = weight;
        this.height = height;
        this.noExcercise = noExcercise;
        this.lightExercise = lightExercise;
        this.moderateExercise = moderateExercise;
        this.intesiveExercise = intesiveExercise;
        this.heavyExercise = heavyExercise;
        this.cal = cal;
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

    public boolean isNoExcercise() {
        return noExcercise;
    }

    public void setNoExcercise(boolean noExcercise) {
        this.noExcercise = noExcercise;
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

    public boolean isIntesiveExercise() {
        return intesiveExercise;
    }

    public void setIntesiveExercise(boolean intesiveExercise) {
        this.intesiveExercise = intesiveExercise;
    }

    public boolean isHeavyExercise() {
        return heavyExercise;
    }

    public void setHeavyExercise(boolean heavyExercise) {
        this.heavyExercise = heavyExercise;
    }

    public double getCal() {
        return cal;
    }

    public void setCal(double cal) {
        this.cal = cal;
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
                noExcercise == that.noExcercise &&
                lightExercise == that.lightExercise &&
                moderateExercise == that.moderateExercise &&
                intesiveExercise == that.intesiveExercise &&
                heavyExercise == that.heavyExercise &&
                Double.compare(that.cal, cal) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, male, female, weight, height, noExcercise, lightExercise, moderateExercise, intesiveExercise, heavyExercise, cal);
    }

    @Override
    public String toString() {
        return "CalorieCalculator{" +
                "age=" + age +
                ", male=" + male +
                ", female=" + female +
                ", weight=" + weight +
                ", height=" + height +
                ", noExcercise=" + noExcercise +
                ", lightExercise=" + lightExercise +
                ", moderateExercise=" + moderateExercise +
                ", intesiveExercise=" + intesiveExercise +
                ", heavyExercise=" + heavyExercise +
                ", cal=" + cal +
                '}';
    }
}
