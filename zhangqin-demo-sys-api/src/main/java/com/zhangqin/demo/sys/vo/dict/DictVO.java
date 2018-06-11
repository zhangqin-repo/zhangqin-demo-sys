package com.zhangqin.demo.sys.vo.dict;

import java.io.Serializable;

import com.zhangqin.demo.sys.enums.YesOrNoEnum;
import com.zhangqin.framework.gpe.annotation.GpeField;
import com.zhangqin.framework.gpe.annotation.GpeHeader;
import com.zhangqin.framework.gpe.enums.DockType;

/**
 * 字典VO
 * 
 * @author zhangqin
 *
 */
@GpeHeader(title = "字典")
public class DictVO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2006571095752411889L;

	/**
	 * 字典ID
	 */
	private String id;

	/**
	 * 字典类型ID
	 */
	private String typeId;

	/**
	 * 字典编号
	 */
	@GpeField(title = "字典编号", docks = DockType.EASYUI_FORMATTER)
	private String dictCode;

	/**
	 * 字典名称
	 */
	@GpeField(title = "字典名称")
	private String dictName;

	/**
	 * 字典类型编号
	 */
	private String typeCode;

	/**
	 * 字典类型名称
	 */
	@GpeField(title = "所属分类")
	private String typeName;

	/**
	 * 是否系统字段
	 */
	@GpeField(title = "是否系统字段")
	private YesOrNoEnum system;

	/**
	 * 排序
	 */
	@GpeField(title = "排序")
	private Integer sort;

	/**
	 * 备注
	 */
	@GpeField(title = "备注")
	private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
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

	public YesOrNoEnum getSystem() {
		return system;
	}

	public void setSystem(YesOrNoEnum system) {
		this.system = system;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "DictVo [id=" + id + ", typeId=" + typeId + ", dictCode=" + dictCode + ", dictName=" + dictName
				+ ", typeCode=" + typeCode + ", typeName=" + typeName + ", system=" + system + ", sort=" + sort
				+ ", remark=" + remark + "]";
	}

}
