package com.bbs.service;

import com.bbs.common.pojo.EUDataGridResult;
import com.bbs.common.service.CommonService;
import com.bbs.pojo.UserInfo;
import com.bbs.pojo.vo.UserInfoVO;
import com.github.pagehelper.PageInfo;

/**
 * @ClassName: UserInfoService.java 
 * @Description: 用户信息接口 
 * @author: liuzhirong 
 * @Date: 2019年3月13日 下午2:29:55
 */
public interface UserInfoService extends CommonService<UserInfo> {
	/**
	 * @Description:按照用户ID查询用户
	 * @return:UserInfo
	 * @author:liuzhirong 
	 * @Date:2019年3月13日 下午2:31:49
	 */
	public UserInfo findUserById(String id);
	/**
	 * @Description:查询所有用户
	 * @return:UserInfo
	 * @author:liuzhirong 
	 * @Date:2019年3月13日 下午5:27:07
	 */
	public PageInfo<UserInfo> getUserPage();
	/**
	 * @Description:用户登陆
	 * @return:boolean
	 * @author:liuzhirong 
	 * @param namePhoneEmail 
	 * @Date:2019年3月18日 上午10:05:16
	 */
	public boolean login(String namePhoneEmail, UserInfo userInfo);
	/**
	 * @Description:用户注册
	 * @return:boolean
	 * @author:liuzhirong 
	 * @Date:2019年3月18日 下午5:51:33
	 */
	public boolean register(UserInfo userInfo);
	/**
	 * TODO:后台用户信息列表
	 * @version 2019年3月22日上午12:38:55
	 * @author Juronk Liu
	 * @param userVO 
	 */
	public EUDataGridResult getUserList(Integer page, Integer rows, UserInfoVO userVO);
	/**
	 * TODO:后台用户警告
	 * @version 2019年3月26日上午12:16:13
	 * @author Juronk Liu
	 */
	public boolean warn(UserInfo userInfo);
	/**
	 * TODO:用户警告列表
	 * @version 2019年3月26日上午1:03:30
	 * @author Juronk Liu
	 */
	public EUDataGridResult getwarnList(Integer page, Integer rows, UserInfoVO userVO);
	/**
	 * TODO:撤销警告用户
	 * @version 2019年3月26日上午1:29:25
	 * @author Juronk Liu
	 */
	public boolean recoverWarn(UserInfo userInfo);
	/**
	 * TODO:拉黑用户
	 * @version 2019年3月26日上午1:29:43
	 * @author Juronk Liu
	 */
	public boolean lock(UserInfo userInfo);
	/**
	 * TODO:黑名单列表
	 * @version 2019年3月26日上午1:52:39
	 * @author Juronk Liu
	 */
	public EUDataGridResult getblacklist(Integer page, Integer rows, UserInfoVO userVO);
	/**
	 * TODO:移除黑名单
	 * @version 2019年3月26日上午2:07:38
	 * @author Juronk Liu
	 */
	public boolean recoverLock(UserInfo userInfo);
	/**
	 * TODO:已删除用户列表
	 * @version 2019年3月26日上午2:23:46
	 * @author Juronk Liu
	 */
	public EUDataGridResult getDelList(Integer page, Integer rows, UserInfoVO userVO);
	
}
