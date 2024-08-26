package com.bootcamp.stock.infraestructure.out.jpa.adapter;

import com.bootcamp.stock.domain.model.Marca;
import com.bootcamp.stock.domain.spi.iMarcaPersistencePort;
import com.bootcamp.stock.infraestructure.out.jpa.entity.MarcaEntity;
import com.bootcamp.stock.infraestructure.out.jpa.mapper.MarcaEntityMapper;
import com.bootcamp.stock.infraestructure.out.jpa.repository.iMarcaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class MarcaJpaAdapter implements iMarcaPersistencePort {

    private final iMarcaRepository marcaRepository;
    private final MarcaEntityMapper marcaEntityMapper;

    @Override
    public void saveMarca(Marca marca) {
        MarcaEntity marcaEntity = marcaEntityMapper.toEntity(marca);
        marcaRepository.save(marcaEntity);
    }
}
