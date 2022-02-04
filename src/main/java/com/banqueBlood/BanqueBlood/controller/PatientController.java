package com.banqueBlood.BanqueBlood.controller;

import com.banqueBlood.BanqueBlood.Services.DonneurService;
import com.banqueBlood.BanqueBlood.Services.PatientService;
import com.banqueBlood.BanqueBlood.model.Donneur;
import com.banqueBlood.BanqueBlood.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Patient")
public class PatientController {
    @Autowired
    PatientService  patientService;
    @PostMapping("/Ajout")
    Patient Ajout(@RequestBody Patient patient){
        return  patientService.ajoutPatient(patient);

    }
    @GetMapping("/listPatient")
    List<Patient> listPatient()                  {
        return patientService.listPatient();
    }
    @GetMapping("/ById/{id}")
    Patient Patientbyid(@PathVariable("id") Long id){
        return  patientService.afficherbyid(id);
    }
    @DeleteMapping("/suprimerPatient/{id}")
    void supprimerPatient(@PathVariable("id") Long id){
        patientService.suprimer(id);
    }
    @PutMapping("/modifierPatient/{id}")
    Patient modifierPatient(@PathVariable("id")Long id, @RequestBody Patient patient){
        return patientService.modifier(patient, id);
    }

}
