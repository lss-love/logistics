package com.lian.entity;

import java.sql.Date;

/**
 * 4.24 赔偿信息表
 * @author Lss
 */
public class CompensationInfo {
	
	private int id;

	private double amends;

	private String customer;

	private Date amendsTime;

	private String remark;

	private int receiveStationId;

	private double badDestroyGoods;

	private String receiveStationName;

	private Date writeDate;

	public CompensationInfo() {

	}

	public CompensationInfo(int id, double amends, String customer, Date amendsTime, String remark,
			int receiveStationId, double badDestroyGoods, String receiveStationName, Date writeDate) {
		super();
		this.id = id;
		this.amends = amends;
		this.customer = customer;
		this.amendsTime = amendsTime;
		this.remark = remark;
		this.receiveStationId = receiveStationId;
		this.badDestroyGoods = badDestroyGoods;
		this.receiveStationName = receiveStationName;
		this.writeDate = writeDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmends() {
		return amends;
	}

	public void setAmends(double amends) {
		this.amends = amends;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Date getAmendsTime() {
		return amendsTime;
	}

	public void setAmendsTime(Date amendsTime) {
		this.amendsTime = amendsTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getReceiveStationId() {
		return receiveStationId;
	}

	public void setReceiveStationId(int receiveStationId) {
		this.receiveStationId = receiveStationId;
	}

	public double getBadDestroyGoods() {
		return badDestroyGoods;
	}

	public void setBadDestroyGoods(double badDestroyGoods) {
		this.badDestroyGoods = badDestroyGoods;
	}

	public String getReceiveStationName() {
		return receiveStationName;
	}

	public void setReceiveStationName(String receiveStationName) {
		this.receiveStationName = receiveStationName;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "CompensationInfo [id=" + id + ", amends=" + amends + ", customer=" + customer + ", amendsTime="
				+ amendsTime + ", remark=" + remark + ", receiveStationId=" + receiveStationId + ", badDestroyGoods="
				+ badDestroyGoods + ", receiveStationName=" + receiveStationName + ", writeDate=" + writeDate + "]";
	}

}
