package com.zhangqin.demo.sys.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhangqin.demo.sys.entity.DictType;
import com.zhangqin.demo.sys.qo.DictTypeQO;
import com.zhangqin.demo.sys.service.DictTypeService;
import com.zhangqin.demo.sys.vo.dict.DictTypeVO;
import com.zhangqin.framework.common.enums.CompareOperator;
import com.zhangqin.framework.common.utils.BeanMapper;

/**
 * 字典类型Api实现
 * 
 * @author zhangqin
 *
 */
@Service
public class DictTypeApiImpl implements DictTypeApi {
	/**
	 * 字典类型Service
	 */
	@Autowired
	private DictTypeService dictTypeService;

	@Override
	public List<DictTypeVO> findList(DictTypeQO qo) {
		List<DictType> list = dictTypeService.listByQo(qo);
		return BeanMapper.mapList(list, DictTypeVO.class);
	}

	@Override
	public List<DictTypeVO> findBaseCodeDictTypeList() {
		DictTypeQO qo = new DictTypeQO();
		qo.setTypeCode("01");
		
		// 设置规则
		qo.getNbsRules().add("typeCode", CompareOperator.LR);
		
		List<DictType> list = dictTypeService.listByQo(qo);

		return BeanMapper.mapList(list, DictTypeVO.class);
	}

	@Override
	public List<DictTypeVO> findFinanceCodeDictTypeList() {
		DictTypeQO qo = new DictTypeQO();
		qo.setTypeCode("02");
		// 设置规则
		qo.getNbsRules().add("typeCode", CompareOperator.LR);
				
		List<DictType> list = dictTypeService.listByQo(qo);

		return BeanMapper.mapList(list, DictTypeVO.class);
	}

}
