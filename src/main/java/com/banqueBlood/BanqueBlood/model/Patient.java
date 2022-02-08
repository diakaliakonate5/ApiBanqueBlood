package com.banqueBlood.BanqueBlood.model;

import com.banqueBlood.BanqueBlood.Profile;
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
private Profile profile;
    @ManyToOne
    private Historique historique;

    @ManyToOne
    private Admin admin;

    @ManyToOne
    private  GroupeSanguin groupeSanguin;

}
