package com.zhangqin.demo.sys.enums;

import com.zhangqin.framework.common.enums.BaseEnum;

/**
 * 退款方式
 * 
 * @author zhangqin
 *
 */
public enum RefundWayEnum implements BaseEnum<RefundWayEnum, Integer> {
	/**
	 * 现金退款
	 */
	CASH("现金退款", 1),
	/**
	 * 原路退款
	 */
	ORIGINAL("原路退款", 2),
	/**
	 * 不退
	 */
	NO("不退", 3);

	/**
	 * 枚举显示值
	 */
	private String desc;

	/**
	 * 枚举值
	 */
	private Integer value;

	/**
	 * 
	 * <p>
	 * Title: 构造函数
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param name
	 * @param value
	 */
	RefundWayEnum(String desc, Integer value) {
		this.desc = desc;
		this.value = value;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.okdeer.newretail.common.enums.BaseEnum#desc()
	 */
	@Override
	public String getDesc() {
		return desc;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.okdeer.newretail.common.enums.BaseEnum#value()
	 */
	@Override
	public Integer getValue() {
		return value;
	}
}
