package com.zhangqin.demo.sys.qo;

import java.io.Serializable;
import java.util.List;

import com.zhangqin.framework.common.qo.BaseQo;

/**
 * 字典查询对象
 * @author zhangqin
 *
 */
public class DictQo extends BaseQo implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1590290097062014882L;

	/**
	 * 字典类型编码
	 */
	private String typeCode;
	
	/**
	 * 关键字
	 */
	private String keyword;
	
	/**
	 * ID集合
	 */
	private List<String> ids;

	/**
	 * 商户id
	 */
	private String tenantId;

	/**
	 * 类型id
	 */
	private String typeId;

	/**
	 * 是否删除,true-已删除,false-未删除
	 */
	private boolean deleted;

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
