package com.mirestaurante.mirestaurante.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "img_plato")
@Getter
@Setter


public class ImgPlato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name= "imagen")
    private String imagen;

    @ManyToOne
    @JoinColumn(name = "plato_id",nullable = false)
    private PlatoRestaurante platoRestaurante;

}