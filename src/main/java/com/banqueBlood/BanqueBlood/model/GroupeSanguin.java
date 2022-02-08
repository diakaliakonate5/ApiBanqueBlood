package com.banqueBlood.BanqueBlood.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class GroupeSanguin  {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Donneur> getDonneur() {
        return donneur;
    }

    public void setDonneur(List<Donneur> donneur) {
        this.donneur = donneur;
    }

    public List<Patient> getPatient() {
        return patient;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    public GroupeSanguin(String type, List<Donneur> donneur, List<Patient> patient) {
        this.type = type;
        this.donneur = donneur;
        this.patient = patient;

    }
}
