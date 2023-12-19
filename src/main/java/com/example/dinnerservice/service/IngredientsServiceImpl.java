package com.example.dinnerservice.service;

import com.example.dinnerservice.entity.Dinner;
import com.example.dinnerservice.entity.Ingredients;
import com.example.dinnerservice.repository.IngredientsRepo;
import com.example.dinnerservice.request.IngredientsRequest;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IngredientsServiceImpl implements IngredientsService {
    @PersistenceContext
    private EntityManager entityManager;
    private final IngredientsRepo ingredientsRepo;

    @Override
    public Ingredients createIngredient(Long dinner_id, IngredientsRequest request) {
        Dinner dinner = entityManager.getReference(Dinner.class, dinner_id);
        return ingredientsRepo.save(Ingredients.builder()
                .dinner(dinner)
                .product(request.getProduct())
                .amount(request.getAmount())
                .build());
    }

    @Override
    public Ingredients putIngredient(Long ingredients_id, IngredientsRequest request) {
        Ingredients ingredients = ingredientsRepo.findById(ingredients_id).get();
        ingredients.setProduct(request.getProduct());
        ingredients.setAmount(request.getAmount());
        return ingredientsRepo.save(ingredients);
    }

    @Override
    public void deleteIngredient(Long id) {
        ingredientsRepo.deleteById(id);
    }
}
