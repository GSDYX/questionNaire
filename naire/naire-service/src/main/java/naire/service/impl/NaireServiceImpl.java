package naire.service.impl;

import naire.mapper.QnonlinegamingMapper;
import naire.pojo.Qnonlinegaming;
import naire.service.NaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NaireServiceImpl implements NaireService {
    @Autowired
    private QnonlinegamingMapper qnonlinegamingMapper;
    @Override
    public void qnOnlineGamingUp(Qnonlinegaming qnonlinegaming) {
         qnonlinegamingMapper.insert(qnonlinegaming);
    }

    @Override
    public List<Qnonlinegaming> qnOnlineGamingReport() {
        List<Qnonlinegaming> qnonlinegamingList = qnonlinegamingMapper.selectByExample(null);
        return qnonlinegamingList;
    }

}
