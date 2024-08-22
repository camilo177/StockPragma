package com.bootcamp.stock.domain.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Marca {
    private Long id;
    @Column(unique=true)
    @NotBlank(message = "Name cannot be blank")
    @Size(max = 50, message = "Name must be up to 50 characters")
    private String name;
    @NotBlank(message = "Description cannot be blank")
    @Size(max = 120, message = "Description must be up to 90 characters")
    private String description;
}