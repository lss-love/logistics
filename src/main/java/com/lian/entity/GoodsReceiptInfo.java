package com.lian.entity;

import java.sql.Date;
/**
 * 4.8 货物回执信息表
 * @author Lss
 */
public class GoodsReceiptInfo {

	private int id;
	
	private String goodsRevertCode;
	
	private String driverName;
	
	private String checkGoodsRecord;
	
	private String receiveGoodsPerson;
	
	private Date rceiveGoodsDate;

	public GoodsReceiptInfo() {
		super();
	}

	public GoodsReceiptInfo(int id, String goodsRevertCode, String driverName, String checkGoodsRecord,
			String receiveGoodsPerson, Date rceiveGoodsDate) {
		super();
		this.id = id;
		this.goodsRevertCode = goodsRevertCode;
		this.driverName = driverName;
		this.checkGoodsRecord = checkGoodsRecord;
		this.receiveGoodsPerson = receiveGoodsPerson;
		this.rceiveGoodsDate = rceiveGoodsDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsRevertCode() {
		return goodsRevertCode;
	}

	public void setGoodsRevertCode(String goodsRevertCode) {
		this.goodsRevertCode = goodsRevertCode;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
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

	public Date getRceiveGoodsDate() {
		return rceiveGoodsDate;
	}

	public void setRceiveGoodsDate(Date rceiveGoodsDate) {
		this.rceiveGoodsDate = rceiveGoodsDate;
	}

	@Override
	public String toString() {
		return "GoodsReceiptInfo [id=" + id + ", goodsRevertCode=" + goodsRevertCode + ", driverName=" + driverName
				+ ", checkGoodsRecord=" + checkGoodsRecord + ", receiveGoodsPerson=" + receiveGoodsPerson
				+ ", rceiveGoodsDate=" + rceiveGoodsDate + "]";
	}
	
}
