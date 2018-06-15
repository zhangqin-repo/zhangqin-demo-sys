package com.zhangqin.demo.sys.api;

import com.zhangqin.demo.sys.vo.TenantVO;

/**
 * 租户API
 * 
 * @author zhangqin
 *
 */
public interface TenantApi {
	/**
	 * 根据租户编号获取租户VO
	 * 
	 * @return
	 */
	TenantVO getByCode();
}
