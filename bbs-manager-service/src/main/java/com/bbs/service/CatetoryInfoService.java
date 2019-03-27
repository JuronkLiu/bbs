
package com.bbs.service;

import java.util.List;

import com.bbs.common.pojo.EUDataGridResult;
import com.bbs.common.service.CommonService;
import com.bbs.pojo.CatetoryInfo;
import com.bbs.pojo.vo.CatetoryInfoVO;

/**
 * @Description: 栏目分类service层
 * @author: liuzhirong 
 * @Date: 2019年3月20日 上午9:40:19
 */
public interface CatetoryInfoService extends CommonService<CatetoryInfo>{

	/**
	 * @Description:前台获取栏目分类
	 * @return:List<CatetoryInfo>
	 * @author:liuzhirong 
	 * @Date:2019年3月20日 上午9:45:22
	 */
	public List<CatetoryInfo> getCatetoryInfos();

	/**
	 * @Description:后台获取栏目信息
	 * @return:EUDataGridResult
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午2:06:53
	 */
	public EUDataGridResult getList(Integer page, Integer rows,CatetoryInfoVO catetoryInfoVO);

	/**
	 * @Description:栏目下架
	 * @return:boolean
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午3:48:33
	 */
	public boolean down(CatetoryInfo catetoryInfo);

	/**
	 * @Description:获取下架的栏目信息
	 * @return:EUDataGridResult
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午3:57:50
	 */
	public EUDataGridResult getDownList(Integer page, Integer rows,CatetoryInfoVO catetoryInfoVO);

	/**
	 * @Description:栏目上架
	 * @return:boolean
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午4:15:46
	 */
	public boolean up(CatetoryInfo catetoryInfo);

	/**
	 * @Description:已删除栏目列表
	 * @return:EUDataGridResult
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午4:30:24
	 */
	public EUDataGridResult getDelList(Integer page, Integer rows,CatetoryInfoVO catetoryInfoVO);
}
