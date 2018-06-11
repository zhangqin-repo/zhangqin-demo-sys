package com.zhangqin.demo.sys.vo.dict.ext;

import java.io.Serializable;

import com.zhangqin.demo.sys.enums.RefundWayEnum;
import com.zhangqin.demo.sys.enums.YesOrNoEnum;

/**
 * POS支付类型专属扩展字段VO
 * 
 * @author zhangqin
 *
 */
public class PosPayTypeExtVO implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 741543007231693134L;

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
