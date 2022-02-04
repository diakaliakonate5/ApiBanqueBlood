package com.banqueBlood.BanqueBlood.Services;
import com.banqueBlood.BanqueBlood.model.Patient;
import java.util.List;
public interface PatientService {
    public Patient ajoutPatient(Patient patient);
    List<Patient> listPatient();
    Patient afficherbyid(Long id);
    Patient modifier(Patient patient , Long id);
    void suprimer(Long id);
}
