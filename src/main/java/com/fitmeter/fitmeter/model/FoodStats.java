package com.fitmeter.fitmeter.model;

import java.util.Date;
import java.util.Objects;

public class FoodStats {
    private int id;
    private String user;
    private String desc;
    private Date targetDate;
    private boolean isDone;

    public FoodStats(int id, String user, String desc, Date targetDate, boolean isDone) {
        this.id = id;
        this.user = user;
        this.desc = desc;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetData) {
        this.targetDate = targetData;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodStats foodStats = (FoodStats) o;
        return id == foodStats.id &&
                isDone == foodStats.isDone &&
                Objects.equals(user, foodStats.user) &&
                Objects.equals(desc, foodStats.desc) &&
                Objects.equals(targetDate, foodStats.targetDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, user, desc, targetDate, isDone);
    }

    @Override
    public String toString() {
        return String.format(
                "FoodStats [id=%s, user=%s, desc=%s, targetDate=%s, isDone=%s]", id,
                user, desc, targetDate, isDone);
    }
}
