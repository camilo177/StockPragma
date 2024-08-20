package com.bootcamp.stock.domain;

import java.util.List;
import java.util.Optional;

public interface MarcaRepository {
    Marca save(Marca marca);
    Optional<Marca> findByName(String name);
    List<Marca> findAll(int page, int size, String sort);
}
