package com.bootcamp.stock.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloResponse {

    private Long id; //Think about this
    private String name;
    private String description;
    private Integer quantity;
    private BigDecimal price;
}
