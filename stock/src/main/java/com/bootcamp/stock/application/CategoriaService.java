package com.bootcamp.stock.application;

import com.bootcamp.stock.domain.Categoria;
import com.bootcamp.stock.domain.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria save(@NotNull Categoria categoria) {
        Optional<Categoria> existingCategoria = categoriaRepository.findByName(categoria.getName());
        if (existingCategoria.isPresent()) {
            throw new RuntimeException("Category with this name already exists");
        }
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> findAll(String sortDirection, int page, int size) {
        // Example implementation with pagination and sorting
        if (sortDirection.equalsIgnoreCase("desc")) {
            return categoriaRepository.findAll(PageRequest.of(page, size, Sort.by("name").descending())).getContent();
        } else {
            return categoriaRepository.findAll(PageRequest.of(page, size, Sort.by("name"))).getContent();
        }
    }
}
