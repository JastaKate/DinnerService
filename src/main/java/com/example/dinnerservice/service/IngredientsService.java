package com.example.dinnerservice.service;

import com.example.dinnerservice.entity.Ingredients;
import com.example.dinnerservice.request.IngredientsRequest;

public interface IngredientsService {
    Ingredients createIngredient(Long breakfasts_id, IngredientsRequest request);
    Ingredients putIngredient(Long ingredients_id, IngredientsRequest request);
    void deleteIngredient(Long id);
}
