package com.example.Gym.Manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Gym.Manager.Model.GymGoals;

@Repository
public interface GymGoalsRepo extends JpaRepository<GymGoals, Integer> {
    // This interface will automatically provide CRUD operations for GymGoals entity
    
}
