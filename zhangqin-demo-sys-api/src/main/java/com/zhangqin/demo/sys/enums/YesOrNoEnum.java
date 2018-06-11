package com.zhangqin.demo.sys.enums;

import com.zhangqin.framework.common.enums.BaseEnum;

/**
 * 
 * ClassName: YesOrNoEnum 
 * @Description: 是否枚举类
 *
 * =================================================================================================
 *     Task ID			  Date			     Author		      Description
 * ----------------+----------------+-------------------+-------------------------------------------
 *	
 */

public enum YesOrNoEnum implements BaseEnum<YesOrNoEnum,Boolean> {

    /**
     * 启用
     */
    NO("否", false),
    /**
     * 禁用
     */
    YES("是", true);

    /**
     * 枚举显示值
     */
    private String desc;

    /**
     * 枚举值
     */
    private Boolean value;

    /**
     * 
     * <p>Title: 构造函数</p> 
     * <p>Description: </p> 
     * @param name
     * @param value
     */
    YesOrNoEnum(String desc, Boolean value) {
        this.desc = desc;
        this.value = value;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public Boolean getValue() {
        return this.value;
    }
}
