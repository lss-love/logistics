package com.lian.entity;

import java.sql.Date;

/**
 * 4.12 司机结算主表
 * @author Lss
 */
public class DriverClear {

	private String backBillCode;

	private String driverCode;

	private String balanceType;

	private double needPayment;

	private double carryFee;

	private double prepayMoney;

	private double bindInsurance;

	private double addCarriage;

	private double payedMoney;

	private double balance;

	private Date balanceTime;

	private double dispatchServiceFee;

	private double insurance;

	public DriverClear() {

	}

	public DriverClear(String backBillCode, String driverCode, String balanceType, double needPayment, double carryFee,
			double prepayMoney, double bindInsurance, double addCarriage, double payedMoney, double balance,
			Date balanceTime, double dispatchServiceFee, double insurance) {
		super();
		this.backBillCode = backBillCode;
		this.driverCode = driverCode;
		this.balanceType = balanceType;
		this.needPayment = needPayment;
		this.carryFee = carryFee;
		this.prepayMoney = prepayMoney;
		this.bindInsurance = bindInsurance;
		this.addCarriage = addCarriage;
		this.payedMoney = payedMoney;
		this.balance = balance;
		this.balanceTime = balanceTime;
		this.dispatchServiceFee = dispatchServiceFee;
		this.insurance = insurance;
	}

	public String getBackBillCode() {
		return backBillCode;
	}

	public void setBackBillCode(String backBillCode) {
		this.backBillCode = backBillCode;
	}

	public String getDriverCode() {
		return driverCode;
	}

	public void setDriverCode(String driverCode) {
		this.driverCode = driverCode;
	}

	public String getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}

	public double getNeedPayment() {
		return needPayment;
	}

	public void setNeedPayment(double needPayment) {
		this.needPayment = needPayment;
	}

	public double getCarryFee() {
		return carryFee;
	}

	public void setCarryFee(double carryFee) {
		this.carryFee = carryFee;
	}

	public double getPrepayMoney() {
		return prepayMoney;
	}

	public void setPrepayMoney(double prepayMoney) {
		this.prepayMoney = prepayMoney;
	}

	public double getBindInsurance() {
		return bindInsurance;
	}

	public void setBindInsurance(double bindInsurance) {
		this.bindInsurance = bindInsurance;
	}

	public double getAddCarriage() {
		return addCarriage;
	}

	public void setAddCarriage(double addCarriage) {
		this.addCarriage = addCarriage;
	}

	public double getPayedMoney() {
		return payedMoney;
	}

	public void setPayedMoney(double payedMoney) {
		this.payedMoney = payedMoney;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getBalanceTime() {
		return balanceTime;
	}

	public void setBalanceTime(Date balanceTime) {
		this.balanceTime = balanceTime;
	}

	public double getDispatchServiceFee() {
		return dispatchServiceFee;
	}

	public void setDispatchServiceFee(double dispatchServiceFee) {
		this.dispatchServiceFee = dispatchServiceFee;
	}

	public double getInsurance() {
		return insurance;
	}

	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "DriverClear [backBillCode=" + backBillCode + ", driverName=" + driverCode + ", balanceType="
				+ balanceType + ", needPayment=" + needPayment + ", carryFee=" + carryFee + ", prepayMoney="
				+ prepayMoney + ", bindInsurance=" + bindInsurance + ", addCarriage=" + addCarriage + ", payedMoney="
				+ payedMoney + ", balance=" + balance + ", balanceTime=" + balanceTime + ", dispatchServiceFee="
				+ dispatchServiceFee + ", insurance=" + insurance + "]";
	}

}
