package com.example.dinnerservice.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class IngredientsRequest {
    @NotBlank
    private String product;
    @NotBlank
    private String amount;
}
