package com.bootcamp.stock.infraestructure.input.rest;

import com.bootcamp.stock.application.dto.ArticuloRequest;
import com.bootcamp.stock.application.dto.ArticuloResponse;
import com.bootcamp.stock.application.handler.iArticuloHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulos")
@RequiredArgsConstructor
public class ArticuloRestController {

    private final iArticuloHandler articuloHandler;

    @Operation(summary = "Create a new Articulo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Articulo created"),
            @ApiResponse(responseCode = "409", description = "Articulo already exists")
    })
    @PostMapping
    public ResponseEntity<Void> createArticulo(@RequestBody ArticuloRequest articuloRequest) {
        articuloHandler.saveArticuloInSystem(articuloRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Operation(summary = "List all Articulos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All articulos returned"),
            @ApiResponse(responseCode = "404", description = "No data found")
    })
    @GetMapping
    public ResponseEntity<List<ArticuloResponse>> listArticulos(
            @RequestParam(defaultValue = "asc") String sortDirection,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        List<ArticuloResponse> articulos = articuloHandler.listArticulos();
        return ResponseEntity.ok(articulos);
    }
}
