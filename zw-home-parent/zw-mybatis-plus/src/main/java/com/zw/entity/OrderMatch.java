package com.zw.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 订单成功
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
@TableName("order_match")
public class OrderMatch extends Model<OrderMatch> {

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
     * 车辆经度
     */
	private Long longitude;
    /**
     * 车辆纬度
     */
	private Long latitude;
    /**
     * 坐标加密标识
     */
	private Integer encrypt;
    /**
     * 机动车驾驶证编号
     */
	@TableField("license_id")
	private String licenseId;
    /**
     * 驾驶员手机号
     */
	@TableField("driver_phone")
	private String driverPhone;
    /**
     * 车辆号牌
     */
	@TableField("vehicle_no")
	private String vehicleNo;
    /**
     * 派单成功时间
     */
	@TableField("distribute_time")
	private Long distributeTime;
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

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Integer getEncrypt() {
		return encrypt;
	}

	public void setEncrypt(Integer encrypt) {
		this.encrypt = encrypt;
	}

	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getDriverPhone() {
		return driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public Long getDistributeTime() {
		return distributeTime;
	}

	public void setDistributeTime(Long distributeTime) {
		this.distributeTime = distributeTime;
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
