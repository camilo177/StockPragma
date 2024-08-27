package com.bootcamp.stock.application.handler;

import com.bootcamp.stock.application.dto.CategoriaResponse;
import com.bootcamp.stock.application.dto.MarcaRequest;
import com.bootcamp.stock.application.dto.MarcaResponse;
import java.util.List;

public interface iMarcaHandler {

    // Create a new brand
    MarcaResponse saveMarca(MarcaRequest marcaRequest);

    // Get a category by its ID
    MarcaResponse getMarcaById(Long id);

    // List all categories with optional sorting and pagination
    List<MarcaResponse> listMarcas();
}
