
package com.bbs.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bbs.common.controller.CommonController;
import com.bbs.common.pojo.EUDataGridResult;
import com.bbs.pojo.SchoolInfo;
import com.bbs.pojo.vo.SchoolInfoVO;
import com.bbs.service.SchoolInfoService;

/**
 * @Description:后台学校信息控制层 controller
 * @author: liuzhirong 
 * @Date: 2019年3月22日 下午5:21:12
 */
@Controller
@RequestMapping("/admin/school")
public class SchoolInfoAdminController implements CommonController<SchoolInfo>{

	@Autowired
	private SchoolInfoService schoolInfoService;
	
	/**
	 * TODO:后台学院信息列表
	 * @version 2019年3月22日上午12:47:35
	 * @author Juronk Liu
	 */
	@RequestMapping("/list.action")
	@ResponseBody
	public EUDataGridResult schoolPage(Integer page, Integer rows,SchoolInfoVO schoolInfoVO) { 
		EUDataGridResult result = schoolInfoService.getAdminList(page, rows,schoolInfoVO);
		return result;
	}
	/**
	 * TODO:已删除学院列表
	 * @version 2019年3月23日下午11:13:49
	 * @author Juronk Liu
	 */
	@RequestMapping("/deleteList.action")
	@ResponseBody
	public EUDataGridResult schoolDeletePage(Integer page, Integer rows,SchoolInfoVO schoolInfoVO) { 
		EUDataGridResult result = schoolInfoService.getAdminDelList(page, rows,schoolInfoVO);
		return result;
	}
	
	@Override
	@RequestMapping("/add.action")
	@ResponseBody
	public String add(SchoolInfo schoolInfo) { 
		boolean add = schoolInfoService.add(schoolInfo);
		return getResult(add);
	}
	
	@Override
	@RequestMapping("/delete.action")
	@ResponseBody
	public String delete(SchoolInfo schoolInfo) { 
		boolean delete = schoolInfoService.delete(schoolInfo);
		return getResult(delete);
	}
	
	@Override
	@RequestMapping("/update.action")
	@ResponseBody
	public String update(SchoolInfo schoolInfo) {
		boolean update = schoolInfoService.update(schoolInfo);
		return getResult(update);
	}
	
	@Override
	@RequestMapping("/completeDel.action")
	@ResponseBody
	public String completeDel(SchoolInfo schoolInfo) { 
		boolean completeDel = schoolInfoService.completeDel(schoolInfo);
		return getResult(completeDel);
	}
	
	@Override
	@RequestMapping("/recover.action")
	@ResponseBody
	public String repealDel(SchoolInfo schoolInfo) { 
		boolean  repealDel = schoolInfoService.repealDel(schoolInfo);
		return getResult(repealDel);
	}
	
	@Override
	public String batchDels(String[] ids) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getResult(boolean success) {
		return success ? "{\"result\":\"success\"}" : "{\"result\":\"error\"}";
	}
}
