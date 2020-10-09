package com.lian.entity;

import java.sql.Date;

/**
 * 4.15 杂费结算表
 * @author Lss
 */
public class ExtraClear {
	
	private int id;
	
	private String subjectName;
	
	private double balanceMoney;
	
	private String remark;
	
	private Date balanceDate;
	
	private String balanceType;

	public ExtraClear() {
		super();
	}

	public ExtraClear(int id, String subjectName, double balanceMoney, String remark, Date balanceDate,
			String balanceType) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		this.balanceMoney = balanceMoney;
		this.remark = remark;
		this.balanceDate = balanceDate;
		this.balanceType = balanceType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public double getBalanceMoney() {
		return balanceMoney;
	}

	public void setBalanceMoney(double balanceMoney) {
		this.balanceMoney = balanceMoney;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}

	@Override
	public String toString() {
		return "ExtraClear [id=" + id + ", subjectName=" + subjectName + ", balanceMoney=" + balanceMoney + ", remark="
				+ remark + ", balanceDate=" + balanceDate + ", balanceType=" + balanceType + "]";
	}

}
