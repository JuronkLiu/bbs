
package com.bbs.common.service;

/**
 * @Description:公有的服务层接口方法 service
 * @author: liuzhirong 
 * @Date: 2019年3月26日 上午11:31:47
 */
public interface CommonService<T> {
	/**
	 * @Description:新增
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午1:40:17
	 */
	public boolean add(T t);
	/**
	 * @Description:删除
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午1:40:44
	 */
	public boolean delete(T t);
	/**
	 * @Description:更新
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午1:40:57
	 */
	public boolean update(T t) ;
	/**
	 * @Description:彻底删除，数据库删除
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午1:41:13
	 */
	public boolean completeDel(T t) ;
	/**
	 * @Description:撤销删除
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午1:41:27
	 */
	public boolean repealDel(T t);
	/**
	 * @Description:批量删除
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 下午1:41:44
	 */
	public boolean batchDels(String[] schoolIds);

}
