package com.bootcamp.stock.infraestructure.input.rest;

import com.bootcamp.stock.application.dto.MarcaRequest;
import com.bootcamp.stock.application.dto.MarcaResponse;
import com.bootcamp.stock.application.handler.iMarcaHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/marcas")
@RequiredArgsConstructor
public class MarcaRestController {

    private final iMarcaHandler marcaHandler;

    @Operation(summary = "Create a new marca")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Marca created"),
            @ApiResponse(responseCode = "409", description = "Marca already exists")
    })
    @PostMapping
    public ResponseEntity<MarcaResponse> createMarca(@RequestBody MarcaRequest marcaRequest) {
        MarcaResponse savedMarca = marcaHandler.saveMarca(marcaRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMarca);
    }
}
