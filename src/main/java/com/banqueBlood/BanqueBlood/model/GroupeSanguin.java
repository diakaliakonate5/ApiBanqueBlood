package com.banqueBlood.BanqueBlood.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class GroupeSanguin{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    @Column(nullable = false)
    private String type;

    @OneToMany(mappedBy = "groupeSanguin")
    @JsonIgnore
    private List<Donneur> donneur;


    @OneToMany(mappedBy = "groupeSanguin")
    @JsonIgnore
    private  List<Patient> patient;



}
