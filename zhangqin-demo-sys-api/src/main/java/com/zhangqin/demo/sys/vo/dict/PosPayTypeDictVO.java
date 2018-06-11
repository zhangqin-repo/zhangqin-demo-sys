package com.zhangqin.demo.sys.vo.dict;

import com.zhangqin.demo.sys.enums.RefundWayEnum;
import com.zhangqin.demo.sys.enums.YesOrNoEnum;

/**
 * POS支付类型
 * 
 * @author zhangqin
 *
 */
public class PosPayTypeDictVO extends DictVO {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7832495608714292472L;

	/**
	 * 退款方式
	 */
	private RefundWayEnum refundWay;

	/**
	 * 前台展示
	 */
	private YesOrNoEnum frontShow;

	public RefundWayEnum getRefundWay() {
		return refundWay;
	}

	public void setRefundWay(RefundWayEnum refundWay) {
		this.refundWay = refundWay;
	}

	public YesOrNoEnum getFrontShow() {
		return frontShow;
	}

	public void setFrontShow(YesOrNoEnum frontShow) {
		this.frontShow = frontShow;
	}

}
