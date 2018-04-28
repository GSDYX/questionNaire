package naire.mapper;

import naire.pojo.Naire;

import java.util.List;

public interface NaireCustomMapper {
    //根据用户id查询拥有的问卷调查
    List<Naire> findNaireListByUserId(int userid)throws Exception;
}