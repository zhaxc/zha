package com.zw.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 订单撤销
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
@TableName("order_cancel")
public class OrderCancel extends Model<OrderCancel> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 公司标识
     */
	@TableField("company_id")
	private String companyId;
    /**
     * 上车地点行政区划代码
     */
	private Integer address;
    /**
     * 订单编号
     */
	@TableField("order_id")
	private String orderId;
    /**
     * 订单时间
     */
	@TableField("order_time")
	private Long orderTime;
    /**
     * 订单撤销时间
     */
	@TableField("cancel_time")
	private Long cancelTime;
    /**
     * 撤销发起方
     */
	private String operator;
    /**
     * 撤销类型代码
     */
	@TableField("cancel_type_code")
	private String cancelTypeCode;
    /**
     * 撤销或违约原因
     */
	@TableField("cancel_reason")
	private String cancelReason;
    /**
     * 保留字段
     */
	private String reserved;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public Integer getAddress() {
		return address;
	}

	public void setAddress(Integer address) {
		this.address = address;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Long orderTime) {
		this.orderTime = orderTime;
	}

	public Long getCancelTime() {
		return cancelTime;
	}

	public void setCancelTime(Long cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCancelTypeCode() {
		return cancelTypeCode;
	}

	public void setCancelTypeCode(String cancelTypeCode) {
		this.cancelTypeCode = cancelTypeCode;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
