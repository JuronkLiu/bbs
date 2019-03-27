package com.bbs.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: HomeController.java 
 * @Description: 前台首页 
 * @author: liuzhirong 
 * @Date: 2019年3月17日 下午4:31:00
 */
@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/index.action")
	public String userPage(Model model) { 
		
		return "home/jsp/index";
	}
	
}
