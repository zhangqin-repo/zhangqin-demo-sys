package com.zhangqin.demo.sys.qo;

import java.util.List;

import com.zhangqin.framework.gpe.entity.BaseQO;

public class DictTypeQO extends BaseQO {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 464851766629188781L;

	/**
	 * 类型编号
	 */
	private String typeCode;
	
	List<String> test;

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
	

	public List<String> getTest() {
		return test;
	}

	public void setTest(List<String> test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "DictTypeQo [typeCode=" + typeCode + "]";
	}
	
}
