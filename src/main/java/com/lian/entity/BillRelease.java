package com.lian.entity;

import java.sql.Date;

/**
 * 4.1 单据分发表
 * @author lss
 */
public class BillRelease {
	//订单id
	private int id;
	//订单类型
	private String billType;
	//订单编号
	private String billCode;
	//订单接收人
	private String receiveBillPerson;
	//接收状态
	private String acceptStation;
	//接收时间
	private Date receiveBillTime;
	//发布者
	private String releasePerson;

	public BillRelease() {
		super();
	}

	public BillRelease(int id, String billType, String billCode, String receiveBillPerson, String acceptStation,
			Date receiveBillTime, String releasePerson) {
		super();
		this.id = id;
		this.billType = billType;
		this.billCode = billCode;
		this.receiveBillPerson = receiveBillPerson;
		this.acceptStation = acceptStation;
		this.receiveBillTime = receiveBillTime;
		this.releasePerson = releasePerson;
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

	public String getReceiveBillPerson() {
		return receiveBillPerson;
	}

	public void setReceiveBillPerson(String receiveBillPerson) {
		this.receiveBillPerson = receiveBillPerson;
	}

	public String getAcceptStation() {
		return acceptStation;
	}

	public void setAcceptStation(String acceptStation) {
		this.acceptStation = acceptStation;
	}

	public Date getReceiveBillTime() {
		return receiveBillTime;
	}

	public void setReceiveBillTime(Date receiveBillTime) {
		this.receiveBillTime = receiveBillTime;
	}

	public String getReleasePerson() {
		return releasePerson;
	}

	public void setReleasePerson(String releasePerson) {
		this.releasePerson = releasePerson;
	}

	@Override
	public String toString() {
		return "BillRelease [id=" + id + ", billType=" + billType + ", billCode=" + billCode + ", receiveBillPerson="
				+ receiveBillPerson + ", acceptStation=" + acceptStation + ", receiveBillTime=" + receiveBillTime
				+ ", releasePerson=" + releasePerson + "]";
	}

}
