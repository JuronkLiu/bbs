
package com.bbs.service;

import java.util.List;
import com.bbs.common.pojo.EUDataGridResult;
import com.bbs.common.service.CommonService;
import com.bbs.pojo.SchoolInfo;
import com.bbs.pojo.vo.SchoolInfoVO;

/**
 * @ClassName: SchoolInfoService.java 
 * @Description: 学校信息service层  
 * @author: liuzhirong 
 * @Date: 2019年3月17日 下午5:37:28
 */
public interface SchoolInfoService extends CommonService<SchoolInfo>{
	/**
	 * @Description:前台获取学校信息
	 * @return:List<SchoolInfo>
	 * @author:liuzhirong 
	 * @Date:2019年3月17日 下午5:40:20
	 */
	
	public List<SchoolInfo> getSchoolInfoList();

	/**
	 * @Description:后台学校信息列表获取
	 * @return:EUDataGridResult
	 * @author:liuzhirong 
	 * @param schoolVO 
	 * @Date:2019年3月22日 下午5:25:43
	 */
	public EUDataGridResult getAdminList(Integer page, Integer rows, SchoolInfoVO schoolInfoVO);

	/**
	 * TODO:已删除学院列表
	 * @version 2019年3月23日下午11:15:01
	 * @author Juronk Liu
	 * @param schoolVO 
	 */
	public EUDataGridResult getAdminDelList(Integer page, Integer rows, SchoolInfoVO schoolInfoVO);

}
