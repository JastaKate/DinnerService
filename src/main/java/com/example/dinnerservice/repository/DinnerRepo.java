package com.example.dinnerservice.repository;

import com.example.dinnerservice.entity.Dinner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinnerRepo extends JpaRepository<Dinner, Long> {
}
