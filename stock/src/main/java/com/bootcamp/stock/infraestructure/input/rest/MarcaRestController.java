package com.bootcamp.stock.infraestructure.input.rest;

import com.bootcamp.stock.application.dto.CategoriaResponse;
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

import java.util.List;

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

    @Operation(summary = "List all Marcas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Marcas returned"),
            @ApiResponse(responseCode = "404", description = "No data found")
    })
    @GetMapping
    public ResponseEntity<List<MarcaResponse>> listMarcas(
            @RequestParam(defaultValue = "asc") String sortDirection,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        List<MarcaResponse> marcas = marcaHandler.listMarcas();
        return ResponseEntity.ok(marcas);
    }
}
