package com.mirestaurante.mirestaurante.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JsonBackReference(value = "imgPlato")
    private PlatoRestaurante platoRestaurante;

}