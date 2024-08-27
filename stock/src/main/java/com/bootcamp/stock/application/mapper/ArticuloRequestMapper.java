package com.bootcamp.stock.application.mapper;

import com.bootcamp.stock.application.dto.ArticuloRequest;
import com.bootcamp.stock.domain.model.Articulo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ArticuloRequestMapper {

    ArticuloRequestMapper INSTANCE = Mappers.getMapper(ArticuloRequestMapper.class);

    // Convert ArticuloRequest to Articulo entity
    Articulo toArticulo(ArticuloRequest articuloRequest);

    // Optionally, if needed, convert Articulo entity to ArticuloRequest DTO
    ArticuloRequest toArticuloRequest(Articulo articulo);
}
