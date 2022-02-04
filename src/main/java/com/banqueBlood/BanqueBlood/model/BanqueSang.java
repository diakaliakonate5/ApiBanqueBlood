package com.banqueBlood.BanqueBlood.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class BanqueSang {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String adresse;

    @Column(nullable = false)
    private int telephone;
    @Column(nullable = false)
    private  String email;


    @OneToMany
    private List<Historique> historique;



}
