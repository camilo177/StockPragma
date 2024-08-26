package com.bootcamp.stock.application.handler;

import com.bootcamp.stock.application.dto.MarcaRequest;
import com.bootcamp.stock.application.dto.MarcaResponse;
import java.util.List;

public interface iMarcaHandler {

    // Create a new brand
    MarcaResponse saveMarca(MarcaRequest marcaRequest);
}
