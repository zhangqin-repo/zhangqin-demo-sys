package com.zhangqin.demo.sys.qo;

import com.zhangqin.framework.common.qo.BaseQo;

public class DictTypeQO extends BaseQo {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 464851766629188781L;

	/**
	 * 类型编号
	 */
	private String typeCode;

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	@Override
	public String toString() {
		return "DictTypeQo [typeCode=" + typeCode + "]";
	}
	
}
