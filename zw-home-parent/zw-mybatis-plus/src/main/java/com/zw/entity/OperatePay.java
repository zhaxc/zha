package com.zw.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 经营支付
 * </p>
 *
 * @author zha
 * @since 2017-07-25
 */
@TableName("operate_pay")
public class OperatePay extends Model<OperatePay> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("company_id")
	private String companyId;
	@TableField("order_id")
	private String orderId;
	@TableField("on_area")
	private Integer onArea;
	@TableField("driver_name")
	private String driverName;
	@TableField("license_id")
	private String licenseId;
	@TableField("fare_type")
	private String fareType;
	@TableField("vehicle_no")
	private String vehicleNo;
	@TableField("book_dep_time")
	private Long bookDepTime;
	@TableField("wait_time")
	private Integer waitTime;
	@TableField("dep_longitude")
	private Long depLongitude;
	@TableField("dep_latitude")
	private Long depLatitude;
	@TableField("dep_area")
	private String depArea;
	@TableField("dep_time")
	private Long depTime;
	@TableField("dest_longitude")
	private Long destLongitude;
	@TableField("dest_latitude")
	private Long destLatitude;
	@TableField("dest_area")
	private String destArea;
	@TableField("dest_time")
	private Long destTime;
	@TableField("book_model")
	private String bookModel;
	private String model;
	@TableField("drive_mile")
	private Float driveMile;
	@TableField("drive_time")
	private Integer driveTime;
	@TableField("wait_mile")
	private Float waitMile;
	@TableField("fact_price")
	private Float factPrice;
	private Float price;
	@TableField("cash_price")
	private Float cashPrice;
	@TableField("line_name")
	private String lineName;
	@TableField("line_price")
	private Float linePrice;
	@TableField("pos_name")
	private String posName;
	@TableField("pos_price")
	private Float posPrice;
	@TableField("benfit_price")
	private Float benfitPrice;
	@TableField("book_tip")
	private Float bookTip;
	@TableField("passenger_tip")
	private Float passengerTip;
	@TableField("peak_up_price")
	private Float peakUpPrice;
	@TableField("night_up_price")
	private Float nightUpPrice;
	@TableField("far_up_price")
	private Float farUpPrice;
	@TableField("other_up_price")
	private Float otherUpPrice;
	@TableField("pay_state")
	private String payState;
	@TableField("pay_time")
	private Long payTime;
	@TableField("order_match_time")
	private Long orderMatchTime;
	@TableField("invoice_status")
	private String invoiceStatus;
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

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getOnArea() {
		return onArea;
	}

	public void setOnArea(Integer onArea) {
		this.onArea = onArea;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public Long getBookDepTime() {
		return bookDepTime;
	}

	public void setBookDepTime(Long bookDepTime) {
		this.bookDepTime = bookDepTime;
	}

	public Integer getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(Integer waitTime) {
		this.waitTime = waitTime;
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

	public String getDepArea() {
		return depArea;
	}

	public void setDepArea(String depArea) {
		this.depArea = depArea;
	}

	public Long getDepTime() {
		return depTime;
	}

	public void setDepTime(Long depTime) {
		this.depTime = depTime;
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

	public String getDestArea() {
		return destArea;
	}

	public void setDestArea(String destArea) {
		this.destArea = destArea;
	}

	public Long getDestTime() {
		return destTime;
	}

	public void setDestTime(Long destTime) {
		this.destTime = destTime;
	}

	public String getBookModel() {
		return bookModel;
	}

	public void setBookModel(String bookModel) {
		this.bookModel = bookModel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Float getDriveMile() {
		return driveMile;
	}

	public void setDriveMile(Float driveMile) {
		this.driveMile = driveMile;
	}

	public Integer getDriveTime() {
		return driveTime;
	}

	public void setDriveTime(Integer driveTime) {
		this.driveTime = driveTime;
	}

	public Float getWaitMile() {
		return waitMile;
	}

	public void setWaitMile(Float waitMile) {
		this.waitMile = waitMile;
	}

	public Float getFactPrice() {
		return factPrice;
	}

	public void setFactPrice(Float factPrice) {
		this.factPrice = factPrice;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getCashPrice() {
		return cashPrice;
	}

	public void setCashPrice(Float cashPrice) {
		this.cashPrice = cashPrice;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public Float getLinePrice() {
		return linePrice;
	}

	public void setLinePrice(Float linePrice) {
		this.linePrice = linePrice;
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}

	public Float getPosPrice() {
		return posPrice;
	}

	public void setPosPrice(Float posPrice) {
		this.posPrice = posPrice;
	}

	public Float getBenfitPrice() {
		return benfitPrice;
	}

	public void setBenfitPrice(Float benfitPrice) {
		this.benfitPrice = benfitPrice;
	}

	public Float getBookTip() {
		return bookTip;
	}

	public void setBookTip(Float bookTip) {
		this.bookTip = bookTip;
	}

	public Float getPassengerTip() {
		return passengerTip;
	}

	public void setPassengerTip(Float passengerTip) {
		this.passengerTip = passengerTip;
	}

	public Float getPeakUpPrice() {
		return peakUpPrice;
	}

	public void setPeakUpPrice(Float peakUpPrice) {
		this.peakUpPrice = peakUpPrice;
	}

	public Float getNightUpPrice() {
		return nightUpPrice;
	}

	public void setNightUpPrice(Float nightUpPrice) {
		this.nightUpPrice = nightUpPrice;
	}

	public Float getFarUpPrice() {
		return farUpPrice;
	}

	public void setFarUpPrice(Float farUpPrice) {
		this.farUpPrice = farUpPrice;
	}

	public Float getOtherUpPrice() {
		return otherUpPrice;
	}

	public void setOtherUpPrice(Float otherUpPrice) {
		this.otherUpPrice = otherUpPrice;
	}

	public String getPayState() {
		return payState;
	}

	public void setPayState(String payState) {
		this.payState = payState;
	}

	public Long getPayTime() {
		return payTime;
	}

	public void setPayTime(Long payTime) {
		this.payTime = payTime;
	}

	public Long getOrderMatchTime() {
		return orderMatchTime;
	}

	public void setOrderMatchTime(Long orderMatchTime) {
		this.orderMatchTime = orderMatchTime;
	}

	public String getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
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
