package com.bootcamp.stock.application.handler;

import com.bootcamp.stock.application.dto.ArticuloRequest;
import com.bootcamp.stock.application.dto.ArticuloResponse;
import com.bootcamp.stock.application.dto.CategoriaRequest;
import com.bootcamp.stock.application.dto.CategoriaResponse;
import com.bootcamp.stock.application.mapper.ArticuloRequestMapper;
import com.bootcamp.stock.application.mapper.ArticuloResponseMapper;

import com.bootcamp.stock.domain.api.iArticuloServicePort;
import com.bootcamp.stock.domain.model.Articulo;
import com.bootcamp.stock.domain.model.Categoria;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ArticuloHandler implements iArticuloHandler {

    private final iArticuloServicePort articuloServicePort;
    private final ArticuloRequestMapper articuloRequestMapper;
    private final ArticuloResponseMapper articuloResponseMapper;

    @Override
    public void saveArticuloInSystem(ArticuloRequest articuloRequest) {
        // Map the ArticuloRequest DTO to the articulo entity
        Articulo articulo = articuloRequestMapper.toArticulo(articuloRequest);
        // Save the articulo entity using the service port
        articuloServicePort.saveArticulo(articulo);
    }

    @Override
    public ArticuloResponse getArticuloById(Long id) {
        // Retrieve the Articulo entity by ID and map it to the ArticuloResponse DTO
        Articulo articulo = articuloServicePort.findAll().stream()
                .filter(cat -> cat.getId().equals(id))
                .findFirst()
                .orElse(null);
        return articuloResponseMapper.toArticuloResponse(articulo);    }

    @Override
    public List<ArticuloResponse> listArticulos() {
        // Retrieve all Articulo entities and map them to ArticuloResponse DTOs
        List<Articulo> articulos = articuloServicePort.findAll();
        return articulos.stream()
                .map(articuloResponseMapper::toArticuloResponse)
                .toList();    }
}
