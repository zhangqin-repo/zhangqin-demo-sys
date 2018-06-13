package com.zhangqin.demo.sys.qo;

import com.zhangqin.framework.gpe.annotation.NbsField;
import com.zhangqin.framework.gpe.entity.BaseQO;

public class RoleTypeQo extends BaseQO {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6517660983880797198L;

	@NbsField(title = "关键字")
	private String keyword;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
