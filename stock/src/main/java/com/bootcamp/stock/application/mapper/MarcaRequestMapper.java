package com.bootcamp.stock.application.mapper;

import com.bootcamp.stock.application.dto.MarcaRequest;
import com.bootcamp.stock.domain.model.Marca;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MarcaRequestMapper {

    MarcaRequestMapper INSTANCE = Mappers.getMapper(MarcaRequestMapper.class);

    // Convert MarcaRequest to Marca entity
    Marca toMarca(MarcaRequest marcaRequest);

    // Convert Marca entity to MarcaRequest DTO (if needed)
    MarcaRequest toMarcaRequest(Marca marca);
}
