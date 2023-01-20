package com.mirestaurante.mirestaurante.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "plato_pedido")
@Getter
@Setter
public class PlatoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    @JsonBackReference
    private Pedido pedido;

    @OneToOne
    @JoinColumn(name = "plato_id", referencedColumnName = "id")
    private PlatoRestaurante platoRestaurante;

    @Column(name = "cantidad" )
    private int cantidad;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "platoPedido")
    private Set<ExtraPedido> extraPedido;

}
