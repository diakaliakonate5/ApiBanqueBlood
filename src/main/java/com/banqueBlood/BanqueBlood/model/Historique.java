package com.banqueBlood.BanqueBlood.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Data
@Entity
public class Historique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDate date = LocalDate.now();
    private LocalTime heure = LocalTime.now();



    @Column(nullable = false)
    private  String  lieu;
    @Column(nullable = false)
    private Boolean status;

    @OneToMany(mappedBy = "historique")
    @JsonIgnore
    private List<Donneur> donneur;

    @OneToMany(mappedBy = "historique")
    @JsonIgnore
    private  List<Patient> patient;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @OneToOne
    private BanqueSang banqueSang;


}
