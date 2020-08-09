package com.example.ligatyperow.entity;

import javax.persistence.*;

@Entity
@Table(name = "table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "login")
    private String login;

    @Column(name = "email")
    private String email;

    @Column(name = "pkt")
    private int pkt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private Typy[] historiaTypow;
}
