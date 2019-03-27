package com.bbs.controller.home;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbs.pojo.UserInfo;
import com.bbs.service.UserInfoService;
import com.github.pagehelper.PageInfo;

/**
 * @ClassName: UserInfoController.java 
 * @Description: 前台用户信息控制层 
 * @author: liuzhirong 
 * @Date: 2019年3月13日 下午2:47:58
 */
@Controller
@RequestMapping("/home/user")
public class UserInfoHomeController {

	@Resource(name="userInfoService")
	private UserInfoService userInfoService;
	
	@RequestMapping("/index.action")
	public String userPage(Model model) { 
		return "home/jsp/user-info/user-info";
	}
	
	/**
	 * @Description:去登陆
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月17日 下午4:37:32
	 */
	@RequestMapping("/toLogin.action")
	public String toLogin(Model model) {
		return "home/jsp/login";
	}
	/**
	 * @Description:去注册
	 * @return:String
	 * @author:liuzhirong
	 * @Date:2019年3月17日 下午4:38:59
	 */
	@RequestMapping("/toRegister.action")
	public String toRegister(Model model) {
		return "home/jsp/register";
	}
	/**
	 * @Description:登陆
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月17日 下午4:39:15
	 */
	@RequestMapping("/login.action")
	public String login(Model model,String namePhoneEmail,UserInfo userInfo) {
		boolean isLogin = userInfoService.login(namePhoneEmail,userInfo);
		if (isLogin) {
			return "redirect:../home/index.action";
		}
		return "redirect:toLogin.action";
	}
	/**
	 * @Description:注册
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月17日 下午4:39:27
	 */
	@RequestMapping("/reg.action")
	public String register(Model model,UserInfo userInfo) {
		boolean isRegister = userInfoService.register(userInfo);
		if (isRegister) {
			return "redirect:toLogin.action";
		}
		return "redirect:toRegister.action";
	}
}
