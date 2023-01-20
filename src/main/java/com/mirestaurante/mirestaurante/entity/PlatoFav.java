package com.mirestaurante.mirestaurante.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "plato_fav")
@Getter
@Setter


public class PlatoFav {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "plato_id", referencedColumnName = "id")
    private PlatoRestaurante platoRestaurante;
}