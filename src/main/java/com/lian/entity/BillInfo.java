package com.lian.entity;

import java.util.Date;

/**
 * 4.2 单据明细表
 * @author Lss
 */
public class BillInfo {
	//订单id
	private int id;
	//订单类型
	private String billType;
	//订单编号
	private String billCode;
	//订单状态
	private String billState;
	//
	private Date writeDate;

	private String acceptStation;

	public BillInfo() {
		super();
	}

	public BillInfo(int id, String billType, String billCode, String billState, Date writeDate, String acceptStation) {
		super();
		this.id = id;
		this.billType = billType;
		this.billCode = billCode;
		this.billState = billState;
		this.writeDate = writeDate;
		this.acceptStation = acceptStation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getBillState() {
		return billState;
	}

	public void setBillState(String billState) {
		this.billState = billState;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public String getAcceptStation() {
		return acceptStation;
	}

	public void setAcceptStation(String acceptStation) {
		this.acceptStation = acceptStation;
	}

	@Override
	public String toString() {
		return "BillInfo [id=" + id + ", billType=" + billType + ", billCode=" + billCode + ", billState=" + billState
				+ ", writeDate=" + writeDate + ", acceptStation=" + acceptStation + "]";
	}

}
