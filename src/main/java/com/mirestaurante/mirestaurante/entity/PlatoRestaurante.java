package com.mirestaurante.mirestaurante.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "plato_restaurante")
@Getter
@Setter


public class PlatoRestaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio_base")
    private BigDecimal precioBase;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "platoRestaurante")
    private Set<Alergeno> alergenos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "platoRestaurante")
    private Set<ImgPlato> imgPlato;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "platoRestaurante")
    private Set<Extra> extras;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "platoRestaurante")
    private Set<ComentarioPlato> comentarioPlato;

    @OneToOne
    @PrimaryKeyJoinColumn
    private PlatoFav platoFav;

    @OneToOne
    @PrimaryKeyJoinColumn
    private PlatoPedido platoPedido;

    @ManyToOne
    @JoinColumn(name = "restaurante_id", nullable = false)
    private Restaurante restaurante;


}
