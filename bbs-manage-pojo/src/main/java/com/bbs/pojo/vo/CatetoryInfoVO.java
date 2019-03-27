package com.bbs.pojo.vo;

/**
 * @Description:栏目查询参数
 * @author: liuzhirong 
 * @Date: 2019年3月26日 上午11:57:18
 */
public class CatetoryInfoVO {
	
	private String searchCatetoryId;
    private String searchCatetoryName;
    private String searchParentId;
    
	public String getSearchCatetoryId() {
		return searchCatetoryId;
	}
	public void setSearchCatetoryId(String searchCatetoryId) {
		this.searchCatetoryId = searchCatetoryId;
	}
	public String getSearchCatetoryName() {
		return searchCatetoryName;
	}
	public void setSearchCatetoryName(String searchCatetoryName) {
		this.searchCatetoryName = searchCatetoryName;
	}
	public String getSearchParentId() {
		return searchParentId;
	}
	public void setSearchParentId(String searchParentId) {
		this.searchParentId = searchParentId;
	}
    
    

}
