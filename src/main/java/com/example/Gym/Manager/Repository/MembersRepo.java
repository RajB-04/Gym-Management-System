package com.example.Gym.Manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Gym.Manager.Model.Members;

@Repository
public interface MembersRepo extends JpaRepository<Members, Long>{
    // Custom query methods can be defined here if needed
    // For example, you can add methods to find members by name, age, etc.

}
