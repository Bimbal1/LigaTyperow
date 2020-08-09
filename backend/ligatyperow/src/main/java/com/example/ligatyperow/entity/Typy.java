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
    private long id;

    @JoinColumn(name = "kolejka_id")
    private long idKolejki;

    @JoinColumn(name = "id_user", nullable = false)
    @ManyToOne()
    private long idUser;

    @Column(name = "typy")
    private String typy;

    @Column(name = "punkty")
    private int punkty;
}
