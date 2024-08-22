package com.bootcamp.stock.application.mapper;

import com.bootcamp.stock.application.dto.CategoriaResponse;
import com.bootcamp.stock.domain.model.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoriaResponseMapper {

    CategoriaResponseMapper INSTANCE = Mappers.getMapper(CategoriaResponseMapper.class);

    // Convert Categoria entity to CategoriaResponse DTO
    CategoriaResponse toCategoriaResponse(Categoria categoria);

    // Optionally, if needed, convert CategoriaResponse DTO to Categoria entity
    Categoria toCategoria(CategoriaResponse categoriaResponse);
}
