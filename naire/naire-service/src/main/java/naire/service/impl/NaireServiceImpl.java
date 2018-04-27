package naire.service.impl;

import naire.mapper.QnonlinegamingMapper;
import naire.pojo.Qnonlinegaming;
import naire.service.NaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaireServiceImpl implements NaireService {
    @Autowired
    private QnonlinegamingMapper qnonlinegamingMapper;
    @Override
    public void QnonlinegamingUp(Qnonlinegaming qnonlinegaming) {
         qnonlinegamingMapper.insert(qnonlinegaming);
    }
}
