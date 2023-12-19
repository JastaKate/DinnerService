package com.example.dinnerservice.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DinnerRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String category;
    @NotBlank
    private String time;
}
