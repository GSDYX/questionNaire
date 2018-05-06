package naire.service.impl;

import naire.mapper.NaireCustomMapper;
import naire.mapper.NaireMapper;
import naire.mapper.UserNaireMapper;
import naire.pojo.Naire;
import naire.pojo.UserNaire;
import naire.pojo.UserNaireExample;
import naire.service.UserNaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserNaireServiceImpl implements UserNaireService {
    @Autowired
    private NaireCustomMapper naireCustomMapper;
    @Autowired
    private NaireMapper naireMapper;
    @Autowired
    private UserNaireMapper userNaireMapper;
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
//返回显示所有问卷
    @Override
    public List<Naire> findNaireListAll() {
        List<Naire> nairesAll = naireMapper.selectByExample(null);
        return nairesAll;
    }
//删除某用户的问卷
    @Override
    public void qnDelect(int naireid,int userid) {
        UserNaireExample userNaireExample = new UserNaireExample();
        UserNaireExample.Criteria criteria = userNaireExample.createCriteria();
        criteria.andNaireidEqualTo(naireid);
        criteria.andUseridEqualTo(userid);
        userNaireMapper.deleteByExample(userNaireExample);
    }

    @Override
    public void qnAdd(int naireid, int userid) {
        UserNaire userNaire = new UserNaire();
        userNaire.setNaireid(naireid);
        userNaire.setUserid(userid);
        userNaireMapper.insert(userNaire);
    }
}
