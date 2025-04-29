package com.example.Gym.Manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Gym.Manager.Model.Plan;

@Repository
public interface PlanRepo extends JpaRepository<Plan, Integer> {
    // This interface will automatically provide CRUD operations for MemberDetails entity

}
