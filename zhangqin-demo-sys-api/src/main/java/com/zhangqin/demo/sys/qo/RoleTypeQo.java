package com.zhangqin.demo.sys.qo;

import com.zhangqin.framework.common.qo.BaseQo;
import com.zhangqin.framework.gpe.annotation.GpeSearchField;

public class RoleTypeQo extends BaseQo {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6517660983880797198L;

	@GpeSearchField(title = "关键字")
	private String keyword;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
