package com.lian.entity;

import java.sql.Date;

/**
 * 4.6 货运回执单主表
 * @author Lss
 */
public class CargoReceipt {

	private String goodsRevertBillCode;

	private String loadStation;

	private Date startCarryTime;

	private String dealGoodsStation;

	private Date arriveTime;

	private String receiveGoodsLinkman;

	private String linkmanPhone;

	private String receiveGoodsDetailAddr;

	private String carriageBanlanceMode;

	private String remark;

	private String driverId;

	private String ifBalance;

	private String backBillState;

	private double startAdvance;

	private double carryGoodsBillDeposit;

	private double carryGoodsInsurance;

	private double dispatchServiceFee;

	private double allCarriage;

	private double insurance;

	private Date signTime;

	private String acceptStation;

	private String carriageMode;

	public CargoReceipt() {
		super();
	}

	public CargoReceipt(String goodsRevertBillCode, String loadStation, Date startCarryTime, String dealGoodsStation,
			Date arriveTime, String receiveGoodsLinkman, String linkmanPhone, String receiveGoodsDetailAddr,
			String carriageBanlanceMode, String remark, String driverId, String ifBalance, String backBillState,
			double startAdvance, double carryGoodsBillDeposit, double carryGoodsInsurance, double dispatchServiceFee,
			double allCarriage, double insurance, Date signTime, String acceptStation, String carriageMode) {
		super();
		this.goodsRevertBillCode = goodsRevertBillCode;
		this.loadStation = loadStation;
		this.startCarryTime = startCarryTime;
		this.dealGoodsStation = dealGoodsStation;
		this.arriveTime = arriveTime;
		this.receiveGoodsLinkman = receiveGoodsLinkman;
		this.linkmanPhone = linkmanPhone;
		this.receiveGoodsDetailAddr = receiveGoodsDetailAddr;
		this.carriageBanlanceMode = carriageBanlanceMode;
		this.remark = remark;
		this.driverId = driverId;
		this.ifBalance = ifBalance;
		this.backBillState = backBillState;
		this.startAdvance = startAdvance;
		this.carryGoodsBillDeposit = carryGoodsBillDeposit;
		this.carryGoodsInsurance = carryGoodsInsurance;
		this.dispatchServiceFee = dispatchServiceFee;
		this.allCarriage = allCarriage;
		this.insurance = insurance;
		this.signTime = signTime;
		this.acceptStation = acceptStation;
		this.carriageMode = carriageMode;
	}

	public String getGoodsRevertBillCode() {
		return goodsRevertBillCode;
	}

	public void setGoodsRevertBillCode(String goodsRevertBillCode) {
		this.goodsRevertBillCode = goodsRevertBillCode;
	}

	public String getLoadStation() {
		return loadStation;
	}

	public void setLoadStation(String loadStation) {
		this.loadStation = loadStation;
	}

	public Date getStartCarryTime() {
		return startCarryTime;
	}

	public void setStartCarryTime(Date startCarryTime) {
		this.startCarryTime = startCarryTime;
	}

	public String getDealGoodsStation() {
		return dealGoodsStation;
	}

	public void setDealGoodsStation(String dealGoodsStation) {
		this.dealGoodsStation = dealGoodsStation;
	}

	public Date getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getReceiveGoodsLinkman() {
		return receiveGoodsLinkman;
	}

	public void setReceiveGoodsLinkman(String receiveGoodsLinkman) {
		this.receiveGoodsLinkman = receiveGoodsLinkman;
	}

	public String getLinkmanPhone() {
		return linkmanPhone;
	}

	public void setLinkmanPhone(String linkmanPhone) {
		this.linkmanPhone = linkmanPhone;
	}

	public String getReceiveGoodsDetailAddr() {
		return receiveGoodsDetailAddr;
	}

	public void setReceiveGoodsDetailAddr(String receiveGoodsDetailAddr) {
		this.receiveGoodsDetailAddr = receiveGoodsDetailAddr;
	}

	public String getCarriageBanlanceMode() {
		return carriageBanlanceMode;
	}

	public void setCarriageBanlanceMode(String carriageBanlanceMode) {
		this.carriageBanlanceMode = carriageBanlanceMode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getIfBalance() {
		return ifBalance;
	}

	public void setIfBalance(String ifBalance) {
		this.ifBalance = ifBalance;
	}

	public String getBackBillState() {
		return backBillState;
	}

	public void setBackBillState(String backBillState) {
		this.backBillState = backBillState;
	}

	public double getStartAdvance() {
		return startAdvance;
	}

	public void setStartAdvance(double startAdvance) {
		this.startAdvance = startAdvance;
	}

	public double getCarryGoodsBillDeposit() {
		return carryGoodsBillDeposit;
	}

	public void setCarryGoodsBillDeposit(double carryGoodsBillDeposit) {
		this.carryGoodsBillDeposit = carryGoodsBillDeposit;
	}

	public double getCarryGoodsInsurance() {
		return carryGoodsInsurance;
	}

	public void setCarryGoodsInsurance(double carryGoodsInsurance) {
		this.carryGoodsInsurance = carryGoodsInsurance;
	}

	public double getDispatchServiceFee() {
		return dispatchServiceFee;
	}

	public void setDispatchServiceFee(double dispatchServiceFee) {
		this.dispatchServiceFee = dispatchServiceFee;
	}

	public double getAllCarriage() {
		return allCarriage;
	}

	public void setAllCarriage(double allCarriage) {
		this.allCarriage = allCarriage;
	}

	public double getInsurance() {
		return insurance;
	}

	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}

	public Date getSignTime() {
		return signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getAcceptStation() {
		return acceptStation;
	}

	public void setAcceptStation(String acceptStation) {
		this.acceptStation = acceptStation;
	}

	public String getCarriageMode() {
		return carriageMode;
	}

	public void setCarriageMode(String carriageMode) {
		this.carriageMode = carriageMode;
	}

	@Override
	public String toString() {
		return "CargoReceipt [goodsRevertBillCode=" + goodsRevertBillCode + ", loadStation=" + loadStation
				+ ", startCarryTime=" + startCarryTime + ", dealGoodsStation=" + dealGoodsStation + ", arriveTime="
				+ arriveTime + ", receiveGoodsLinkman=" + receiveGoodsLinkman + ", linkmanPhone=" + linkmanPhone
				+ ", receiveGoodsDetailAddr=" + receiveGoodsDetailAddr + ", carriageBanlanceMode="
				+ carriageBanlanceMode + ", remark=" + remark + ", driverId=" + driverId + ", ifBalance=" + ifBalance
				+ ", backBillState=" + backBillState + ", startAdvance=" + startAdvance + ", carryGoodsBillDeposit="
				+ carryGoodsBillDeposit + ", carryGoodsInsurance=" + carryGoodsInsurance + ", dispatchServiceFee="
				+ dispatchServiceFee + ", allCarriage=" + allCarriage + ", insurance=" + insurance + ", signTime="
				+ signTime + ", acceptStation=" + acceptStation + ", carriageMode=" + carriageMode + "]";
	}

}
