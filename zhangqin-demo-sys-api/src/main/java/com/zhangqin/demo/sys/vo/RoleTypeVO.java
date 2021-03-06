package com.zhangqin.demo.sys.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhangqin.framework.gpe.annotation.GpeField;
import com.zhangqin.framework.gpe.annotation.GpeHeader;
import com.zhangqin.framework.gpe.enums.DockType;

/**
 * 角色类型VO
 * 
 * @author zhangqin
 *
 */
@GpeHeader(title = "角色类型")
public class RoleTypeVO implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6026392090176149842L;

	/**
	 * ID
	 */
	@GpeField
	private String id;

	/**
	 * 编号
	 */
	@GpeField(docks = { DockType.EASYUI_FORMATTER, DockType.EASYUI_EDITOR, DockType.EASYUI_STYLER })
	private String code;

	/**
	 * 名称
	 */
	@GpeField
	private String name;
	/**
	 * 排序
	 */
	@GpeField
	private Integer sort;
	/**
	 * 备注
	 */
	@GpeField
	private String remark;
	/**
	 * 创建时间
	 */
	@GpeField
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date createTime;
	/**
	 * 创建人
	 */
	private String createUserId;
	/**
	 * 创建人
	 */
	@GpeField
	private String createUserName;

	@GpeField(title = "BigDecimal测试")
	private BigDecimal decimalTest;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public BigDecimal getDecimalTest() {
		return decimalTest;
	}

	public void setDecimalTest(BigDecimal decimalTest) {
		this.decimalTest = decimalTest;
	}

}
