package com.bootcamp.stock.application.mapper;

import com.bootcamp.stock.application.dto.CategoriaRequest;
import com.bootcamp.stock.domain.model.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategoriaRequestMapper {

    CategoriaRequestMapper INSTANCE = Mappers.getMapper(CategoriaRequestMapper.class);

    // Convert CategoriaRequest to Categoria entity
    Categoria toCategoria(CategoriaRequest categoriaRequest);

    // Optionally, if needed, convert Categoria entity to CategoriaRequest DTO
    CategoriaRequest toCategoriaRequest(Categoria categoria);
}
