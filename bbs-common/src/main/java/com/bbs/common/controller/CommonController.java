package com.bbs.common.controller;


/**
 * @Description:后台公有的控制层接口方法 controller
 * @author: liuzhirong 
 * @Date: 2019年3月26日 上午11:30:58
 */
public interface CommonController<T> {
	/**
	 * @Description:新增
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 上午11:47:15
	 */
	public String add(T t);
	/**
	 * @Description:删除，未彻底删除，更新字段标志
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 上午11:48:05
	 */
	public String delete(T t);
	/**
	 * @Description:更新
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 上午11:48:25
	 */
	public String update(T t) ;
	/**
	 * @Description:彻底删除，数据库删除
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 上午11:48:37
	 */
	public String completeDel(T t) ;
	/**
	 * @Description:撤销删除
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 上午11:49:54
	 */
	public String repealDel(T t);
	/**
	 * @Description:批量删除
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 上午11:51:04
	 */
	public String batchDels(String[] ids);
	/**
	 * @Description:获取操作结果
	 * @return:String
	 * @author:liuzhirong 
	 * @Date:2019年3月26日 上午11:51:29
	 */
	public String getResult(boolean success);

}
