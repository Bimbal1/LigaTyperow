package com.example.ligatyperow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "typy")
@Getter
@Setter
public class Typy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "kolejka_id")
    private int idKolejki;

    @Column(name = "id_user")
    private int idUser;

    @Column(name = "typy")
    private String typy;

    @Column(name = "punkty")
    private int punkty;
}
