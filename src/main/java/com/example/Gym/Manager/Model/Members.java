package com.example.Gym.Manager.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Members {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String name;
    private int age;
    @ManyToOne
    @JoinColumn(name = "plan")
    private Plan plan;
    @ManyToOne
    @JoinColumn(name = "gym_goals")
    private GymGoals gymGoal;
    private boolean status;
    private long phoneno;
    private String email;
    private String address;
    
    public Members() {
    }
    
    public Members(long id, String name, int age, Plan plan, GymGoals gymGoal, boolean status, long phoneno,
            String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.plan = plan;
        this.gymGoal = gymGoal;
        this.status = status;
        this.phoneno = phoneno;
        this.email = email;
        this.address = address;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Plan getPlan() {
        return plan;
    }
    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    public GymGoals getGymGoal() {
        return gymGoal;
    }
    public void setGymGoal(GymGoals gymGoal) {
        this.gymGoal = gymGoal;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public long getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}