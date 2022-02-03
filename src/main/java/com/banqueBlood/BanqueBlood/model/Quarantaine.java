package com.banqueBlood.BanqueBlood.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Quarantaine {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    @Column(nullable = false)
    private String nomComplet;
    @Column(nullable = false)
    private String lieu;

    private LocalDate datedebut = LocalDate.now();


    @ManyToOne
    private  Donneur donneur;





}
