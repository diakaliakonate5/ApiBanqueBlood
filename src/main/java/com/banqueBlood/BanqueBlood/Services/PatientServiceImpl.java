package com.banqueBlood.BanqueBlood.Services;

import com.banqueBlood.BanqueBlood.model.Patient;
import com.banqueBlood.BanqueBlood.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepository patientRepository;
    @Override
    public Patient ajoutPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> listPatient() {
        return patientRepository.findAll();
    }

    @Override
    public Patient afficherbyid(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public Patient modifier(Patient patient, Long id) {
        Patient patient1=patientRepository.findById(id).get();
        patient1.setNomComplet(patient.getNomComplet());
        patient1.setPassword(patient.getPassword());
        patient1.setTelephone(patient.getTelephone());
        patient1.setAdresse(patient.getAdresse());
        patient1.setEmail(patient.getEmail());
        return patientRepository.save(patient1);
    }

    @Override
    public void suprimer(Long id) {
        patientRepository.deleteById(id);

    }
}
