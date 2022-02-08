package com.banqueBlood.BanqueBlood.model;

import com.banqueBlood.BanqueBlood.Profile;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor

public class Patient  implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    @Column(nullable = false)
    private String nomComplet;
    @Column(nullable = false)
    private String adresse;
    private Profile profile;
    @Column(nullable = false)
    private String telephone;
    @Column(nullable = false)
    private  String email;
    @Column(nullable = false)
    private  String password;

    @OneToMany(mappedBy = "donneur")
    @JsonIgnore
    private  List<Historique> historique;
    @ManyToOne
    private  Admin admin;
    @OneToOne(mappedBy = "donneur")
    private Quarantaine quarantaine;
    @ManyToOne
    private GroupeSanguin groupeSanguin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Historique> getHistorique() {
        return historique;
    }

    public void setHistorique(List<Historique> historique) {
        this.historique = historique;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Quarantaine getQuarantaine() {
        return quarantaine;
    }

    public void setQuarantaine(Quarantaine quarantaine) {
        this.quarantaine = quarantaine;
    }

    public GroupeSanguin getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(GroupeSanguin groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }


}
