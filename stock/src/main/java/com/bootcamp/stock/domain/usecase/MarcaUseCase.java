package com.bootcamp.stock.domain.usecase;

import com.bootcamp.stock.domain.api.iMarcaServicePort;
import com.bootcamp.stock.domain.model.Marca;
import com.bootcamp.stock.domain.spi.iMarcaPersistencePort;

import java.util.List;
import java.util.Optional;

public class MarcaUseCase implements iMarcaServicePort {
    private final iMarcaPersistencePort marcaPersistencePort;

    public MarcaUseCase(iMarcaPersistencePort marcaPersistencePort) {
        this.marcaPersistencePort = marcaPersistencePort;
    }

    @Override
    public void saveMarca(Marca marca) {
        marcaPersistencePort.saveMarca(marca);
    }

    @Override
    public Optional<Marca> findByName(String name) {
        return marcaPersistencePort.findByName(name);
    }

    @Override
    public List<Marca> findAll() {
        return marcaPersistencePort.findAll();
    }
}
