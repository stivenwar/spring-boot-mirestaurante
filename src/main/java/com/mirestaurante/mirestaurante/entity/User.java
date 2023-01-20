package com.mirestaurante.mirestaurante.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "token")
    private String token;

    @Column(name = "date_create")
    @CreationTimestamp
    private Date dateCreate;

    @Column(name = "date_update")
    @CreationTimestamp
    private Date dateUpdate;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Cliente cliente;
}
