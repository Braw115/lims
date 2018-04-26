package cn.xueliang.mapper;

import cn.xueliang.pojo.Lab;
import cn.xueliang.pojo.LabExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LabMapper {
    int countByExample(LabExample example);

    int deleteByExample(LabExample example);

    int deleteByPrimaryKey(String labNum);

    int insert(Lab record);

    int insertSelective(Lab record);

    List<Lab> selectByExample(LabExample example);

    Lab selectByPrimaryKey(String labNum);

    int updateByExampleSelective(@Param("record") Lab record, @Param("example") LabExample example);

    int updateByExample(@Param("record") Lab record, @Param("example") LabExample example);

    int updateByPrimaryKeySelective(Lab record);

    int updateByPrimaryKey(Lab record);
}