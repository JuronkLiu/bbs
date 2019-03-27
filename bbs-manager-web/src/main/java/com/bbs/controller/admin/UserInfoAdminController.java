package com.bbs.controller.admin;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bbs.common.controller.CommonController;
import com.bbs.common.pojo.EUDataGridResult;
import com.bbs.pojo.UserInfo;
import com.bbs.pojo.vo.UserInfoVO;
import com.bbs.service.UserInfoService;

/**
 * @ClassName: UserInfoController.java 
 * @Description: 后台用户信息控制层 controller
 * @author: liuzhirong 
 * @Date: 2019年3月13日 下午2:47:58
 */
@Controller
@RequestMapping("/admin/user")
public class UserInfoAdminController implements CommonController<UserInfo>{

	@Resource(name="userInfoService")
	private UserInfoService userInfoService;
	
	/**
	 * TODO:后台用户信息列表
	 * @version 2019年3月22日上午12:47:35
	 * @author Juronk Liu
	 */
	@RequestMapping("/list.action")
	@ResponseBody
	public EUDataGridResult userPage(Integer page, Integer rows,UserInfoVO userVO) { 
		EUDataGridResult result = userInfoService.getUserList(page, rows,userVO);
		return result;
	}
	/**
	 * TODO:警告用户
	 * @version 2019年3月26日上午12:15:26
	 * @author Juronk Liu
	 */
	@RequestMapping("/warn.action")
	@ResponseBody
	public String warn(UserInfo userInfo) { 
		boolean warn = userInfoService.warn(userInfo);
		return getResult(warn);
	}
	/**
	 * TODO:后台用户警告列表
	 * @version 2019年3月26日上午1:02:37
	 * @author Juronk Liu
	 */
	@RequestMapping("/warnList.action")
	@ResponseBody
	public EUDataGridResult warnList(Integer page, Integer rows,UserInfoVO userVO) { 
		EUDataGridResult result = userInfoService.getwarnList(page, rows,userVO);
		return result;
	}
	/**
	 * TODO:撤销警告用户
	 * @version 2019年3月26日上午1:26:36
	 * @author Juronk Liu
	 */
	@RequestMapping("/recoverWarn.action")
	@ResponseBody
	public String recoverWarn(UserInfo userInfo) { 
		boolean recoverWarn = userInfoService.recoverWarn(userInfo);
		return getResult(recoverWarn);
	}
	/**
	 * TODO:拉黑用户
	 * @version 2019年3月26日上午1:28:03
	 * @author Juronk Liu
	 */
	@RequestMapping("/lock.action")
	@ResponseBody
	public String lock(UserInfo userInfo) { 
		boolean lock = userInfoService.lock(userInfo);
		return getResult(lock);
	}
	/**
	 * TODO:黑名单列表
	 * @version 2019年3月26日上午1:51:21
	 * @author Juronk Liu
	 */
	@RequestMapping("/blacklist.action")
	@ResponseBody
	public EUDataGridResult blacklist(Integer page, Integer rows,UserInfoVO userVO) { 
		EUDataGridResult result = userInfoService.getblacklist(page, rows,userVO);
		return result;
	}
	/**
	 * TODO:撤销拉黑
	 * @version 2019年3月26日上午2:06:08
	 * @author Juronk Liu
	 */
	@RequestMapping("/recoverLock.action")
	@ResponseBody
	public String recoverLock(UserInfo userInfo) { 
		boolean lock = userInfoService.recoverLock(userInfo);
		return getResult(lock);
	}
	/**
	 * TODO:已删除用户列表
	 * @version 2019年3月26日上午2:21:19
	 * @author Juronk Liu
	 */
	@RequestMapping("/delList.action")
	@ResponseBody
	public EUDataGridResult delList(Integer page, Integer rows,UserInfoVO userVO) { 
		EUDataGridResult result = userInfoService.getDelList(page, rows,userVO);
		return result;
	}
	
	@Override
	@RequestMapping("/add.action")
	@ResponseBody
	public String add(UserInfo userInfo) { 
		boolean add = userInfoService.add(userInfo);
		return getResult(add);
	}
	
	@Override
	@RequestMapping("/update.action")
	@ResponseBody
	public String update(UserInfo userInfo) {
		boolean update = userInfoService.update(userInfo);
		return getResult(update);
	}
	
	@Override
	@RequestMapping("/delete.action")
	@ResponseBody
	public String delete(UserInfo userInfo) { 
		boolean delete = userInfoService.delete(userInfo);
		return getResult(delete);
	}
	
	@Override
	@RequestMapping("/completeDel.action")
	@ResponseBody
	public String completeDel(UserInfo userInfo) { 
		boolean completeDel = userInfoService.completeDel(userInfo);
		return getResult(completeDel);
	}
	
	@Override
	@RequestMapping("/recover.action")
	@ResponseBody
	public String repealDel(UserInfo userInfo) { 
		boolean  repealDel = userInfoService.repealDel(userInfo);
		return getResult(repealDel);
	}
	
	@Override
	public String getResult(boolean success) {
		return success ? "{\"result\":\"success\"}" : "{\"result\":\"error\"}";
	}
	
	@Override
	public String batchDels(String[] ids) {
		// TODO Auto-generated method stub
		return null;
	}
}
