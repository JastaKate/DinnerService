package com.example.dinnerservice.service;

import com.example.dinnerservice.entity.Dinner;
import com.example.dinnerservice.request.DinnerRequest;

import java.util.List;

public interface DinnerService {
    List<Dinner> getDinners();
    Dinner createDinner(DinnerRequest request);
    Dinner putDinner(Dinner dinner);
    void deleteDinner(Long id);
}
