package com.bbs.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO:建议反馈信息控制层controller
 * @version 2019年3月23日下午4:24:23
 * @author Juronk Liu
 */
@Controller
@RequestMapping("/home/suggest")
public class SuggestHomeController {

	@RequestMapping("/index.action")
	public String showSuggert() {
		return "home/jsp/suggest-feedback";
	}
}
