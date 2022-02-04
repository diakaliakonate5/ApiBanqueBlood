package com.banqueBlood.BanqueBlood.repositories;

import com.banqueBlood.BanqueBlood.model.Admin;

import com.banqueBlood.BanqueBlood.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findByTelephoneAndPassword(int telephone, String password);
}

