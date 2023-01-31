package com.mirestaurante.mirestaurante.dao;

import com.mirestaurante.mirestaurante.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface RestauranteRepository extends JpaRepository<Restaurante,Long> {


}
