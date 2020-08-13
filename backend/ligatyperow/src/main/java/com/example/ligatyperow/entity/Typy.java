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

    @ManyToOne
    @JoinColumn(name = "kolejka_id", nullable = false)
    private Kolejka kolejka;

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "typy")
    private String typy;

    @Column(name = "punkty")
    private int punkty;

    public void setPunkty() {
        char[] typyChars = this.typy.toCharArray();
        char[] wynikiChars = this.kolejka.getWyniki().toCharArray();
        int punkty = 0;
        for(int i = 0; i < typyChars.length; i++) {
            if(typyChars[i] == wynikiChars[i]) {
                punkty++;
            }
        }
        this.punkty = punkty;
    }

    public int getPunkty() {
        return this.punkty;
    }
}
