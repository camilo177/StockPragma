package com.bootcamp.stock.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarcaRequest {

    @NotBlank(message = "Name cannot be blank")
    @Size(max = 50, message = "Name must be up to 50 characters")
    private String name;

    @NotBlank(message = "Description cannot be blank")
    @Size(max = 120, message = "Description must be up to 120 characters")
    private String description;
}
