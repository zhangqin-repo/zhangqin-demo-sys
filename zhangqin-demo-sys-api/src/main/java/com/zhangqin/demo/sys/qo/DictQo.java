package com.zhangqin.demo.sys.qo;

import com.zhangqin.framework.common.qo.BaseQo;

/**
 * 字典QO
 * @author kun
 *
 */
public class DictQo extends BaseQo {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5832671678397889131L;

	/**
	 * 字典编号
	 */
	private String dictCode;

	/**
	 * 字典名称
	 */
	private String dictName;

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

	@Override
	public String toString() {
		return "DictQo [dictCode=" + dictCode + ", dictName=" + dictName + ", toString()=" + super.toString() + "]";
	}

}
