package com.banqueBlood.BanqueBlood.repositories;

import com.banqueBlood.BanqueBlood.model.Admin;
import com.banqueBlood.BanqueBlood.model.Donneur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface DonneurRepository extends JpaRepository<Donneur, Long> {

    Donneur findByTelephoneAndPassword(String telephone, String password);
}
