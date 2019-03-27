
package com.bbs.service;

import com.bbs.common.service.CommonService;
import com.bbs.pojo.PostInfo;
import com.bbs.pojo.PostInfoWithBLOBs;
import com.github.pagehelper.PageInfo;

/**
 * @Description: 帖子管理服务层service
 * @author: liuzhirong 
 * @Date: 2019年3月20日 上午9:39:47
 */
public interface PostInfoService extends CommonService<PostInfoWithBLOBs>{
	
	/**
	 * @Description:分页获取帖子信息
	 * @return:PageInfo<PostInfo>
	 * @author:liuzhirong 
	 * @param catetoryId 
	 * @Date:2019年3月20日 上午10:20:36
	 */
	public PageInfo<PostInfo> getPostInfoPage(Integer currentPage, Integer pageSize, String catetoryId);

	/**
	 * @Description:获取帖子详情
	 * @return:PostInfo
	 * @author:liuzhirong 
	 * @Date:2019年3月20日 下午1:40:17
	 */
	public PostInfoWithBLOBs getPostById(String postId);
	
}
