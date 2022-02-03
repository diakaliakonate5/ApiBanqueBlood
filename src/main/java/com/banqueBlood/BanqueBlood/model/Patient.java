package com.banqueBlood.BanqueBlood.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Patient {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    @Column(nullable = false)
    private String nomComplet;
    @Column(nullable = false)
    private String Adresse;

    @Column(nullable = false)
    private int telephone;
    @Column(nullable = false)
    private  String email;
    @Column(nullable = false)
    private  String password;
  @ManyToOne
private Historique historique;
  @ManyToOne
    private Admin admin;
  @OneToOne
    private  GroupeSanguin groupeSanguin;
}