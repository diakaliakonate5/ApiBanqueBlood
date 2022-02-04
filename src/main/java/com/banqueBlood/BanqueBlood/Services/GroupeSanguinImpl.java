package com.banqueBlood.BanqueBlood.Services;

import com.banqueBlood.BanqueBlood.model.GroupeSanguin;
import com.banqueBlood.BanqueBlood.model.Patient;
import com.banqueBlood.BanqueBlood.repositories.GroupeSanguinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupeSanguinImpl implements GroupeSanguinService{
    @Autowired
    GroupeSanguinRepository groupeSanguinRepository;
    @Override
    public GroupeSanguin ajoutGroupe(GroupeSanguin groupeSanguin) {
        return groupeSanguinRepository.save(groupeSanguin);
    }

    @Override
    public List<GroupeSanguin> listGroupe() {
        return groupeSanguinRepository.findAll();
    }

    @Override
    public GroupeSanguin afficherbyid(Long id) {
        return groupeSanguinRepository.findById(id).get();
    }

    @Override
    public GroupeSanguin modifier(GroupeSanguin groupeSanguin, Long id) {
        GroupeSanguin groupeSanguin1=groupeSanguinRepository.findById(id).get();
        groupeSanguin1.setType  (groupeSanguin.getType());
        return groupeSanguinRepository.save(groupeSanguin1);
    }

    @Override
    public void suprimer(Long id) {
        groupeSanguinRepository.deleteById(id);

    }
}
