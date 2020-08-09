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

    @Column(name = "kolejka_id")
    private long idKolejki;

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "typy")
    private String typy;

    @Column(name = "punkty")
    private int punkty;
}
