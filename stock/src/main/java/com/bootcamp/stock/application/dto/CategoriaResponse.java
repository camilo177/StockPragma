package com.bootcamp.stock.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaResponse {

    private Long id; //Think about this
    private String name;
    private String description;
}
