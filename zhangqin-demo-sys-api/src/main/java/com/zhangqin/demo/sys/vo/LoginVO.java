package com.zhangqin.demo.sys.vo;

import java.io.Serializable;

/**
 * 登录信息VO
 * 
 * @author zhangqin
 *
 */
public class LoginVO implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2357048227889969247L;

	/**
	 * 租户ID
	 */
	private String tenantId;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 用户姓名
	 */
	private String userName;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "LoginVO [tenantId=" + tenantId + ", userId=" + userId + ", userName=" + userName + "]";
	}

}
