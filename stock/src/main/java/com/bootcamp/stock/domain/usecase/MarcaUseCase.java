package com.bootcamp.stock.domain.usecase;

import com.bootcamp.stock.domain.api.iMarcaServicePort;
import com.bootcamp.stock.domain.model.Marca;
import com.bootcamp.stock.domain.spi.iMarcaPersistencePort;

public class MarcaUseCase implements iMarcaServicePort {
    private final iMarcaPersistencePort marcaPersistencePort;

    public MarcaUseCase(iMarcaPersistencePort marcaPersistencePort) {
        this.marcaPersistencePort = marcaPersistencePort;
    }


    @Override
    public void saveMarca(Marca marca) {
        marcaPersistencePort.saveMarca(marca);
    }
}
