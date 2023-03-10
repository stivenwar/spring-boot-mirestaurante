package com.mirestaurante.mirestaurante.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class RestauranteFav {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @JsonBackReference(value="restaurantesFav")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "restaurante_id", referencedColumnName = "id")
    private Restaurante restaurante;

}