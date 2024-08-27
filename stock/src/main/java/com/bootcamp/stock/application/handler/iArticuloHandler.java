package com.bootcamp.stock.application.handler;

import com.bootcamp.stock.application.dto.ArticuloRequest;
import com.bootcamp.stock.application.dto.ArticuloResponse;
import com.bootcamp.stock.application.dto.CategoriaRequest;
import com.bootcamp.stock.application.dto.CategoriaResponse;

import java.util.List;

public interface iArticuloHandler {

    // Create a new articulo
    void saveArticuloInSystem(ArticuloRequest articuloRequest);

    // Get a articulo by its ID
    ArticuloResponse getArticuloById(Long id);

    // List all categories with optional sorting and pagination
    List<ArticuloResponse> listArticulos();

}
