package com.zhangqin.demo.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangqin.demo.sys.entity.DictType;
import com.zhangqin.demo.sys.mapper.DictTypeMapper;
import com.zhangqin.demo.sys.qo.DictTypeQO;
import com.zhangqin.demo.sys.service.DictTypeService;
import com.zhangqin.framework.dal.mapper.IBaseMapper;
import com.zhangqin.framework.service.BaseServiceImpl;

/**
 * 字典类型Service实现
 * @author zhangqin
 *
 */
@Service
public class DictTypeServiceImpl extends BaseServiceImpl<DictType> implements DictTypeService  {

	/**
	 * 字典类型Mapper
	 */
	@Autowired
	private DictTypeMapper mapper;
	
	@Override
	public IBaseMapper<DictType> getBaseMapper() {
		return mapper;
	}

	@Override
	public List<DictType> listByQo(DictTypeQO qo) {
		return mapper.listByQo(qo);
	}

}
