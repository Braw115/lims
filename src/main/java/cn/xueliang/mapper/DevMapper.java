package cn.xueliang.mapper;

import cn.xueliang.pojo.Dev;
import cn.xueliang.pojo.DevExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevMapper {
    int countByExample(DevExample example);

    int deleteByExample(DevExample example);

    int deleteByPrimaryKey(String devNum);

    int insert(Dev record);

    int insertSelective(Dev record);

    List<Dev> selectByExample(DevExample example);

    Dev selectByPrimaryKey(String devNum);

    int updateByExampleSelective(@Param("record") Dev record, @Param("example") DevExample example);

    int updateByExample(@Param("record") Dev record, @Param("example") DevExample example);

    int updateByPrimaryKeySelective(Dev record);

    int updateByPrimaryKey(Dev record);
}