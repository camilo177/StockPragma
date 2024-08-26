package com.bootcamp.stock.domain.api;

import com.bootcamp.stock.domain.model.Categoria;


import java.util.List;
import java.util.Optional;

public interface iCategoriaServicePort {

    Categoria saveCategoria(Categoria categoria);
    Optional<Categoria> findByName(String name);
    List<Categoria> findAll();

}