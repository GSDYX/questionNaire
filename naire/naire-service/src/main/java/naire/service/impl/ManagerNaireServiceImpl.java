package naire.service.impl;

import naire.mapper.NaireMapper;
import naire.service.ManagerNaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerNaireServiceImpl implements ManagerNaireService{
    @Autowired
    private NaireMapper naireMapper;
    @Override
    public void qnManagerDelect(int naireid) {

        naireMapper.deleteByPrimaryKey(naireid);
    }


}
