package com.zhangqin.demo.sys.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zhangqin.framework.dal.entity.TenantEntity;

/**
 * 登录账号实体类
 * 
 * @author zhangqin
 *
 */
@TableName("sys_login_account")
public class LoginAccount extends TenantEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4930528356050336397L;

	/**
	 * 登录账号
	 */
	private String loginName;
	/**
	 * 登录密码
	 */
	private String loginPassword;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

}
