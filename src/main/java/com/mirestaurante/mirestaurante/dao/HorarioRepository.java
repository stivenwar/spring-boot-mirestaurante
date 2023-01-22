package com.mirestaurante.mirestaurante.dao;

import com.mirestaurante.mirestaurante.entity.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface HorarioRepository extends JpaRepository<Horario,Long> {
}
