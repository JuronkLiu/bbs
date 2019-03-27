/**
 * @ClassName: EUDataGridResult.java 
 * @Description: TODO  
 *
 * @author: liuzhirong 
 * @Date: 2019年2月11日 上午10:59:58
 */
package com.bbs.common.pojo;

import java.util.List;

/**
 * 分页数据的传递实体类
 */
public class EUDataGridResult {

	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
