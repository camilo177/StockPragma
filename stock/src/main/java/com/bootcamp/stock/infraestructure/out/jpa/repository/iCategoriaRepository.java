package com.bootcamp.stock.infraestructure.out.jpa.repository;

import com.bootcamp.stock.infraestructure.out.jpa.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface iCategoriaRepository extends JpaRepository<CategoriaEntity, Long> {

    Optional<CategoriaEntity> findByName(String name);

    //void deleteByName(String name);
}
