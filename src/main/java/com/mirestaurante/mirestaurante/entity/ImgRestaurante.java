package com.mirestaurante.mirestaurante.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "img_restaurante")
@Getter
@Setter


public class ImgRestaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name= "imagen")
    private String imagen;

    @ManyToOne
    @JoinColumn(name = "restaurante_id",nullable = false)
    private Restaurante platoRestaurante;

}