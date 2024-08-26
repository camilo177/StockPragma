package com.bootcamp.stock.infraestructure.input.rest;

import com.bootcamp.stock.application.dto.CategoriaRequest;
import com.bootcamp.stock.application.dto.CategoriaResponse;
import com.bootcamp.stock.application.handler.iCategoriaHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor
public class CategoriaRestController {

    private final iCategoriaHandler categoriaHandler;

    @Operation(summary = "Create a new categoria")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Categoria created"),
            @ApiResponse(responseCode = "409", description = "Categoria already exists")
    })
    @PostMapping
    public ResponseEntity<Void> createCategoria(@RequestBody CategoriaRequest categoriaRequest) {
        categoriaHandler.saveCategoriaInSystem(categoriaRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Operation(summary = "List all categorias")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All categorias returned"),
            @ApiResponse(responseCode = "404", description = "No data found")
    })
    @GetMapping
    public ResponseEntity<List<CategoriaResponse>> listCategorias(
            @RequestParam(defaultValue = "asc") String sortDirection,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        List<CategoriaResponse> categorias = categoriaHandler.listCategorias();
        return ResponseEntity.ok(categorias);
    }
}
