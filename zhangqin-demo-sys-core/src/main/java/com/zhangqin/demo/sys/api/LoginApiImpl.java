package com.zhangqin.demo.sys.api;

import com.zhangqin.demo.sys.exception.LoginException;
import com.zhangqin.demo.sys.vo.LoginVO;

public class LoginApiImpl implements LoginApi {

	@Override
	public LoginVO login(String tenantCode, String loginName, String loginPassword) throws LoginException {
		return null;
	}

}
