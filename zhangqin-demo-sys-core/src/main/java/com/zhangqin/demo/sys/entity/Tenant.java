package com.zhangqin.demo.sys.entity;

import com.zhangqin.framework.dal.entity.BaseEntity;

public class Tenant extends BaseEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6527175827503721761L;

	/**
	 * 租户编号
	 */
	private String tenantCode;

	/**
	 * 租户名称
	 */
	private String tenantName;

	public String getTenantCode() {
		return tenantCode;
	}

	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

}
