package com.fitmeter.fitmeter.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity(name="food_stats")
public class FoodStats implements Serializable{

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date targetDate;
    private int carbs;
    private int calories;
    private int protein;
    private int fat;
    private int sugar;


    public FoodStats(){}

    public FoodStats(String name, String desc, Date targetDate, int carbs, int calories, int protein, int fat, int sugar) {
        super();
        this.name = name;
        this.description = desc;
        this.targetDate = targetDate;
        this.carbs = carbs;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sugar = sugar;

    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetData) {
        this.targetDate = targetData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodStats foodStats = (FoodStats) o;
        return id == foodStats.id &&
                Objects.equals(name, foodStats.name) &&
                Objects.equals(description, foodStats.description) &&
                Objects.equals(carbs,foodStats.carbs) &&
                Objects.equals(calories,foodStats.calories) &&
                Objects.equals(protein,foodStats.protein) &&
                Objects.equals(fat,foodStats.fat) &&
                Objects.equals(sugar,foodStats.sugar) &&
                Objects.equals(targetDate, foodStats.targetDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, description, targetDate, carbs, calories, protein, fat, sugar);
    }

    @Override
    public String toString() {
        return String.format(
                "FoodStats [id=%s, name=%s, desc=%s, targetDate=%s, carbs=%s, protein=%s, calories=%s, fat=%s, sugar=%s]", id,
                name, description, targetDate, carbs, protein, calories, fat, sugar);
    }
}
