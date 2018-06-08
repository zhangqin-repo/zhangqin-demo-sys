package com.zhangqin.demo.sys.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.zhangqin.framework.dal.entity.TenantEntity;

/**
 * 字典类型
 * 
 * @author zhangqin
 *
 */
@TableName("sys_dict_type")
public class DictType extends TenantEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6767232200785895554L;

	/**
	 * 父类型ID
	 */
	@TableField("parent_id")
	private String parentId;

	/**
	 * 类型编码
	 */
	@TableField("type_code")
	private String typeCode;

	/**
	 * 类型名称
	 */
	@TableField("type_name")
	private String typeName;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 是否系统类型
	 */
	private Boolean system;

	/**
	 * 备注
	 */
	private String remark;

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Boolean getSystem() {
		return system;
	}

	public void setSystem(Boolean system) {
		this.system = system;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
