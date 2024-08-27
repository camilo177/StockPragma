package com.bootcamp.stock.domain.api;

import com.bootcamp.stock.domain.model.Articulo;

import java.util.List;
import java.util.Optional;

public interface iArticuloServicePort {
    Articulo saveArticulo(Articulo articulo);
    Optional<Articulo> findByName(String name);
    List<Articulo> findAll();

}