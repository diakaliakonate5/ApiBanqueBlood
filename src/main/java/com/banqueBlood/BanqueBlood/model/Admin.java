package com.banqueBlood.BanqueBlood.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Admin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    @Column(nullable = false)
    private String nomComplet;

    @Column(nullable = false)
    private int telephone;
    @Column(nullable = false)
    private  String email;
    @Column(nullable = false)
    private  String login;
    @Column(nullable = false)
    private  String password;

    @OneToMany
    private List<Donneur> donneur;
    @OneToMany
    private List<Patient> patient;

}
