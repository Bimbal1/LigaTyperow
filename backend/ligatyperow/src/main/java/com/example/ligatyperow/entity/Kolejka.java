package com.example.ligatyperow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "kolejka")
@Getter
@Setter
public class Kolejka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "data_kolejki")
    private Date dataKolejki;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKolejki")
    private Mecz[] mecze;

    @Column(name = "wyniki")
    private String wyniki;
}
