package com.mirestaurante.mirestaurante.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name= "cliente")
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "dni")
    private String dni;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Set<Pedido> pedido;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Set<PlatoFav> platoFav;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Set<RestauranteFav> restauranteFav;

    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Set<Direccion> direccion;

}
