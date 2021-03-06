package com.example.ligatyperow.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mecz")
@Data
public class Mecz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "kolejka_id")
    private Kolejka kolejka;

    @Column(name = "host_team")
    private String hostTeam;

    @Column(name = "away_team")
    private String awayTeam;

    @Column(name = "data_meczu")
    private Date dataMeczu;

    @Column(name = "wynik")
    private String wynik;

    public String getWynik() {
        return this.wynik;
    }

    public Date getDataMeczu() {
        return this.dataMeczu;
    }
}
