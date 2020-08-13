package com.example.ligatyperow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "kolejka")
@Getter
@Setter
public class Kolejka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "data_kolejki")
    private Date dataKolejki;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kolejka")
    private List<Mecz> mecze;

    @Column(name = "wyniki")
    private String wyniki;

    public void setMecze(List<Mecz> mecze) {
        Collections.sort(mecze, new Comparator<Mecz>() {
            @Override
            public int compare(Mecz o1, Mecz o2) {
                return o1.getDataMeczu().compareTo(o2.getDataMeczu());
            }
        });
        this.mecze = mecze;
    }

    public void setWyniki(List<Mecz> mecze) {
        StringBuilder sb = new StringBuilder();
        for(Mecz mecz : mecze) {
            String[] temp = mecz.getWynik().split(":");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            if(a > b) {
                sb.append('1');
            } else if(a == b) {
                sb.append('x');
            } else {
                sb.append('2');
            }
        }
    }

    public void setDataKolejki(List<Mecz> mecze) {
        this.dataKolejki = mecze.get(0).getDataMeczu();
    }

    public String getWyniki() {
        return this.wyniki;
    }
}
