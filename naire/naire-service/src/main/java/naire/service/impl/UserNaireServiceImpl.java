package naire.service.impl;

import naire.mapper.NaireCustomMapper;
import naire.pojo.Naire;
import naire.service.UserNaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserNaireServiceImpl implements UserNaireService {
    @Autowired
    private NaireCustomMapper naireCustomMapper;
    @Override
    public List<Naire> findNaireListByUserId(int userid) {
        List<Naire> naireList = null;
        try {
            naireList = naireCustomMapper.findNaireListByUserId(userid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return naireList;
    }
}
