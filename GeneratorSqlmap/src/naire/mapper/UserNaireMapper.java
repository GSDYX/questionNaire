package naire.mapper;

import java.util.List;
import naire.pojo.UserNaire;
import naire.pojo.UserNaireExample;
import org.apache.ibatis.annotations.Param;

public interface UserNaireMapper {
    int countByExample(UserNaireExample example);

    int deleteByExample(UserNaireExample example);

    int deleteByPrimaryKey(Integer usernaireid);

    int insert(UserNaire record);

    int insertSelective(UserNaire record);

    List<UserNaire> selectByExample(UserNaireExample example);

    UserNaire selectByPrimaryKey(Integer usernaireid);

    int updateByExampleSelective(@Param("record") UserNaire record, @Param("example") UserNaireExample example);

    int updateByExample(@Param("record") UserNaire record, @Param("example") UserNaireExample example);

    int updateByPrimaryKeySelective(UserNaire record);

    int updateByPrimaryKey(UserNaire record);
}