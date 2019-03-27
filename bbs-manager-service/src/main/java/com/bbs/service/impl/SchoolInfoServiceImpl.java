package com.bbs.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.bbs.common.pojo.EUDataGridResult;
import com.bbs.mapper.SchoolInfoMapper;
import com.bbs.pojo.SchoolInfo;
import com.bbs.pojo.SchoolInfoExample;
import com.bbs.pojo.SchoolInfoExample.Criteria;
import com.bbs.pojo.vo.SchoolInfoVO;
import com.bbs.service.SchoolInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @ClassName: SchoolInfoServiceImpl.java 
 * @Description: 学校信息serviceImpl层 
 * @author: liuzhirong 
 * @Date: 2019年3月17日 下午5:44:06
 */
@Controller("schoolInfoService")
public class SchoolInfoServiceImpl implements SchoolInfoService{
	
	@Autowired
	private SchoolInfoMapper schoolInfoMapper;

	@Override
	public List<SchoolInfo> getSchoolInfoList() {
		SchoolInfoExample example = new SchoolInfoExample();
		List<SchoolInfo> schoolInfoList = schoolInfoMapper.selectByExample(example);
		return schoolInfoList;
	}

	@Override
	public EUDataGridResult getAdminList(Integer page, Integer rows,SchoolInfoVO schoolInfoVO) {
		SchoolInfoExample example = new SchoolInfoExample();
		PageHelper.startPage(page, rows);
		Criteria criteria = example.createCriteria().andIsDelEqualTo(0);
		querySchoolParas(schoolInfoVO, criteria);
		List<SchoolInfo> list = schoolInfoMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<SchoolInfo> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	/**
	 * TODO:查询参数
	 * @version 2019年3月24日下午10:11:03
	 * @author Juronk Liu
	 */
	
	private void querySchoolParas(SchoolInfoVO schoolInfoVO, Criteria criteria) {
		if (schoolInfoVO != null) {
			if (schoolInfoVO.getSearchSchoolId() != null) {
				criteria.andSchoolIdEqualTo(schoolInfoVO.getSearchSchoolId());
			}
			if (schoolInfoVO.getSearchSchoolName() != null && schoolInfoVO.getSearchSchoolName() != "") {
				criteria.andSchoolNameLike("%"+schoolInfoVO.getSearchSchoolName()+"%");
			}
			if (schoolInfoVO.getSearchSchoolArea() != null && schoolInfoVO.getSearchSchoolArea() != "") {
				criteria.andSchoolAreaLike("%"+schoolInfoVO.getSearchSchoolArea()+"%");
			}
		}
	}

	@Override
	public boolean add(SchoolInfo schoolInfo) {
		schoolInfo.setCreateDate(new Date());
		schoolInfo.setIsDel(0);
		int insert = schoolInfoMapper.insert(schoolInfo);
		if (insert > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(SchoolInfo schoolInfo) {
		schoolInfo.setIsDel(1);
		schoolInfo.setUpdateDate(new Date());
		int delete = schoolInfoMapper.updateByPrimaryKeySelective(schoolInfo);
		if (delete > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(SchoolInfo schoolInfo) {
		schoolInfo.setUpdateDate(new Date());
		int update = schoolInfoMapper.updateByPrimaryKeySelective(schoolInfo);
		if (update > 0) {
			return true;
		}
		return false;
	}

	@Override
	public EUDataGridResult getAdminDelList(Integer page, Integer rows, SchoolInfoVO schoolInfoVO) {
		SchoolInfoExample example = new SchoolInfoExample();
		PageHelper.startPage(page, rows);
		Criteria criteria = example.createCriteria().andIsDelEqualTo(1);
		querySchoolParas(schoolInfoVO, criteria);
		List<SchoolInfo> list = schoolInfoMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<SchoolInfo> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public boolean completeDel(SchoolInfo schoolInfo) {
		int completeDel = schoolInfoMapper.deleteByPrimaryKey(schoolInfo.getSchoolId());
		if (completeDel > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean repealDel(SchoolInfo schoolInfo) {
		schoolInfo.setIsDel(0);
		schoolInfo.setUpdateDate(new Date());
		int recover = schoolInfoMapper.updateByPrimaryKeySelective(schoolInfo);
		if (recover > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean batchDels(String[] arr) {
		SchoolInfo schoolInfo = new SchoolInfo();
		for (String str : arr) {
			schoolInfo.setSchoolId(str);
			schoolInfo.setIsDel(1);
			schoolInfo.setUpdateDate(new Date());
			schoolInfoMapper.updateByPrimaryKeySelective(schoolInfo);
		}
		return true;
	}

}
