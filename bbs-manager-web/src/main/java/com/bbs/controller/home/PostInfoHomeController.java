package com.bbs.controller.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbs.pojo.CatetoryInfo;
import com.bbs.pojo.PostInfo;
import com.bbs.pojo.PostInfoWithBLOBs;
import com.bbs.service.CatetoryInfoService;
import com.bbs.service.PostInfoService;
import com.github.pagehelper.PageInfo;

/**
 * @ClassName: PostInfoController.java 
 * @Description: 前台帖子信息控制层
 * @author: liuzhirong 
 * @Date: 2019年3月19日 下午6:23:39
 */
@Controller
@RequestMapping("/home/post")
public class PostInfoHomeController {
	
	@Autowired
	private CatetoryInfoService catetoryInfoService;
	@Autowired
	private PostInfoService postInfoService;

	/**
	 * @Description:帖子信息展示列表
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月19日 下午6:28:10
	 */
	@RequestMapping("/postList.action")
	public String postList(Model model,Integer currentPage,String catetoryId) {
		List<CatetoryInfo> catetoryInfos = catetoryInfoService.getCatetoryInfos();
		model.addAttribute("catetoryInfoList", catetoryInfos);
		Integer pageSize = 30; 
		PageInfo<PostInfo> pageInfo = postInfoService.getPostInfoPage(currentPage,pageSize,catetoryId);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("catetoryId", catetoryId);
		return "home/jsp/catetory/catetory-show";
	}
	/**
	 * @Description:获取帖子详情
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月20日 下午1:38:18
	 */
	@RequestMapping("/showPost.action")
	public String showPost(Model model,String postId) {
		PostInfoWithBLOBs postInfo = postInfoService.getPostById(postId);
		model.addAttribute("postInfo", postInfo);
		return "home/jsp/catetory/catetory-detail";
	}
}
