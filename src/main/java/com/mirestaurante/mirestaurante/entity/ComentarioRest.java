package com.mirestaurante.mirestaurante.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

    @Entity
    @Table(name = "comentario_rest")
    @Getter
    @Setter
    public class ComentarioRest {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "plato_id")
        private Long platoId;

        @Column(name = "email")
        private String email;

        @Column(name = "comentario")
        private String comentario;

        @Column(name = "puntuacion")
        private int puntuacion;

        @ManyToOne
        @JoinColumn(name = "restaurante_id", nullable = false)
        private Restaurante restaurante;
    }
