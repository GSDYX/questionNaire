package naire.service;

import naire.pojo.Naire;

import java.util.List;

public interface UserNaireService {
    List<Naire> findNaireListByUserId(int userid);
}
