package com.banqueBlood.BanqueBlood.Services;

import com.banqueBlood.BanqueBlood.model.Admin;
import com.banqueBlood.BanqueBlood.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;
    public Admin ajoutAdmin(Admin admin){
        return adminRepository.save(admin);

    }
    public List<Admin> listAdmins(){
        return  adminRepository.findAll();
    }
    public Admin admin(Long id){
        return adminRepository.findById(id).get();

    }
    public void supprimerAdmin(Long id){
        adminRepository.deleteById(id);
    }
    public Admin admin(Admin admin, Long id){
      Admin admin1 =  adminRepository.findById(id).get();
      admin1.setNomComplet(admin.getNomComplet());
      admin1.setLogin(admin.getLogin());
      admin1.setPassword(admin.getPassword());
      admin1.setTelephone(admin.getTelephone());
       return adminRepository.save(admin1);
    }
}
