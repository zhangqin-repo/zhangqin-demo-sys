package com.zhangqin.demo.sys.mapper;

import java.util.List;

import com.zhangqin.demo.sys.entity.DictType;
import com.zhangqin.demo.sys.qo.DictTypeQO;
import com.zhangqin.framework.dal.mapper.IBaseMapper;

/**
 * 字典类型Mapper
 * @author zhangqin
 *
 */
public interface DictTypeMapper extends IBaseMapper<DictType> {
	/**
	 * 根据QO查询字典类型列表
	 * @param qo
	 * @return
	 */
	List<DictType> listByQo(DictTypeQO qo);
}
