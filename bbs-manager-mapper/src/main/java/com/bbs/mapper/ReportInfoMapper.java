package com.bbs.mapper;

import com.bbs.pojo.ReportInfo;
import com.bbs.pojo.ReportInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportInfoMapper {
    int countByExample(ReportInfoExample example);

    int deleteByExample(ReportInfoExample example);

    int deleteByPrimaryKey(String reportId);

    int insert(ReportInfo record);

    int insertSelective(ReportInfo record);

    List<ReportInfo> selectByExample(ReportInfoExample example);

    ReportInfo selectByPrimaryKey(String reportId);

    int updateByExampleSelective(@Param("record") ReportInfo record, @Param("example") ReportInfoExample example);

    int updateByExample(@Param("record") ReportInfo record, @Param("example") ReportInfoExample example);

    int updateByPrimaryKeySelective(ReportInfo record);

    int updateByPrimaryKey(ReportInfo record);
}