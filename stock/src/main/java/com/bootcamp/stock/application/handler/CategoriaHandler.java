package com.bootcamp.stock.application.handler;

import com.bootcamp.stock.application.dto.CategoriaRequest;
import com.bootcamp.stock.application.dto.CategoriaResponse;
import com.bootcamp.stock.application.mapper.CategoriaRequestMapper;
import com.bootcamp.stock.application.mapper.CategoriaResponseMapper;
import com.bootcamp.stock.domain.api.iCategoriaServicePort;
import com.bootcamp.stock.domain.model.Categoria;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoriaHandler implements iCategoriaHandler {

    private final iCategoriaServicePort categoriaServicePort;
    private final CategoriaRequestMapper categoriaRequestMapper;
    private final CategoriaResponseMapper categoriaResponseMapper;

    @Override
    public void saveCategoriaInSystem(CategoriaRequest categoriaRequest) {
        // Map the CategoriaRequest DTO to the Categoria entity
        Categoria categoria = categoriaRequestMapper.toCategoria(categoriaRequest);
        // Save the Categoria entity using the service port
        categoriaServicePort.saveCategoria(categoria);
    }

    @Override
    public CategoriaResponse getCategoriaById(Long id) {
        // Retrieve the Categoria entity by ID and map it to the CategoriaResponse DTO
        Categoria categoria = categoriaServicePort.findAll().stream()
                .filter(cat -> cat.getId().equals(id))
                .findFirst()
                .orElse(null);
        return categoriaResponseMapper.toCategoriaResponse(categoria);
    }

    @Override
    public List<CategoriaResponse> listCategorias() {
        // Retrieve all Categoria entities and map them to CategoriaResponse DTOs
        List<Categoria> categorias = categoriaServicePort.findAll();
        return categorias.stream()
                .map(categoriaResponseMapper::toCategoriaResponse)
                .toList();
    }
}
