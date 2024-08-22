package com.bootcamp.stock.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Categoria {

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
}
