
package com.bootcamp.stock.domain.usecase;

import com.bootcamp.stock.domain.api.iArticuloServicePort;
import com.bootcamp.stock.domain.model.Articulo;
import com.bootcamp.stock.domain.spi.iArticuloPersistencePort;


import java.util.List;
import java.util.Optional;

public class ArticuloUseCase implements iArticuloServicePort {

    private final iArticuloPersistencePort articuloPersistencePort;

    public ArticuloUseCase(iArticuloPersistencePort articuloPersistencePort) {
        this.articuloPersistencePort = articuloPersistencePort;
    }

    @Override
    public Articulo saveArticulo(Articulo articulo) {
        articuloPersistencePort.saveArticulo(articulo);
        return articulo;
    }

    @Override
    public Optional<Articulo> findByName(String name) {
        return articuloPersistencePort.findByName(name);
    }


    @Override
    public List<Articulo> findAll() {

        return articuloPersistencePort.findAll();
    }
}
