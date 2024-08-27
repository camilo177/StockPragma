package com.bootcamp.stock.application.mapper;

import com.bootcamp.stock.application.dto.ArticuloResponse;
import com.bootcamp.stock.application.dto.CategoriaResponse;
import com.bootcamp.stock.domain.model.Articulo;
import com.bootcamp.stock.domain.model.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ArticuloResponseMapper {

    ArticuloResponseMapper INSTANCE = Mappers.getMapper(ArticuloResponseMapper.class);

    // Convert Articulo entity to ArticuloResponse DTO
    ArticuloResponse toArticuloResponse(Articulo articulo);

    Articulo toArticulo(Articulo articulo);
}
