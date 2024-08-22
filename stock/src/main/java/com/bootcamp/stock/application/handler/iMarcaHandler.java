package com.bootcamp.stock.application.handler;

import com.bootcamp.stock.application.dto.MarcaRequest;
import com.bootcamp.stock.application.dto.MarcaResponse;
import java.util.List;

public interface iMarcaHandler {

    // Create a new brand
    MarcaResponse createMarca(MarcaRequest marcaRequest);

    // Update an existing brand
    MarcaResponse updateMarca(Long id, MarcaRequest marcaRequest);

    // Get a brand by its ID
    MarcaResponse getMarcaById(Long id);

    // List all brands with optional sorting and pagination
    List<MarcaResponse> listMarcas(int page, int size, String sortDirection, String sortBy);

    // Delete a brand by its ID
    void deleteMarca(Long id);
}
