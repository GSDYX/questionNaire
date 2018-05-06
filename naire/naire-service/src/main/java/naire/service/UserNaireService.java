package naire.service;

import naire.pojo.Naire;

import java.util.List;

public interface UserNaireService {

    List<Naire> findNaireListByUserId(int userid);
    List<Naire> findNaireListAll();
    void qnDelect(int naireid,int userid);

    void qnAdd(int naireid, int userid);
}
