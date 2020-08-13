package com.example.ligatyperow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "login")
    private String login;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "pkt")
    private int pkt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Typy> historiaTypow;

    public void setPkt() {
        int count = 0;
        for (Typy typ : historiaTypow) {
            count += typ.getPunkty();
        }
    }
}
