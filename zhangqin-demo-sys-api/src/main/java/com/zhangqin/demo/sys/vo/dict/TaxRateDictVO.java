package com.zhangqin.demo.sys.vo.dict;

import java.math.BigDecimal;

/**
 * 税率（进项税、销项税）
 * 
 * @author zhangqin
 *
 */
public class TaxRateDictVO extends DictVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6221818447654586453L;
	/**
	 * 比率
	 */
	private BigDecimal rate;

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

}
