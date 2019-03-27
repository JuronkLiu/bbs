
package com.bbs.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbs.mapper.PostInfoMapper;
import com.bbs.pojo.PostInfo;
import com.bbs.pojo.PostInfoExample;
import com.bbs.pojo.PostInfoWithBLOBs;
import com.bbs.service.PostInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @Description:帖子信息ServiceImpl层
 * @author: liuzhirong 
 * @Date: 2019年3月20日 上午10:21:33
 */
@Service("postInfoService")
public class PostInfoServiceImpl implements PostInfoService{

	@Autowired 
	private PostInfoMapper postInfoMapper;
	
	@Override
	public PageInfo<PostInfo> getPostInfoPage(Integer currentPage, Integer pageSize,String catetoryId) {
		if (currentPage > 1) {
			PageHelper.startPage(currentPage, pageSize);
		}else {
			PageHelper.startPage(1, pageSize);
		}
		PostInfoExample example = new PostInfoExample();
		example.createCriteria().andCatetoryIdEqualTo(catetoryId);
		List<PostInfo> postInfoList = postInfoMapper.selectByExample(example);
		PageInfo<PostInfo> pageInfo = new PageInfo<>(postInfoList);
		return pageInfo;
	}

	@Override
	public PostInfoWithBLOBs getPostById(String postId) {
		PostInfoWithBLOBs postInfo = postInfoMapper.selectByPrimaryKey(postId);
		return postInfo;
	}

	@Override
	public boolean add(PostInfoWithBLOBs postInfo) {
		String postId = UUID.randomUUID().toString().replaceAll("-", "");
		postInfo.setPostId(postId);
		postInfo.setCreateDate(new Date());
		postInfo.setIsOff(0);
		postInfo.setIsDel(0);
		return postInfoMapper.insert(postInfo) > 0 ? true : false;
	}

	@Override
	public boolean delete(PostInfoWithBLOBs postInfo) {
		postInfo.setUpdateDate(new Date());
		postInfo.setIsDel(1);
		return postInfoMapper.updateByPrimaryKeySelective(postInfo) > 0 ? true :false ;
	}

	@Override
	public boolean update(PostInfoWithBLOBs postInfo) {
		postInfo.setUpdateDate(new Date());
		return postInfoMapper.updateByPrimaryKeySelective(postInfo) > 0 ? true :false ;
	}

	@Override
	public boolean completeDel(PostInfoWithBLOBs postInfo) {
		return postInfoMapper.deleteByPrimaryKey(postInfo.getPostId()) > 0 ? true : false;
	}

	@Override
	public boolean repealDel(PostInfoWithBLOBs postInfo) {
		postInfo.setUpdateDate(new Date());
		postInfo.setIsDel(0);
		return postInfoMapper.updateByPrimaryKeySelective(postInfo) > 0 ? true :false ;
	}

	@Override
	public boolean batchDels(String[] schoolIds) {
		// TODO Auto-generated method stub
		return false;
	}
}
