
package com.bootcamp.stock.domain.usecase;

import com.bootcamp.stock.domain.api.iCategoriaServicePort;
import com.bootcamp.stock.domain.model.Categoria;
import com.bootcamp.stock.domain.spi.iCategoriaPersistencePort;

import java.util.List;
import java.util.Optional;

public class CategoriaUseCase implements iCategoriaServicePort {

    private final iCategoriaPersistencePort categoriaPersistencePort;

    public CategoriaUseCase(iCategoriaPersistencePort categoriaPersistencePort) {
        this.categoriaPersistencePort = categoriaPersistencePort;
    }

    @Override
    public void saveCategoria(Categoria categoria) {
        categoriaPersistencePort.save(categoria);
    }

    @Override
    public Optional<Categoria> findByName(String name) {
        return categoriaPersistencePort.findByName(name);
    }

    @Override
    public List<Categoria> findAll(int page, int size, String sort) {

        return categoriaPersistencePort.findAll();
    }
}
