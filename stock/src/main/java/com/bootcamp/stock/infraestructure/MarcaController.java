package com.bootcamp.stock.infraestructure;

import com.bootcamp.stock.application.MarcaService;
import com.bootcamp.stock.domain.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    private final MarcaService marcaService;

    @Autowired
    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @PostMapping
    public ResponseEntity<Marca> createMarca(@RequestBody Marca marca) {
        Marca createdMarca = marcaService.createMarca(marca);
        return ResponseEntity.ok(createdMarca);
    }

    @GetMapping
    public ResponseEntity<List<Marca>> listMarcas(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String sort) {
        List<Marca> marcas = marcaService.listMarcas(page, size, sort);
        return ResponseEntity.ok(marcas);
    }
}