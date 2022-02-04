package com.banqueBlood.BanqueBlood.controller;

import com.banqueBlood.BanqueBlood.Services.GroupeSanguinService;
import com.banqueBlood.BanqueBlood.Services.PatientService;
import com.banqueBlood.BanqueBlood.model.GroupeSanguin;
import com.banqueBlood.BanqueBlood.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class GroupeSanguinControler {
    @Autowired
    GroupeSanguinService groupeSanguinService;
    @PostMapping("/Ajout")
    GroupeSanguin Ajout(@RequestBody GroupeSanguin groupeSanguin){
        return  groupeSanguinService.ajoutGroupe (groupeSanguin);

    }
    @GetMapping("/listGroupe")
    List<GroupeSanguin> listGroupe()                  {
        return groupeSanguinService.listGroupe();
    }
    @GetMapping("/ById/{id}")
    GroupeSanguin Groupebyid(@PathVariable("id") Long id){
        return  groupeSanguinService.afficherbyid(id);
    }
    @DeleteMapping("/suprimerGroupe/{id}")
    void supprimerGroupe(@PathVariable("id") Long id){
        groupeSanguinService.suprimer(id);
    }
    @PutMapping("/modifierGroupe/{id}")
    GroupeSanguin modifierGroupe(@PathVariable("id")Long id, @RequestBody GroupeSanguin groupeSanguin){
        return groupeSanguinService.modifier(groupeSanguin, id);
    }
}
