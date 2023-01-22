package com.mirestaurante.mirestaurante.dao;

import com.mirestaurante.mirestaurante.entity.ComentarioRest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "comentarioRest",path = "comentarios-rest")
public interface ComentarioRestRepository extends JpaRepository<ComentarioRest,Long> {
}
