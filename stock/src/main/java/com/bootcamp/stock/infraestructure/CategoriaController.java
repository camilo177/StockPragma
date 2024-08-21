package com.bootcamp.stock.infraestructure;

import com.bootcamp.stock.application.CategoriaService;
import com.bootcamp.stock.domain.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<Categoria> createCategoria(@Valid @RequestBody Categoria categoria) {
        Categoria savedCategoria = categoriaService.save(categoria);
        return ResponseEntity.ok(savedCategoria);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listCategorias(
            @RequestParam(defaultValue = "asc") String sortDirection,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        List<Categoria> categorias = categoriaService.findAll(sortDirection, page, size);
        return ResponseEntity.ok(categorias);
    }
}
