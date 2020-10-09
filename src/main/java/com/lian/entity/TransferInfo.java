package com.lian.entity;

import java.sql.Date;
/**
 * 4.10 中转信息表
 * @author Lss
 */
public class TransferInfo {
	
	private int id;
	
	private String goodsBillCode;
	
	private String transferStation;
	
	private String transferCheck;
	
	private Date checkTime;
	
	private String description;
	
	private String transferCompany;
	
	private String transferAddr;
	
	private String transferStationTel;
	
	private double transferFee;
	
	private String afterTransferBill;

	public TransferInfo() {
		super();
	}

	public TransferInfo(int id, String goodsBillCode, String transferStation, String transferCheck, Date checkTime,
			String description, String transferCompany, String transferAddr, String transferStationTel,
			double transferFee, String afterTransferBill) {
		super();
		this.id = id;
		this.goodsBillCode = goodsBillCode;
		this.transferStation = transferStation;
		this.transferCheck = transferCheck;
		this.checkTime = checkTime;
		this.description = description;
		this.transferCompany = transferCompany;
		this.transferAddr = transferAddr;
		this.transferStationTel = transferStationTel;
		this.transferFee = transferFee;
		this.afterTransferBill = afterTransferBill;
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

	public String getTransferStation() {
		return transferStation;
	}

	public void setTransferStation(String transferStation) {
		this.transferStation = transferStation;
	}

	public String getTransferCheck() {
		return transferCheck;
	}

	public void setTransferCheck(String transferCheck) {
		this.transferCheck = transferCheck;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTransferCompany() {
		return transferCompany;
	}

	public void setTransferCompany(String transferCompany) {
		this.transferCompany = transferCompany;
	}

	public String getTransferAddr() {
		return transferAddr;
	}

	public void setTransferAddr(String transferAddr) {
		this.transferAddr = transferAddr;
	}

	public String getTransferStationTel() {
		return transferStationTel;
	}

	public void setTransferStationTel(String transferStationTel) {
		this.transferStationTel = transferStationTel;
	}

	public double getTransferFee() {
		return transferFee;
	}

	public void setTransferFee(double transferFee) {
		this.transferFee = transferFee;
	}

	public String getAfterTransferBill() {
		return afterTransferBill;
	}

	public void setAfterTransferBill(String afterTransferBill) {
		this.afterTransferBill = afterTransferBill;
	}

	@Override
	public String toString() {
		return "TransferInfo [id=" + id + ", goodsBillCode=" + goodsBillCode + ", transferStation=" + transferStation
				+ ", transferCheck=" + transferCheck + ", checkTime=" + checkTime + ", description=" + description
				+ ", transferCompany=" + transferCompany + ", transferAddr=" + transferAddr + ", transferStationTel="
				+ transferStationTel + ", transferFee=" + transferFee + ", afterTransferBill=" + afterTransferBill
				+ "]";
	}

}
