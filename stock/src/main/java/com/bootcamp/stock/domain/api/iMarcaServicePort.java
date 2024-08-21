package com.bootcamp.stock.domain.api;

import com.bootcamp.stock.domain.model.Marca;

import java.util.List;
import java.util.Optional;

public interface iMarcaServicePort {
    Marca save(Marca marca);
    Optional<Marca> findByName(String name);
    List<Marca> findAll(int page, int size, String sort);
}
