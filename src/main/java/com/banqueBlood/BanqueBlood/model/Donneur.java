package com.banqueBlood.BanqueBlood.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Donneur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    @Column(nullable = false)
    private String nomComplet;
    @Column(nullable = false)
    private String adresse;

    @Column(nullable = false)
    private int telephone;
    @Column(nullable = false)
    private  String email;
    @Column(nullable = false)
    private  String password;

    @ManyToOne
    private  Historique historique;
    @ManyToOne
    private  Admin admin;
    @OneToMany
    private List<Quarantaine> quarantaine;
    @ManyToOne
    private GroupeSanguin groupeSanguin;

}
