package com.bbs.mapper;

import com.bbs.pojo.CatetoryInfo;
import com.bbs.pojo.CatetoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatetoryInfoMapper {
    int countByExample(CatetoryInfoExample example);

    int deleteByExample(CatetoryInfoExample example);

    int deleteByPrimaryKey(String catetoryId);

    int insert(CatetoryInfo record);

    int insertSelective(CatetoryInfo record);

    List<CatetoryInfo> selectByExample(CatetoryInfoExample example);

    CatetoryInfo selectByPrimaryKey(String catetoryId);

    int updateByExampleSelective(@Param("record") CatetoryInfo record, @Param("example") CatetoryInfoExample example);

    int updateByExample(@Param("record") CatetoryInfo record, @Param("example") CatetoryInfoExample example);

    int updateByPrimaryKeySelective(CatetoryInfo record);

    int updateByPrimaryKey(CatetoryInfo record);
}