package com.zhangqin.demo.sys.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangqin.demo.sys.dto.RoleTypeDto;
import com.zhangqin.demo.sys.entity.RoleType;
import com.zhangqin.demo.sys.mapper.RoleTypeMapper;
import com.zhangqin.demo.sys.qo.RoleTypeQo;
import com.zhangqin.framework.common.dubbo.UserSelector;
import com.zhangqin.framework.common.utils.BeanMapper;

@Service
public class RoleTypeApiImpl implements RoleTypeApi {
	@Autowired
	private RoleTypeMapper roleTypeMapper;
	
	public PageInfo<RoleTypeDto> findListPage(RoleTypeQo qo) {

		for (int i = 0; i < 10; i++) {
			System.out.println(UserSelector.getUserId());
		}
		test();
		
		PageHelper.startPage(qo.getPage(), qo.getRows());
		List<RoleType> list = roleTypeMapper.selectList(new EntityWrapper<RoleType>());
		PageInfo<RoleType> page = new PageInfo<RoleType>(list);
		
		List<RoleTypeDto> dtoList = BeanMapper.mapList(list, RoleTypeDto.class);
		PageInfo<RoleTypeDto> newPage = new PageInfo<RoleTypeDto>();
		BeanMapper.copy(page, newPage);
		newPage.setList(dtoList);
		
		return newPage;
	}
	
	public void test() {
		for (int i = 0; i < 10; i++) {
			System.out.println(UserSelector.getUserId());
		}
	}

}
