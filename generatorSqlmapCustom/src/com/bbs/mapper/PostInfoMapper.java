package com.bbs.mapper;

import com.bbs.pojo.PostInfo;
import com.bbs.pojo.PostInfoExample;
import com.bbs.pojo.PostInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostInfoMapper {
    int countByExample(PostInfoExample example);

    int deleteByExample(PostInfoExample example);

    int deleteByPrimaryKey(String postId);

    int insert(PostInfoWithBLOBs record);

    int insertSelective(PostInfoWithBLOBs record);

    List<PostInfoWithBLOBs> selectByExampleWithBLOBs(PostInfoExample example);

    List<PostInfo> selectByExample(PostInfoExample example);

    PostInfoWithBLOBs selectByPrimaryKey(String postId);

    int updateByExampleSelective(@Param("record") PostInfoWithBLOBs record, @Param("example") PostInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PostInfoWithBLOBs record, @Param("example") PostInfoExample example);

    int updateByExample(@Param("record") PostInfo record, @Param("example") PostInfoExample example);

    int updateByPrimaryKeySelective(PostInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PostInfoWithBLOBs record);

    int updateByPrimaryKey(PostInfo record);
}