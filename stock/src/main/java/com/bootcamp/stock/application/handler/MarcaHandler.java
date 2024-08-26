package com.bootcamp.stock.application.handler;

import com.bootcamp.stock.application.dto.MarcaRequest;
import com.bootcamp.stock.application.dto.MarcaResponse;
import com.bootcamp.stock.application.mapper.MarcaRequestMapper;
import com.bootcamp.stock.application.mapper.MarcaResponseMapper;
import com.bootcamp.stock.domain.api.iMarcaServicePort;
import com.bootcamp.stock.domain.model.Marca;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class MarcaHandler implements iMarcaHandler {

    private final iMarcaServicePort marcaServicePort;
    private final MarcaRequestMapper marcaRequestMapper;
    private final MarcaResponseMapper marcaResponseMapper;

    @Override
    public MarcaResponse saveMarca(MarcaRequest marcaRequest) {
        // Convert MarcaRequest DTO to Marca entity
        Marca marca = marcaRequestMapper.toMarca(marcaRequest);

        // Save the Marca entity using the service port
        marcaServicePort.saveMarca(marca);

        // Convert the saved Marca entity to MarcaResponse DTO
        return marcaResponseMapper.toMarcaResponse(marca);
    }
}
