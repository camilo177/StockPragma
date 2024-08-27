package com.bootcamp.stock.domain.spi;

import com.bootcamp.stock.domain.model.Articulo;

import java.util.List;
import java.util.Optional;

public interface iArticuloPersistencePort {
    void saveArticulo(Articulo articulo);
    Optional<Articulo> findByName(String name);
    List<Articulo> findAll();
}