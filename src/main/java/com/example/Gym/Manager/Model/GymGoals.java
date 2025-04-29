package com.example.Gym.Manager.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GymGoals {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int goalId;
    private String goalType;
    
    public GymGoals() {
    }
    public GymGoals(int goalId, String goalType) {
        this.goalId = goalId;
        this.goalType = goalType;
    }
    public int getGoalId() {
        return goalId;
    }
    public void setGoalId(int planId) {
        this.goalId = planId;
    }
    public String getGoalType() {
        return goalType;
    }
    public void setGoalType(String goalType) {
        this.goalType = goalType;
    }

}
