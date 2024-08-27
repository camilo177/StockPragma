package com.bootcamp.stock.domain.spi;

import com.bootcamp.stock.domain.model.Categoria;
import com.bootcamp.stock.domain.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface iCategoriaPersistencePort {
    void saveCategoria(Categoria categoria);
    Optional<Categoria> findByName(String name);
    List<Categoria> findAll();
}