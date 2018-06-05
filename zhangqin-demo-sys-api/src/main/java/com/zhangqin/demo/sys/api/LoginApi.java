package com.zhangqin.demo.sys.api;

public interface LoginApi {
	
	void login(String tenantCode, String loginName, String loginPassword);
}
