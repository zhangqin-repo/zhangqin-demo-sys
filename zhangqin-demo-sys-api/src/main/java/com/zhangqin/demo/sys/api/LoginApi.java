package com.zhangqin.demo.sys.api;

import com.zhangqin.demo.sys.exception.LoginException;
import com.zhangqin.demo.sys.vo.LoginVO;

/**
 * 登录API
 * @author zhangqin
 *
 */
public interface LoginApi {
	/**
	 * 
	 * @param tenantCode 租户编号
	 * @param loginName 登录账号
	 * @param loginPassword 登录密码
	 * @return
	 */
	LoginVO login(String tenantCode, String loginName, String loginPassword) throws LoginException;
}
