package com.mirestaurante.mirestaurante.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "pedido")
@Getter
@Setter


public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name= "estado")
    private String estado;

    @Column(name= "localizador")
    private String localizador;

    @Column(name= "coste_transporte")
    private BigDecimal costeTransporte;

    @Column(name= "precio_total")
    private BigDecimal precioTotal;

    @Column(name= "fecha")
    private Date fecha;

    @Column(name= "cupon_descuento")
    private String cuponDescuento;

    @ManyToOne
    @JoinColumn(name = "restaurante_id",nullable = false)
    @JsonBackReference(value="pedidosRestaurante")
    private Restaurante restaurante;

    @ManyToOne
    @JoinColumn(name = "cliente_id",nullable = false)
    @JsonBackReference(value="pedidosCliente")
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pedido")
    @JsonManagedReference(value = "platosPedido")
    private Set<PlatoPedido> platoPedido;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    @JsonManagedReference(value="direccionesPedido")
    private Direccion direccion;

}
