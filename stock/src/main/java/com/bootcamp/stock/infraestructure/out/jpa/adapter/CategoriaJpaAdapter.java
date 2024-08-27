package com.bootcamp.stock.infraestructure.out.jpa.adapter;

import com.bootcamp.stock.domain.model.Categoria;
import com.bootcamp.stock.domain.spi.iCategoriaPersistencePort;
import com.bootcamp.stock.infraestructure.out.jpa.entity.CategoriaEntity;
import com.bootcamp.stock.infraestructure.out.jpa.mapper.CategoriaEntityMapper;
import com.bootcamp.stock.infraestructure.out.jpa.repository.iCategoriaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class CategoriaJpaAdapter implements iCategoriaPersistencePort {

    private final iCategoriaRepository categoriaRepository;
    private final CategoriaEntityMapper categoriaEntityMapper;

    @Override
    public void saveCategoria(Categoria categoria) {
        CategoriaEntity categoriaEntity = categoriaEntityMapper.toEntity(categoria);
        categoriaRepository.save(categoriaEntity);
    }

    @Override
    public Optional<Categoria> findByName(String name) {
        return categoriaRepository.findByName(name)
                .map(categoriaEntityMapper::toCategoria);
    }

    @Override
    public List<Categoria> findAll() {
        List<CategoriaEntity> categoriaEntityList = categoriaRepository.findAll();
        return categoriaEntityMapper.toCategoriaList(categoriaEntityList);
    }
}
