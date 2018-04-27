package naire.service.impl;

import naire.mapper.NaireMapper;
import naire.pojo.Naire;
import naire.service.NaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaireServiceImpl implements NaireService {
    @Autowired
    private NaireMapper naireMapper;
    @Override
    public void NaireUp(Naire naire) {
        naireMapper.insert(naire);
    }
}
