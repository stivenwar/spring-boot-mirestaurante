package com.mirestaurante.mirestaurante.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "direccion")
@Getter
@Setter


public class Extra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "coste")
    private BigDecimal coste;

    @ManyToOne
    @JoinColumn(name = "plato_id", nullable = false)
    private PlatoRestaurante platoRestaurante;


}
