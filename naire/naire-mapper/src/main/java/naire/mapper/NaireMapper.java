package naire.mapper;

import naire.pojo.Naire;
import naire.pojo.NaireExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NaireMapper {
    int countByExample(NaireExample example);

    int deleteByExample(NaireExample example);

    int deleteByPrimaryKey(Integer naireid);

    int insert(Naire record);

    int insertSelective(Naire record);

    List<Naire> selectByExample(NaireExample example);

    Naire selectByPrimaryKey(Integer naireid);

    int updateByExampleSelective(@Param("record") Naire record, @Param("example") NaireExample example);

    int updateByExample(@Param("record") Naire record, @Param("example") NaireExample example);

    int updateByPrimaryKeySelective(Naire record);

    int updateByPrimaryKey(Naire record);
}