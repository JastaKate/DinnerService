package com.example.dinnerservice.repository;

import com.example.dinnerservice.entity.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepo extends JpaRepository<Ingredients, Long> {
}
