package com.cisne.payload.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private Long stockQuantity;
}