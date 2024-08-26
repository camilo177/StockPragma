package com.bootcamp.stock.infraestructure.out.jpa.repository;

import com.bootcamp.stock.infraestructure.out.jpa.entity.MarcaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface iMarcaRepository extends JpaRepository<MarcaEntity, Long> {

    Optional<MarcaEntity> findByName(String name);

    //void deleteByName(String name);
}
