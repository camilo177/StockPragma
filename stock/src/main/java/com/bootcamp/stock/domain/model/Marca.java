package com.bootcamp.stock.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Marca {
    private Long id;
    private String name;
    private String description;
}