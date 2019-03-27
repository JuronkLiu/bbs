package com.bbs.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbs.common.pojo.EUDataGridResult;
import com.bbs.mapper.SchoolInfoMapper;
import com.bbs.mapper.UserInfoMapper;
import com.bbs.pojo.UserInfo;
import com.bbs.pojo.UserInfoExample;
import com.bbs.pojo.UserInfoExample.Criteria;
import com.bbs.pojo.vo.UserInfoVO;
import com.bbs.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @ClassName: UserInfoServiceImpl.java 
 * @Description: 用户信息实现层 
 * @author: liuzhirong 
 * @Date: 2019年3月13日 下午2:32:37
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{
	//用@Resource获取容器中name为userMapper的变量赋值给该类中的成员变量userMapper
	@Resource(name="userInfoMapper")
	private UserInfoMapper userInfoMapper;
	@Autowired
	private SchoolInfoMapper schoolInfoMapper;
	
	@Override
	public UserInfo findUserById(String id){
		return userInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo<UserInfo> getUserPage() {
		PageHelper.startPage(1, 10);
		UserInfoExample example = new UserInfoExample();
		List<UserInfo> userList = userInfoMapper.selectByExample(example );
		PageInfo<UserInfo> pageInfo = new PageInfo<>(userList);
		return pageInfo;
	}

	@Override
	public boolean login(String namePhoneEmail,UserInfo userInfo) {
		UserInfoExample example = new UserInfoExample();
		List<UserInfo> userList = null;
		Criteria criteria = null;
		if (namePhoneEmail != null && userInfo.getUserPassword() != null) {
			if (Pattern.compile("^1(3|5|7|8|4)\\d{9}").matcher(namePhoneEmail).matches()) {
				criteria = example.createCriteria().andUserTelephoneEqualTo(namePhoneEmail);
			}else if (Pattern.compile("[a-zA-Z0-9_]{3,20}@[a-zA-Z0-9]{2,10}[.](com|cn|org)").matcher(namePhoneEmail).matches()) {
				criteria = example.createCriteria().andUserEmailEqualTo(namePhoneEmail);
			}else {
				criteria = example.createCriteria().andUserNickNameEqualTo(namePhoneEmail);
			}
		}
		criteria.andUserPasswordEqualTo(userInfo.getUserPassword());
		userList = userInfoMapper.selectByExample(example);
		if (userList.size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean register(UserInfo userInfo) {
		String userId = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		userInfo.setUserId(userId);
		userInfo.setCreateDate(new Date());
		int insert = userInfoMapper.insert(userInfo);
		if (insert > 0) {
			return true;
		}
		return false;
	}

	@Override
	public EUDataGridResult getUserList(Integer page, Integer rows, UserInfoVO userVO) {
		UserInfoExample example = new UserInfoExample();
		PageHelper.startPage(page, rows);
		Criteria criteria = example.createCriteria().andIsDelEqualTo(0);
		criteria.andIsLockEqualTo(0);
		userQueryParams(userVO, criteria);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<UserInfo> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	/**
	 * TODO:用户参数参数
	 * @version 2019年3月26日上午12:56:24
	 * @author Juronk Liu
	 */
	private void userQueryParams(UserInfoVO userVO, Criteria criteria) {
		if (userVO.getSearchUserId() != null && userVO.getSearchUserId() != "") {
			criteria.andUserIdEqualTo(userVO.getSearchUserId());
		}
		if (userVO.getSearchUserNo() != null ) {
			criteria.andUserNoEqualTo(userVO.getSearchUserNo());
		}
		if (userVO.getSearchUserNickName() != null && userVO.getSearchUserNickName() != "") {
			criteria.andUserNickNameLike("%"+userVO.getSearchUserNickName()+"%");
		}
		if (userVO.getSearchUserRealName() != null && userVO.getSearchUserRealName() != "") {
			criteria.andUserRealNameLike("%"+userVO.getSearchUserRealName()+"%");
		}
		if (userVO.getSearchUserSchool() != null && userVO.getSearchUserSchool() != "") {
			//缺省，联表查询
		}
	}

	@Override
	public boolean add(UserInfo userInfo) {
		String userId = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		userInfo.setUserId(userId);
		userInfo.setWarnTime(0);
		userInfo.setCreateDate(new Date());
		userInfo.setIsDel(0);
		userInfo.setIsLock(0);
		int insert = userInfoMapper.insert(userInfo);
		if (insert > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(UserInfo userInfo) {
		userInfo.setIsDel(1);
		userInfo.setUpdateDate(new Date());
		int delete = userInfoMapper.updateByPrimaryKeySelective(userInfo);
		if (delete > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(UserInfo userInfo) {
		userInfo.setUpdateDate(new Date());
		int update = userInfoMapper.updateByPrimaryKeySelective(userInfo);
		if (update > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean completeDel(UserInfo userInfo) {
		int completeDel = userInfoMapper.deleteByPrimaryKey(userInfo.getUserId());
		if (completeDel > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean repealDel(UserInfo userInfo) {
		userInfo.setIsDel(0);
		userInfo.setUpdateDate(new Date());
		int recover = userInfoMapper.updateByPrimaryKeySelective(userInfo);
		if (recover > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean batchDels(String[] arr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean warn(UserInfo userInfo) {
		UserInfo findUser = findUserById(userInfo.getUserId());
		if (findUser.getWarnTime() != null) {
			userInfo.setWarnTime(findUser.getWarnTime()+1);
		}else {
			userInfo.setWarnTime(1);
		}
		userInfo.setUpdateDate(new Date());
		int warn = userInfoMapper.updateByPrimaryKeySelective(userInfo);
		if (warn > 0) {
			return true;
		}
		return false;
	}

	@Override
	public EUDataGridResult getwarnList(Integer page, Integer rows, UserInfoVO userVO) {
		UserInfoExample example = new UserInfoExample();
		PageHelper.startPage(page, rows);
		Criteria criteria = example.createCriteria().andIsDelEqualTo(0);
		criteria.andWarnTimeNotEqualTo(0);
		criteria.andIsLockNotEqualTo(1);
		userQueryParams(userVO, criteria);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<UserInfo> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public boolean recoverWarn(UserInfo userInfo) {
		userInfo.setWarnTime(0);
		userInfo.setUpdateDate(new Date());
		int recoverWarn = userInfoMapper.updateByPrimaryKeySelective(userInfo);
		if (recoverWarn > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean lock(UserInfo userInfo) {
		userInfo.setIsLock(1);
		userInfo.setUpdateDate(new Date());
		int lock = userInfoMapper.updateByPrimaryKeySelective(userInfo);
		return lock > 0 ? true : false;
	}

	@Override
	public EUDataGridResult getblacklist(Integer page, Integer rows, UserInfoVO userVO) {
		UserInfoExample example = new UserInfoExample();
		PageHelper.startPage(page, rows);
		Criteria criteria = example.createCriteria().andIsDelEqualTo(0);
		criteria.andIsLockEqualTo(1);
		userQueryParams(userVO, criteria);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<UserInfo> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public boolean recoverLock(UserInfo userInfo) {
		userInfo.setIsLock(0);
		userInfo.setUpdateDate(new Date());
		int recoverLock = userInfoMapper.updateByPrimaryKeySelective(userInfo);
		return recoverLock > 0 ? true : false;
	}

	@Override
	public EUDataGridResult getDelList(Integer page, Integer rows, UserInfoVO userVO) {
		UserInfoExample example = new UserInfoExample();
		PageHelper.startPage(page, rows);
		Criteria criteria = example.createCriteria().andIsDelEqualTo(1);
		userQueryParams(userVO, criteria);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<UserInfo> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
}
