package com.mirestaurante.mirestaurante.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name= "categoria")
@Getter
@Setter
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "categoria")
    private String categoria;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private Set<Restaurante> restaurante;
}
