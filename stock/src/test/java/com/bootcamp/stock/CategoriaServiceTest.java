package com.bootcamp.stock;

import com.bootcamp.stock.domain.model.Categoria;
import com.bootcamp.stock.domain.api.iCategoriaServicePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CategoriaServiceTest {

    @Mock
    private iCategoriaServicePort iCategoriaServicePort;

    @InjectMocks
    private CategoriaService categoriaService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateCategoria() {
        Categoria categoria = new Categoria();
        categoria.setId(1L);
        categoria.setName("Electronics");
        categoria.setDescription("All electronic items");

        when(icategoriaS.save(any(Categoria.class))).thenReturn(categoria);

        Categoria createdCategoria = categoriaService.save(categoria);

        assertEquals("Electronics", createdCategoria.getName());
        assertEquals("All electronic items", createdCategoria.getDescription());
    }
}


