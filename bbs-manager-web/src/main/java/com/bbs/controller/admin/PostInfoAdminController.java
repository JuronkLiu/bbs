package com.bbs.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bbs.common.controller.CommonController;
import com.bbs.pojo.PostInfoWithBLOBs;
import com.bbs.service.PostInfoService;

/**
 * @Description:帖子模块控制层controller
 * @author: liuzhirong 
 * @Date: 2019年3月26日 下午5:23:06
 */
@Controller
@RequestMapping("/admin/post")
public class PostInfoAdminController implements CommonController<PostInfoWithBLOBs>{

	@Autowired
	private PostInfoService postInfoService;
	
	@Override
	@RequestMapping("/add.action")
	@ResponseBody
	public String add(PostInfoWithBLOBs postInfo) {
		boolean add = postInfoService.add(postInfo);
		return getResult(add);
	}

	@Override
	@RequestMapping("/delete.action")
	@ResponseBody
	public String delete(PostInfoWithBLOBs postInfo) {
		boolean delete = postInfoService.delete(postInfo);
		return getResult(delete);
	}

	@Override
	@RequestMapping("/update.action")
	@ResponseBody
	public String update(PostInfoWithBLOBs postInfo) {
		boolean update = postInfoService.update(postInfo);
		return getResult(update);
	}

	@Override
	@RequestMapping("/completeDel.action")
	@ResponseBody
	public String completeDel(PostInfoWithBLOBs postInfo) {
		boolean completeDel = postInfoService.completeDel(postInfo);
		return getResult(completeDel);
	}

	@Override
	@RequestMapping("/repealDel.action")
	@ResponseBody
	public String repealDel(PostInfoWithBLOBs postInfo) {
		boolean repealDel = postInfoService.repealDel(postInfo);
		return getResult(repealDel);
	}

	@Override
	@RequestMapping("/batchDels.action")
	@ResponseBody
	public String batchDels(String[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getResult(boolean success) {
		return success ? "{\"result\":\"success\"}" : "{\"result\":\"error\"}";
	}

}
