package com.zhangqin.demo.sys.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.zhangqin.framework.dal.entity.TenantEntity;

/**
 * 字典
 * 
 * @author zhangqin
 *
 */
@TableName("sys_dict")
public class Dict extends TenantEntity {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1956234606681667854L;

	/**
	 * 类型ID
	 */
	@TableField("type_id")
	private String typeId;

	/**
	 * 类型编号
	 */
	@TableField("type_code")
	private String typeCode;

	/**
	 * 字典编号
	 */
	@TableField("dict_code")
	private String dictCode;

	/**
	 * 字典名称
	 */
	@TableField("dict_name")
	private String dictName;

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

	/**
	 * 其他扩展信息，Json格式
	 */
	@TableField("ext_json")
	private String extJson;

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getDictCode() {
		return dictCode;
	}

	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
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

	public String getExtJson() {
		return extJson;
	}

	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

}
