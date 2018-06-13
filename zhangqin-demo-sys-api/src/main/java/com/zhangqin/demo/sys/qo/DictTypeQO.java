package com.zhangqin.demo.sys.qo;

import com.zhangqin.framework.gpe.annotation.NbsField;
import com.zhangqin.framework.gpe.entity.BaseQO;

/**
 * 字典类型QO
 * 
 * @author kun
 *
 */
public class DictTypeQO extends BaseQO {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 464851766629188781L;

	/**
	 * 关键字
	 */
	private String keyword;

	/**
	 * 类型编号
	 */
	@NbsField(title = "类型编号",tableAlias="sys_dict_type")
	private String typeCode;

	/**
	 * 类型名称
	 */
	@NbsField(title = "类型名称")
	private String typeName;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
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

	@Override
	public String toString() {
		return "DictTypeQO [keyword=" + keyword + ", typeCode=" + typeCode + ", typeName=" + typeName + "]";
	}

}
