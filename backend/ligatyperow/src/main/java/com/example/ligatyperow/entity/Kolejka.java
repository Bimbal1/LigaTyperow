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
    private long id;

    @Column(name = "data_kolejki")
    private Date dataKolejki;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKolejki")
    private Mecz[] mecze;

    @Column(name = "wyniki")
    private String wyniki;

//    public void setWyniki(String wyniki) {
//        StringBuilder sb = new StringBuilder();
//        for(Mecz mecz : mecze) {
//            String[] temp = mecz.getWynik().split(":");
//            int a = Integer.parseInt(temp[0]);
//            int b = Integer.parseInt(temp[1]);
//            if(a > b) {
//                sb.append('1');
//            } else if(a == b) {
//                sb.append('x');
//            } else {
//                sb.append('2');
//            }
//        }
//    }
}
