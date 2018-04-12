package com.zhangqin.demo.sys.api;

import com.github.pagehelper.PageInfo;
import com.zhangqin.demo.sys.dto.RoleTypeDto;
import com.zhangqin.demo.sys.qo.RoleTypeQo;

/**
 * 角色类型Api接口
 * @author zhangqin
 *
 */
public interface RoleTypeApi {
	PageInfo<RoleTypeDto> findListPage(RoleTypeQo qo);
}
