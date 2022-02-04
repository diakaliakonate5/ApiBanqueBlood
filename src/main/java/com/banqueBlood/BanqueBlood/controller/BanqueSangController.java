package com.banqueBlood.BanqueBlood.controller;

import com.banqueBlood.BanqueBlood.Services.BanqueSangService;
import com.banqueBlood.BanqueBlood.Services.PatientService;
import com.banqueBlood.BanqueBlood.model.BanqueSang;
import com.banqueBlood.BanqueBlood.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/BanqueSang")
public class BanqueSangController {
    @Autowired
    BanqueSangService banqueSangService;
    @PostMapping("/Ajout")
    BanqueSang Ajout(@RequestBody BanqueSang banqueSang){
        return  banqueSangService.ajoutBanque(banqueSang);

    }
    @GetMapping("/listBanque")
    List<BanqueSang> listBanque()                  {
        return banqueSangService.listBanque();
    }
    @GetMapping("/ById/{id}")
    BanqueSang Banquebyid(@PathVariable("id") Long id){
        return  banqueSangService.afficherbyid(id);
    }
    @DeleteMapping("/suprimerPatient/{id}")
    void supprimerBanque(@PathVariable("id") Long id){
        banqueSangService.suprimer(id);
    }
    @PutMapping("/modifierBanque/{id}")
    BanqueSang modifierBanque(@PathVariable("id")Long id, @RequestBody BanqueSang banqueSang){
        return banqueSangService.modifier(banqueSang, id);
    }

}
