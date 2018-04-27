package naire.mapper;

import naire.pojo.Qnonlinegaming;
import naire.pojo.QnonlinegamingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QnonlinegamingMapper {
    int countByExample(QnonlinegamingExample example);

    int deleteByExample(QnonlinegamingExample example);

    int deleteByPrimaryKey(Integer qnonlinegamingid);

    int insert(Qnonlinegaming record);

    int insertSelective(Qnonlinegaming record);

    List<Qnonlinegaming> selectByExample(QnonlinegamingExample example);

    Qnonlinegaming selectByPrimaryKey(Integer qnonlinegamingid);

    int updateByExampleSelective(@Param("record") Qnonlinegaming record, @Param("example") QnonlinegamingExample example);

    int updateByExample(@Param("record") Qnonlinegaming record, @Param("example") QnonlinegamingExample example);

    int updateByPrimaryKeySelective(Qnonlinegaming record);

    int updateByPrimaryKey(Qnonlinegaming record);
}