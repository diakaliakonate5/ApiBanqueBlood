package com.banqueBlood.BanqueBlood.controller;
import com.banqueBlood.BanqueBlood.Services.DonneurService;
import com.banqueBlood.BanqueBlood.model.Donneur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/Donneur")
public class DonneurController {
    @Autowired
    DonneurService donneurService;
    @PostMapping("/Ajout")
    Donneur Ajout(@RequestBody Donneur donneur){
        return  donneurService.ajoutDonneur(donneur);

    }
    @GetMapping("/listDonneur")
    List<Donneur> listDonneur()                  {
        return donneurService.listDonneur();
    }
    @GetMapping("/ById/{id}")
    Donneur Donneurbyid(@PathVariable("id") Long id){
        return  donneurService.afficherbyid(id);
    }
    @DeleteMapping("/suprimerDonneur/{id}")
    void supprimerDonneur(@PathVariable("id") Long id){
        donneurService.suprimer(id);
    }
    @PutMapping("/modifierDonneur/{id}")
   Donneur modifierDonneur(@PathVariable("id")Long id, @RequestBody Donneur donneur){
        return donneurService.modifier(donneur, id);
    }

    @GetMapping("/login?telephone={telephone}&password={password}")
    public Optional<Donneur> login (@RequestParam int telephone, @RequestParam String password){
        return  donneurService.login(telephone, password);
    }
}
