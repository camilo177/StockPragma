package com.bootcamp.stock.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank(message = "Name cannot be blank")
    //@Size(max = 50, message = "Name must be up to 50 characters")
    //@Column(unique=true)
    private String name;

    //@NotBlank(message = "Description cannot be blank")
    //@Size(max = 90, message = "Description must be up to 90 characters")
    private String description;

    private Integer quantity;

    private BigDecimal price;
}
