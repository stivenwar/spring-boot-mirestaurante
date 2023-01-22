package com.mirestaurante.mirestaurante.dao;

import com.mirestaurante.mirestaurante.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
