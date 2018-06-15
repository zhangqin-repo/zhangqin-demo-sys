package com.zhangqin.demo.sys.exception;

import com.zhangqin.framework.common.exception.BizException;

/**
 * 登录异常
 * 系统服务异常均以[1001]开头，登录异常以[100101]开头 <br>
 * @author zhangqin
 *
 */
public class LoginException extends BizException {

	public LoginException(int tenantNotExist, String string) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6363549251670709353L;

	/**
	 * 租户不存在01
	 */
	public static final int TENANT_NOT_EXIST = 10010101;
	
	/**
	 * 账号或密码错误02
	 */
	public static final int ACCOUNT_OR_PASSWORD_ERROR = 10010102;
	
	/**
	 * 账号被停用03
	 */
	public static final int ACCOUNT_DISABLED = 10010102;

}
