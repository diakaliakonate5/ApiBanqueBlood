package com.banqueBlood.BanqueBlood.repositories;

import com.banqueBlood.BanqueBlood.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    Optional<Admin> findByLoginAndPassword(String login, String password);
}
