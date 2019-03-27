package com.bbs.mapper;

import com.bbs.pojo.RevertInfo;
import com.bbs.pojo.RevertInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RevertInfoMapper {
    int countByExample(RevertInfoExample example);

    int deleteByExample(RevertInfoExample example);

    int deleteByPrimaryKey(String revertId);

    int insert(RevertInfo record);

    int insertSelective(RevertInfo record);

    List<RevertInfo> selectByExample(RevertInfoExample example);

    RevertInfo selectByPrimaryKey(String revertId);

    int updateByExampleSelective(@Param("record") RevertInfo record, @Param("example") RevertInfoExample example);

    int updateByExample(@Param("record") RevertInfo record, @Param("example") RevertInfoExample example);

    int updateByPrimaryKeySelective(RevertInfo record);

    int updateByPrimaryKey(RevertInfo record);
}