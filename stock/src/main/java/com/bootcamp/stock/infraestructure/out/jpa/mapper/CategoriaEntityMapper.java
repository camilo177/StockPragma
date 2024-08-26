package com.bootcamp.stock.infraestructure.out.jpa.mapper;

import com.bootcamp.stock.domain.model.Categoria;
import com.bootcamp.stock.infraestructure.out.jpa.entity.CategoriaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CategoriaEntityMapper {

    CategoriaEntity toEntity(Categoria categoria);

    Categoria toCategoria(CategoriaEntity categoriaEntity);

    List<Categoria> toCategoriaList(List<CategoriaEntity> categoriaEntityList);
}
