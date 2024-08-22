package com.bootcamp.stock.application.mapper;

import com.bootcamp.stock.application.dto.MarcaResponse;
import com.bootcamp.stock.domain.model.Marca;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MarcaResponseMapper {

    MarcaResponseMapper INSTANCE = Mappers.getMapper(MarcaResponseMapper.class);

    // Convert Marca entity to MarcaResponse DTO
    MarcaResponse toMarcaResponse(Marca marca);

    // Optionally, you can have a method to convert MarcaResponse to Marca (if needed)
    Marca toMarca(MarcaResponse marcaResponse);
}
