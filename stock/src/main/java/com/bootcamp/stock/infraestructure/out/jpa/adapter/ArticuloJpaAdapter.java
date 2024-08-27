package com.bootcamp.stock.infraestructure.out.jpa.adapter;

import com.bootcamp.stock.domain.model.Articulo;
import com.bootcamp.stock.domain.model.Categoria;
import com.bootcamp.stock.domain.spi.iArticuloPersistencePort;
import com.bootcamp.stock.infraestructure.out.jpa.entity.ArticuloEntity;
import com.bootcamp.stock.infraestructure.out.jpa.entity.CategoriaEntity;
import com.bootcamp.stock.infraestructure.out.jpa.mapper.ArticuloEntityMapper;
import com.bootcamp.stock.infraestructure.out.jpa.repository.iArticuloRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ArticuloJpaAdapter implements iArticuloPersistencePort {

    private final iArticuloRepository articuloRepository;
    private final ArticuloEntityMapper articuloEntityMapper;

    @Override
    public void saveArticulo(Articulo articulo) {
        ArticuloEntity articuloEntity = articuloEntityMapper.toEntity(articulo);
        articuloRepository.save(articuloEntity);
    }

    @Override
    public Optional<Articulo> findByName(String name) {
        return articuloRepository.findByName(name)
                .map(articuloEntityMapper::toArticulo);
    }

    @Override
    public List<Articulo> findAll() {
        List<ArticuloEntity> articuloEntityList = articuloRepository.findAll();
        return articuloEntityMapper.toArticuloList(articuloEntityList);
    }
}
