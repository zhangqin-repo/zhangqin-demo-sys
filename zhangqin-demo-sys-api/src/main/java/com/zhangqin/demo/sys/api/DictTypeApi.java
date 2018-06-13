package com.zhangqin.demo.sys.api;

import java.util.List;

import com.zhangqin.demo.sys.qo.DictTypeQO;
import com.zhangqin.demo.sys.vo.dict.DictTypeVO;

/**
 * 字典类型Api
 * @author zhangqin
 *
 */
public interface DictTypeApi {
	/**
	 * 查找基础代码字典类型列表
	 * @return
	 */
	List<DictTypeVO> findList(DictTypeQO qo);
	
	/**
	 * 查找基础代码字典类型列表
	 * @return
	 */
	List<DictTypeVO> findBaseCodeDictTypeList();

	/**
	 * 查找财务代码字典类型列表
	 * @return
	 */
	List<DictTypeVO> findFinanceCodeDictTypeList();
	
	/**
	 * 基础代码 字典类型编号
	 */
	public static final String BASE_CODE_TYPE_CODE = "01";
	
	/**
	 * 财务代码 字典类型编号
	 */
	public static final String FINANCE_CODE_TYPE_CODE = "02";
}
