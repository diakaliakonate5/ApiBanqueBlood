package com.banqueBlood.BanqueBlood.Services;

import com.banqueBlood.BanqueBlood.model.Donneur;
import com.banqueBlood.BanqueBlood.repositories.DonneurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DonneurServiceImpl implements DonneurService {
    @Autowired
    DonneurRepository donneurRepository;

    @Override
    public Donneur ajoutDonneur(Donneur donneur) {
        return donneurRepository.save(donneur);
    }

    @Override
    public List<Donneur> listDonneur() {
        return donneurRepository.findAll();
    }

    @Override
    public Donneur afficherbyid(Long id) {
        return donneurRepository.findById(id).get();
    }

    @Override
    public Donneur modifier(Donneur donneur, Long id) {
        Donneur donneur1=donneurRepository.findById(id).get();
        donneur1.setNomComplet(donneur.getNomComplet());
        donneur1.setPassword(donneur.getPassword());
        donneur1.setTelephone(donneur.getTelephone());
        donneur1.setEmail(donneur.getEmail());
        donneur1.setAdresse(donneur.getAdresse());

        return donneurRepository.save(donneur1);
    }

    @Override
    public void suprimer(Long id) {
        donneurRepository.deleteById(id);
    }

}
