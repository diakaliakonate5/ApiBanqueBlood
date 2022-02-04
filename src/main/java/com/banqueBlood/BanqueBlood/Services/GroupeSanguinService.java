package com.banqueBlood.BanqueBlood.Services;

import com.banqueBlood.BanqueBlood.model.GroupeSanguin;
import com.banqueBlood.BanqueBlood.model.Patient;

import java.util.List;

public interface GroupeSanguinService {
    public GroupeSanguin ajoutGroupe(GroupeSanguin groupeSanguin);
    List<GroupeSanguin> listGroupe();
    GroupeSanguin afficherbyid(Long id);
    GroupeSanguin modifier(GroupeSanguin groupeSanguin , Long id);
    void suprimer(Long id);
}
