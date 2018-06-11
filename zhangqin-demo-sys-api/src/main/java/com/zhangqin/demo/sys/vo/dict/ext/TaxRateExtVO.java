package com.zhangqin.demo.sys.vo.dict.ext;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 税率专属扩展字段VO
 * 
 * @author zhangqin
 *
 */
public class TaxRateExtVO implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7585967915215182355L;
	
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
