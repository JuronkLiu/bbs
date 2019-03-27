
package com.bbs.controller.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bbs.service.CatetoryInfoService;

/**
 * @Description:栏目分类Controller层
 * @author: liuzhirong 
 * @Date: 2019年3月20日 上午9:50:14
 */
@Controller
public class CategoryInfoHomeController {

	@Autowired
	private CatetoryInfoService catetoryInfoService;
	
	public String getCate() {
		return null;
	}
}
