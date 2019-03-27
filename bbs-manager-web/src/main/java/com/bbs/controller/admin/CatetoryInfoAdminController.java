package com.bbs.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bbs.common.controller.CommonController;
import com.bbs.common.pojo.EUDataGridResult;
import com.bbs.pojo.CatetoryInfo;
import com.bbs.pojo.vo.CatetoryInfoVO;
import com.bbs.service.CatetoryInfoService;

/**
 * @Description:后台栏目管理控制层controller
 * @author: liuzhirong 
 * @Date: 2019年3月26日 上午11:26:47
 */
@Controller
@RequestMapping("/admin/catetory")
public class CatetoryInfoAdminController implements CommonController<CatetoryInfo> {
	
	@Autowired
	CatetoryInfoService catetoryInfoService;

	/**
	 * @Description:获取栏目信息
	 * @return:EUDataGridResult
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午3:56:15
	 */
	@RequestMapping("/list.action")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, CatetoryInfoVO catetoryInfoVO) {
		EUDataGridResult result = catetoryInfoService.getList(page, rows,catetoryInfoVO);
		return result;
	}

	@Override
	@RequestMapping("/add.action")
	@ResponseBody
	public String add(CatetoryInfo catetoryInfo) {
		boolean add = catetoryInfoService.add(catetoryInfo);
		return getResult(add);
	}

	@Override
	@RequestMapping("/delete.action")
	@ResponseBody
	public String delete(CatetoryInfo catetoryInfo) {
		boolean delete = catetoryInfoService.delete(catetoryInfo);
		return getResult(delete);
	}

	@Override
	@RequestMapping("/update.action")
	@ResponseBody
	public String update(CatetoryInfo catetoryInfo) {
		boolean update = catetoryInfoService.update(catetoryInfo);
		return getResult(update);
	}

	@Override
	@RequestMapping("/completeDel.action")
	@ResponseBody
	public String completeDel(CatetoryInfo catetoryInfo) {
		boolean completeDel = catetoryInfoService.completeDel(catetoryInfo);
		return getResult(completeDel);
	}

	@Override
	@RequestMapping("/repealDel.action")
	@ResponseBody
	public String repealDel(CatetoryInfo catetoryInfo) {
		boolean repealDel = catetoryInfoService.repealDel(catetoryInfo);
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

	/**
	 * @Description:栏目下架
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午3:48:02
	 */
	@RequestMapping("/down.action")
	@ResponseBody
	public String down(CatetoryInfo catetoryInfo) {
		boolean down = catetoryInfoService.down(catetoryInfo);
		return getResult(down);
	}
	/**
	 * @Description:获取下架的栏目信息
	 * @return:EUDataGridResult
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午3:56:50
	 */
	@RequestMapping("/downList.action")
	@ResponseBody
	public EUDataGridResult getDownList(Integer page, Integer rows, CatetoryInfoVO catetoryInfoVO) {
		EUDataGridResult result = catetoryInfoService.getDownList(page, rows,catetoryInfoVO);
		return result;
	}
	/**
	 * @Description:栏目上架
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午4:14:26
	 */
	@RequestMapping("/up.action")
	@ResponseBody
	public String up(CatetoryInfo catetoryInfo) {
		boolean up = catetoryInfoService.up(catetoryInfo);
		return getResult(up);
	}
	/**
	 * @Description:已删除栏目信息列表
	 * @return:EUDataGridResult
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午4:29:16
	 */
	@RequestMapping("/delList.action")
	@ResponseBody
	public EUDataGridResult getDelList(Integer page, Integer rows, CatetoryInfoVO catetoryInfoVO) {
		EUDataGridResult result = catetoryInfoService.getDelList(page, rows,catetoryInfoVO);
		return result;
	}
}
