package com.lian.entity;

import java.sql.Date;

/**
 * 4.7 客户回执信息表
 * @author Lss
 */
public class CustomerReceiptInfo {
	
	private int id;

	private String goodsBillCode;
	
	private String customer;
	
	private String checkGoodsRecord;
	
	private String receiveGoodsPerson;
	
	private Date receiveGoodsDate;
	
	private int carryBillEventId;

	public CustomerReceiptInfo() {
		super();
	}

	public CustomerReceiptInfo(int id, String goodsBillCode, String customer, String checkGoodsRecord,
			String receiveGoodsPerson, Date receiveGoodsDate, int carryBillEventId) {
		super();
		this.id = id;
		this.goodsBillCode = goodsBillCode;
		this.customer = customer;
		this.checkGoodsRecord = checkGoodsRecord;
		this.receiveGoodsPerson = receiveGoodsPerson;
		this.receiveGoodsDate = receiveGoodsDate;
		this.carryBillEventId = carryBillEventId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsBillCode() {
		return goodsBillCode;
	}

	public void setGoodsBillCode(String goodsBillCode) {
		this.goodsBillCode = goodsBillCode;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCheckGoodsRecord() {
		return checkGoodsRecord;
	}

	public void setCheckGoodsRecord(String checkGoodsRecord) {
		this.checkGoodsRecord = checkGoodsRecord;
	}

	public String getReceiveGoodsPerson() {
		return receiveGoodsPerson;
	}

	public void setReceiveGoodsPerson(String receiveGoodsPerson) {
		this.receiveGoodsPerson = receiveGoodsPerson;
	}

	public Date getReceiveGoodsDate() {
		return receiveGoodsDate;
	}

	public void setReceiveGoodsDate(Date receiveGoodsDate) {
		this.receiveGoodsDate = receiveGoodsDate;
	}

	public int getCarryBillEventId() {
		return carryBillEventId;
	}

	public void setCarryBillEventId(int carryBillEventId) {
		this.carryBillEventId = carryBillEventId;
	}

	@Override
	public String toString() {
		return "CustomerReceiptInfo [id=" + id + ", goodsBillCode=" + goodsBillCode + ", customer=" + customer
				+ ", checkGoodsRecord=" + checkGoodsRecord + ", receiveGoodsPerson=" + receiveGoodsPerson
				+ ", receiveGoodsDate=" + receiveGoodsDate + ", carryBillEventId=" + carryBillEventId + "]";
	}

}
