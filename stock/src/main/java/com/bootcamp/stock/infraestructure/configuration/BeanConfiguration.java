package com.bootcamp.stock.infraestructure.configuration;

import com.bootcamp.stock.domain.api.iCategoriaServicePort;
import com.bootcamp.stock.domain.api.iMarcaServicePort;
import com.bootcamp.stock.domain.spi.iCategoriaPersistencePort;
import com.bootcamp.stock.domain.spi.iMarcaPersistencePort;
import com.bootcamp.stock.domain.usecase.CategoriaUseCase;
import com.bootcamp.stock.domain.usecase.MarcaUseCase;
import com.bootcamp.stock.infraestructure.out.jpa.adapter.CategoriaJpaAdapter;
import com.bootcamp.stock.infraestructure.out.jpa.adapter.MarcaJpaAdapter;
import com.bootcamp.stock.infraestructure.out.jpa.mapper.CategoriaEntityMapper;
import com.bootcamp.stock.infraestructure.out.jpa.mapper.MarcaEntityMapper;
import com.bootcamp.stock.infraestructure.out.jpa.repository.iCategoriaRepository;
import com.bootcamp.stock.infraestructure.out.jpa.repository.iMarcaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final iCategoriaRepository categoriaRepository;
    private final CategoriaEntityMapper categoriaEntityMapper;
    private final iMarcaRepository marcaRepository;
    private final MarcaEntityMapper marcaEntityMapper;

    @Bean
    public iCategoriaPersistencePort categoriaPersistencePort() {
        return new CategoriaJpaAdapter(categoriaRepository, categoriaEntityMapper);
    }

    @Bean
    public iMarcaPersistencePort marcaPersistencePort() {
        return new MarcaJpaAdapter(marcaRepository, marcaEntityMapper);
    }

    @Bean
    public iCategoriaServicePort categoriaServicePort() {
        return new CategoriaUseCase(categoriaPersistencePort());
    }

    @Bean
    public iMarcaServicePort marcaServicePort() {
        return new MarcaUseCase(marcaPersistencePort());
    }
}
