package com.bootcamp.stock.infraestructure.out.jpa.mapper;

import com.bootcamp.stock.domain.model.Marca;
import com.bootcamp.stock.infraestructure.out.jpa.entity.MarcaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface MarcaEntityMapper {

    MarcaEntity toEntity(Marca marca);

    Marca toMarca(MarcaEntity marcaEntity);

    List<Marca> toMarcaList(List<MarcaEntity> marcaEntityList);
}
