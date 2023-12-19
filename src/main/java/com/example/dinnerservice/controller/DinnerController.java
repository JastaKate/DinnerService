package com.example.dinnerservice.controller;

import com.example.dinnerservice.entity.Dinner;
import com.example.dinnerservice.request.DinnerRequest;
import com.example.dinnerservice.service.DinnerServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v2/api")
public class DinnerController {

    private final DinnerServiceImpl dinnerService;

    @GetMapping("/dinners")
    public ResponseEntity<List<Dinner>> getDinners() {
        return new ResponseEntity<>(dinnerService.getDinners(), HttpStatus.OK);
    }

    @PostMapping("/dinners")
    public ResponseEntity<Dinner> createDinner(@RequestBody @Valid DinnerRequest dinnerRequest) {
        return new ResponseEntity<>(dinnerService.createDinner(dinnerRequest), HttpStatus.OK);
    }

    @PutMapping("/dinners")
    public ResponseEntity<Dinner> putDinner(@RequestBody @Valid Dinner dinner) {
        return new ResponseEntity<>(dinnerService.putDinner(dinner), HttpStatus.OK);
    }

    @DeleteMapping("/dinners/{id}")
    public HttpStatus deleteDinner(@PathVariable Long id) {
        dinnerService.deleteDinner(id);
        return HttpStatus.OK;
    }











}
