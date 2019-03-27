package com.bbs.mapper;

import com.bbs.pojo.SchoolInfo;
import com.bbs.pojo.SchoolInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolInfoMapper {
    int countByExample(SchoolInfoExample example);

    int deleteByExample(SchoolInfoExample example);

    int deleteByPrimaryKey(String schoolId);

    int insert(SchoolInfo record);

    int insertSelective(SchoolInfo record);

    List<SchoolInfo> selectByExample(SchoolInfoExample example);

    SchoolInfo selectByPrimaryKey(String schoolId);

    int updateByExampleSelective(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    int updateByExample(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    int updateByPrimaryKeySelective(SchoolInfo record);

    int updateByPrimaryKey(SchoolInfo record);
}