package com.bbs.pojo.vo;

/**
 * @Description:帖子查询参数
 * @author: liuzhirong 
 * @Date: 2019年3月26日 下午5:16:58
 */
public class PostInfoVO {
	private String searchPostId;

    private String searchUserId;

    private String searchCatetoryId;

    private String searchPostTitle;

	public String getSearchPostId() {
		return searchPostId;
	}

	public void setSearchPostId(String searchPostId) {
		this.searchPostId = searchPostId;
	}

	public String getSearchUserId() {
		return searchUserId;
	}

	public void setSearchUserId(String searchUserId) {
		this.searchUserId = searchUserId;
	}

	public String getSearchCatetoryId() {
		return searchCatetoryId;
	}

	public void setSearchCatetoryId(String searchCatetoryId) {
		this.searchCatetoryId = searchCatetoryId;
	}

	public String getSearchPostTitle() {
		return searchPostTitle;
	}

	public void setSearchPostTitle(String searchPostTitle) {
		this.searchPostTitle = searchPostTitle;
	}
    
    
}
