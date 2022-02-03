package com.banqueBlood.BanqueBlood.controller;

import com.banqueBlood.BanqueBlood.Services.AdminService;
import com.banqueBlood.BanqueBlood.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping("/Ajout")
    Admin Ajout(@RequestBody Admin admin){
        return  adminService.ajoutAdmin(admin);
    }
    @GetMapping("/listAdmins")
    List<Admin> listAdmin(){
        return adminService.listAdmins();
    }
    @GetMapping("/ById/{id}")
    Admin AdminById(@PathVariable("id") Long id){
        return  adminService.admin(id);
    }


    @DeleteMapping("/deleteAdmin/{id}")
    void deleteAdmin(@PathVariable("id")Long id){
        adminService.supprimerAdmin(id);
    }
    @PutMapping("/modifierAdmin/{id}")
    Admin modifierAdmin(@PathVariable("id")Long id, @RequestBody Admin admin){
        return adminService.admin(admin, id);
    }

}
