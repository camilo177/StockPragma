package com.bootcamp.stock.domain.usecase;

import com.bootcamp.stock.domain.api.iMarcaServicePort;
import com.bootcamp.stock.domain.model.Marca;

import java.util.List;
import java.util.Optional;

public class MarcaUseCase implements iMarcaServicePort {
    @Override
    public Marca save(Marca marca) {
        return null;
    }

    @Override
    public Optional<Marca> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Marca> findAll(int page, int size, String sort) {
        return null;
    }
}
