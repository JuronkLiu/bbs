package com.bbs.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO:系统信息控制层controller
 * @version 2019年3月23日下午4:19:09
 * @author Juronk Liu
 */
@Controller
@RequestMapping("/home/system")
public class SystemHomeController {

	@RequestMapping("/index.action")
	public String showSystem() {
		
		return "home/jsp/system-inform/system-inform";
	}
}
