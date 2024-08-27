package com.bootcamp.stock.infraestructure.out.jpa.repository;

import com.bootcamp.stock.infraestructure.out.jpa.entity.ArticuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface iArticuloRepository extends JpaRepository<ArticuloEntity, Long> {

    Optional<ArticuloEntity> findByName(String name);

    //void deleteByName(String name);
}
