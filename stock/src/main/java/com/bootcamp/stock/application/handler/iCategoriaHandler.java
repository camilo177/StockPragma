package com.bootcamp.stock.application.handler;

import com.bootcamp.stock.application.dto.CategoriaRequest;
import com.bootcamp.stock.application.dto.CategoriaResponse;
import java.util.List;

public interface iCategoriaHandler {

    // Create a new category
    CategoriaResponse createCategoria(CategoriaRequest categoriaRequest);

    // Update an existing category
    CategoriaResponse updateCategoria(Long id, CategoriaRequest categoriaRequest);

    // Get a category by its ID
    CategoriaResponse getCategoriaById(Long id);

    // List all categories with optional sorting and pagination
    List<CategoriaResponse> listCategorias(int page, int size, String sortDirection, String sortBy);

    // Delete a category by its ID
    void deleteCategoria(Long id);
}
