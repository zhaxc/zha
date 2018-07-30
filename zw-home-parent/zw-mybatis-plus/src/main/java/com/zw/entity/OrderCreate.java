package com.zw.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 订单发起
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
@TableName("order_create")
public class OrderCreate extends Model<OrderCreate> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 公司标识
     */
	@TableField("company_id")
	private String companyId;
    /**
     * 发起地行政区划代码
     */
	private Integer address;
    /**
     * 订单编号
     */
	@TableField("order_id")
	private String orderId;
    /**
     * 预计用车时间
     */
	@TableField("depart_time")
	private Long departTime;
    /**
     * 订单发起时间
     */
	@TableField("order_time")
	private Long orderTime;
    /**
     * 乘客备注
     */
	@TableField("passenger_note")
	private String passengerNote;
    /**
     * 预计出发地点详细地址
     */
	private String departure;
    /**
     * 预计出发地点经度
     */
	@TableField("dep_longitude")
	private Long depLongitude;
    /**
     * 预计出发地点纬度
     */
	@TableField("dep_latitude")
	private Long depLatitude;
    /**
     * 预计目的地
     */
	private String destination;
    /**
     * 预计目的地经度
     */
	@TableField("dest_longitude")
	private Long destLongitude;
    /**
     * 预计目的地纬度
     */
	@TableField("dest_latitude")
	private Long destLatitude;
    /**
     * 坐标加密标识
     */
	private Integer encrypt;
    /**
     * 运价类型编码
     */
	@TableField("fare_type")
	private String fareType;
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

	public Long getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Long departTime) {
		this.departTime = departTime;
	}

	public Long getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Long orderTime) {
		this.orderTime = orderTime;
	}

	public String getPassengerNote() {
		return passengerNote;
	}

	public void setPassengerNote(String passengerNote) {
		this.passengerNote = passengerNote;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public Long getDepLongitude() {
		return depLongitude;
	}

	public void setDepLongitude(Long depLongitude) {
		this.depLongitude = depLongitude;
	}

	public Long getDepLatitude() {
		return depLatitude;
	}

	public void setDepLatitude(Long depLatitude) {
		this.depLatitude = depLatitude;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Long getDestLongitude() {
		return destLongitude;
	}

	public void setDestLongitude(Long destLongitude) {
		this.destLongitude = destLongitude;
	}

	public Long getDestLatitude() {
		return destLatitude;
	}

	public void setDestLatitude(Long destLatitude) {
		this.destLatitude = destLatitude;
	}

	public Integer getEncrypt() {
		return encrypt;
	}

	public void setEncrypt(Integer encrypt) {
		this.encrypt = encrypt;
	}

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
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
