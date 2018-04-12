package com.zhangqin.demo.sys.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zhangqin.framework.dal.entity.TenantEntity;

/**
 * 
 * ClassName: RoleType 
 * @Description: RoleType 实体类
 * @author zhangqin
 * @date 2018-3-30
 * 
 */
@TableName("sys_role_type")
public class RoleType extends TenantEntity {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	//columns
	/**
	 * 编码
	 */
	private String code; 
	/**
	 * 名称
	 */
	private String name; 
	/**
	 * 排序
	 */
	private Integer sort; 
	/**
	 * 备注
	 */
	private String remark; 
	
	//getter and setter
	/**
	 * 设置编码
	 * @param code 编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * 获取编码
	 * @return 编码
	 */
	public String getCode() {
		return this.code;
	}
	/**
	 * 设置名称
	 * @param name 名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取名称
	 * @return 名称
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 设置排序
	 * @param sort 排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	/**
	 * 获取排序
	 * @return 排序
	 */
	public Integer getSort() {
		return this.sort;
	}
	/**
	 * 设置备注
	 * @param remark 备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * 获取备注
	 * @return 备注
	 */
	public String getRemark() {
		return this.remark;
	}
}
