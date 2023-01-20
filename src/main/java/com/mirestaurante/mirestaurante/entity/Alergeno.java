package com.mirestaurante.mirestaurante.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "alergeno")
@Getter
@Setter
public class Alergeno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "alergeno")
    private String alergeno;

    @ManyToOne
    @JoinColumn(name = "plato_id", nullable = false)
    private PlatoRestaurante platoRestaurante;
}
