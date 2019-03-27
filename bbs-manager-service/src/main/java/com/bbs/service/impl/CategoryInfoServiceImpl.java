
package com.bbs.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbs.common.pojo.EUDataGridResult;
import com.bbs.mapper.CatetoryInfoMapper;
import com.bbs.pojo.CatetoryInfo;
import com.bbs.pojo.CatetoryInfoExample;
import com.bbs.pojo.CatetoryInfoExample.Criteria;
import com.bbs.pojo.vo.CatetoryInfoVO;
import com.bbs.service.CatetoryInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @Description:栏目分类serviceImpl层
 * @author: liuzhirong 
 * @Date: 2019年3月20日 上午9:46:29
 */
@Service("catetoryInfoService")
public class CategoryInfoServiceImpl implements CatetoryInfoService {
	
	@Autowired
	private CatetoryInfoMapper catetoryInfoMapper;

	@Override
	public List<CatetoryInfo> getCatetoryInfos() {
		CatetoryInfoExample example = new CatetoryInfoExample();
		List<CatetoryInfo> catetoryInfoList = catetoryInfoMapper.selectByExample(example);
		return catetoryInfoList;
	}

	@Override
	public boolean add(CatetoryInfo catetoryInfo) {
		String catetoryId = UUID.randomUUID().toString().replaceAll("-", "");
		catetoryInfo.setCatetoryId(catetoryId);
		catetoryInfo.setCreateDate(new Date());
		catetoryInfo.setIsDel(0);
		catetoryInfo.setIsDown(1);
		return catetoryInfoMapper.insert(catetoryInfo) > 0 ? true : false;
	}

	@Override
	public boolean delete(CatetoryInfo catetoryInfo) {
		catetoryInfo.setIsDel(1);
		catetoryInfo.setUpdateDate(new Date());
		return catetoryInfoMapper.updateByPrimaryKeySelective(catetoryInfo) > 0 ? true : false; 
	}

	@Override
	public boolean update(CatetoryInfo catetoryInfo) {
		catetoryInfo.setUpdateDate(new Date());
		return catetoryInfoMapper.updateByPrimaryKeySelective(catetoryInfo) > 0 ? true : false; 
	}

	@Override
	public boolean completeDel(CatetoryInfo catetoryInfo) {
		return catetoryInfoMapper.deleteByPrimaryKey(catetoryInfo.getCatetoryId()) > 0 ? true : false;
	}

	@Override
	public boolean repealDel(CatetoryInfo catetoryInfo) {
		catetoryInfo.setIsDel(0);
		catetoryInfo.setUpdateDate(new Date());
		return catetoryInfoMapper.updateByPrimaryKeySelective(catetoryInfo) > 0 ? true : false; 
	}

	@Override
	public boolean batchDels(String[] ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EUDataGridResult getList(Integer page, Integer rows,CatetoryInfoVO catetoryInfoVO) {
		CatetoryInfoExample example = new CatetoryInfoExample();
		PageHelper.startPage(page, rows);
		Criteria criteria = example.createCriteria().andIsDelEqualTo(0).andIsDownEqualTo(0);
		queryCatetoryParas(catetoryInfoVO, criteria);
		List<CatetoryInfo> list = catetoryInfoMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<CatetoryInfo> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public boolean down(CatetoryInfo catetoryInfo) {
		catetoryInfo.setIsDown(1);
		catetoryInfo.setUpdateDate(new Date());
		return catetoryInfoMapper.updateByPrimaryKeySelective(catetoryInfo) > 0 ? true : false; 
	}

	@Override
	public EUDataGridResult getDownList(Integer page, Integer rows,CatetoryInfoVO catetoryInfoVO) {
		CatetoryInfoExample example = new CatetoryInfoExample();
		PageHelper.startPage(page, rows);
		Criteria criteria = example.createCriteria().andIsDelEqualTo(0).andIsDownEqualTo(1);
		queryCatetoryParas(catetoryInfoVO, criteria);
		List<CatetoryInfo> list = catetoryInfoMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<CatetoryInfo> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public boolean up(CatetoryInfo catetoryInfo) {
		catetoryInfo.setIsDown(0);
		catetoryInfo.setUpdateDate(new Date());
		return catetoryInfoMapper.updateByPrimaryKeySelective(catetoryInfo) > 0 ? true : false; 
	}

	@Override
	public EUDataGridResult getDelList(Integer page, Integer rows,CatetoryInfoVO catetoryInfoVO) {
		CatetoryInfoExample example = new CatetoryInfoExample();
		PageHelper.startPage(page, rows);
		Criteria criteria = example.createCriteria().andIsDelEqualTo(1);
		queryCatetoryParas(catetoryInfoVO, criteria);
		List<CatetoryInfo> list = catetoryInfoMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<CatetoryInfo> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	/**  
	 * @Description:查询参数
	 * @return:void
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午4:39:44  
	 */ 
	private void queryCatetoryParas(CatetoryInfoVO catetoryInfoVO,Criteria criteria) {
		if (catetoryInfoVO.getSearchCatetoryId() != null && catetoryInfoVO.getSearchCatetoryId() != "") {
			criteria.andCatetoryIdEqualTo(catetoryInfoVO.getSearchCatetoryId());
		}
		if (catetoryInfoVO.getSearchCatetoryName() != null && catetoryInfoVO.getSearchCatetoryName() != "") {
			criteria.andCatetoryNameLike("%"+catetoryInfoVO.getSearchCatetoryName()+"%");
		}
		if (catetoryInfoVO.getSearchParentId() != null && catetoryInfoVO.getSearchParentId() != "") {
			//之后完善
		}
	}

}
