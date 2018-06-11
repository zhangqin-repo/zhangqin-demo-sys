package com.zhangqin.demo.sys.vo.dict;

import java.io.Serializable;

import com.zhangqin.demo.sys.enums.YesOrNoEnum;

/**
 * 字典类型VO
 * 
 * @author zhangqin
 *
 */
public class DictTypeVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3096235880281023550L;

	/**
	 * 字典ID
	 */
	private String id;

	/**
	 * 父类型ID
	 */
	private String parentId;

	/**
	 * 类型编码
	 */
	private String typeCode;

	/**
	 * 类型名称
	 */
	private String typeName;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 是否系统类型
	 */
	private YesOrNoEnum system;

	/**
	 * 备注
	 */
	private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public YesOrNoEnum getSystem() {
		return system;
	}

	public void setSystem(YesOrNoEnum system) {
		this.system = system;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "DictTypeVo [id=" + id + ", parentId=" + parentId + ", typeCode=" + typeCode + ", typeName=" + typeName
				+ ", sort=" + sort + ", system=" + system + ", remark=" + remark + "]";
	}

}
