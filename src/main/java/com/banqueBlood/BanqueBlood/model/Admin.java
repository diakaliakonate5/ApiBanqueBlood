package com.banqueBlood.BanqueBlood.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @OneToMany(mappedBy = "admin")
    @JsonIgnore
    private List<Donneur> donneur;

    @OneToMany(mappedBy = "admin")
    @JsonIgnore
    private List<Patient> patient;

}
