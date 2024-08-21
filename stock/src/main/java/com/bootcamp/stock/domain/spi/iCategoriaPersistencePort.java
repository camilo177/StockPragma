package com.bootcamp.stock.domain.spi;

import com.bootcamp.stock.domain.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface iCategoriaPersistencePort extends JpaRepository<Categoria, Long> {
    Optional<Categoria> findByName(String name);
}