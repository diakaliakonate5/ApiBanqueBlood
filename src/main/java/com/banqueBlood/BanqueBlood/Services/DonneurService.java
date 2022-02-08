package com.banqueBlood.BanqueBlood.Services;

import com.banqueBlood.BanqueBlood.model.Donneur;

import java.util.List;
import java.util.Optional;

public interface DonneurService {
    public Donneur ajoutDonneur(Donneur donneur);
    List<Donneur> listDonneur();
    Donneur afficherbyid(Long id);
    Donneur modifier(Donneur donneur , Long id);
    void suprimer(Long id);
    Optional<Donneur> login(int telephone, String password);
}
