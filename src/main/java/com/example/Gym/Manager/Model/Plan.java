package com.example.Gym.Manager.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plan {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int planId;
    private String planName;
    private int planPrice;
    private String planDuration;
    
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;

    }

    public void setPlanName(String planName) {
        this.planName = planName;

    }

    public int getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(int planPrice) {
        this.planPrice = planPrice;
    }

    public String getPlanDuration() {
        return planDuration;
    }

    public void setPlanDuration(String planDuration) {
        this.planDuration = planDuration;
    }

    public Plan() {
    }
    
    public Plan(int planId, String planName, int planPrice, String planDuration) {
        this.planId = planId;
        this.planName = planName;
        this.planPrice = planPrice;
        this.planDuration = planDuration;
    }
}
