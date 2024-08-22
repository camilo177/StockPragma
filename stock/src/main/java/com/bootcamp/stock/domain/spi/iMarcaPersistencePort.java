package com.bootcamp.stock.domain.spi;

import com.bootcamp.stock.domain.model.Marca;

import java.util.List;
import java.util.Optional;

public interface iMarcaPersistencePort {
    void saveMarca(Marca marca);
}
