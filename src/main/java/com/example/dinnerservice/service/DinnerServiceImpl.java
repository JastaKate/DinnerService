package com.example.dinnerservice.service;

import com.example.dinnerservice.entity.Dinner;
import com.example.dinnerservice.repository.DinnerRepo;
import com.example.dinnerservice.request.DinnerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DinnerServiceImpl implements DinnerService{

    private final DinnerRepo dinnerRepo;

    @Override
    public List<Dinner> getDinners() {
        return dinnerRepo.findAll();
    }

    @Override
    public Dinner createDinner(DinnerRequest request) {
        return dinnerRepo.save(Dinner.builder()
                .name(request.getName())
                .category(request.getCategory())
                .time(request.getTime())
                .build());
    }

    @Override
    public Dinner putDinner(Dinner dinner) {
        return dinnerRepo.save(dinner);
    }

    @Override
    public void deleteDinner(Long id) {
        dinnerRepo.deleteById(id);
    }
}
