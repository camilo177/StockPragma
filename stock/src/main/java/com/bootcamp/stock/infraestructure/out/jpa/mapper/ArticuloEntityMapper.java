package com.bootcamp.stock.infraestructure.out.jpa.mapper;

import com.bootcamp.stock.domain.model.Articulo;
import com.bootcamp.stock.domain.model.Categoria;
import com.bootcamp.stock.infraestructure.out.jpa.entity.ArticuloEntity;
import com.bootcamp.stock.infraestructure.out.jpa.entity.CategoriaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ArticuloEntityMapper {

    ArticuloEntity toEntity(Articulo articulo);

    Articulo toArticulo(ArticuloEntity articuloEntity);

    List<Articulo> toArticuloList(List<ArticuloEntity> articuloEntityList);
}
