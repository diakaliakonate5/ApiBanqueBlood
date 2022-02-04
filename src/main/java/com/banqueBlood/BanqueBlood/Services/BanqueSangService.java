package com.banqueBlood.BanqueBlood.Services;

import com.banqueBlood.BanqueBlood.model.BanqueSang;
import com.banqueBlood.BanqueBlood.model.Patient;

import java.util.List;

public interface BanqueSangService {
    public BanqueSang ajoutBanque(BanqueSang banqueSang);
    List<BanqueSang> listBanque();
    BanqueSang afficherbyid(Long id);
    BanqueSang modifier(BanqueSang banqueSang , Long id);
    void suprimer(Long id);
}
