package com.zhangqin.demo.sys.vo;

import com.zhangqin.framework.gpe.annotation.GpeField;
import com.zhangqin.framework.gpe.annotation.GpeHeader;

/**
 * 字典VO
 * 
 * @author kun
 *
 */
@GpeHeader(title = "字典")
public class DictVo {

	/**
	 * 类型ID
	 */
	private String typeId;

	/**
	 * 类型编号
	 */
	@GpeField(title = "类型编号")
	private String typeCode;

	/**
	 * 字典编号
	 */
	@GpeField(title = "字典编号")
	private String dictCode;

	/**
	 * 字典名称
	 */
	@GpeField(title = "字典名称")
	private String dictName;

	/**
	 * 排序
	 */
	@GpeField(title = "排序")
	private Integer sort;

	/**
	 * 是否系统类型
	 */
	private Boolean system;

	/**
	 * 备注
	 */
	@GpeField(title = "备注")
	private String remark;

	/**
	 * 其他扩展信息，Json格式
	 */
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

	@Override
	public String toString() {
		return "DictVo [typeId=" + typeId + ", typeCode=" + typeCode + ", dictCode=" + dictCode + ", dictName="
				+ dictName + ", sort=" + sort + ", system=" + system + ", remark=" + remark + ", extJson=" + extJson
				+ "]";
	}

}
