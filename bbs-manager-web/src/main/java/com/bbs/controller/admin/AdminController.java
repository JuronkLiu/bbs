
package com.bbs.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:后台首页控制层controller
 * @author: liuzhirong 
 * @Date: 2019年3月20日 下午2:31:13
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

	/**
	 * @Description:打开首页
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月20日 下午2:52:02
	 */
	@RequestMapping("/index.action")
	public String  index() {
		return "admin/jsp/index";
	}

	/**
	 * @Description:展示其它页面
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月20日 下午2:52:20
	 */
	@RequestMapping("/showPage.action")
	public String showPage(String page) {
		return "admin/jsp/"+page;
	}
}
