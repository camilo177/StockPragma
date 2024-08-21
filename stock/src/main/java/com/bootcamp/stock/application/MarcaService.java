package com.bootcamp.stock.application;

import com.bootcamp.stock.domain.model.Marca;
import com.bootcamp.stock.domain.api.iMarcaServicePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {
    private final iMarcaServicePort marcaRepository;

    public MarcaService(iMarcaServicePort marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public Marca createMarca(Marca marca) {
        Optional<Marca> existingMarca = marcaRepository.findByName(marca.getName());
        if (existingMarca.isPresent()) {
            throw new IllegalArgumentException("Brand name already exists.");
        }
        return marcaRepository.save(marca);
    }

    public List<Marca> listMarcas(int page, int size, String sort) {
        return marcaRepository.findAll(page, size, sort);
    }
}