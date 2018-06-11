package com.zhangqin.demo.sys.service;

import java.util.List;

import com.zhangqin.demo.sys.entity.DictType;
import com.zhangqin.demo.sys.qo.DictTypeQO;
import com.zhangqin.framework.service.IBaseService;

/**
 * 字典类型Service
 * @author zhangqin
 *
 */
public interface DictTypeService extends IBaseService<DictType> {
	List<DictType> listByQo(DictTypeQO qo);
}