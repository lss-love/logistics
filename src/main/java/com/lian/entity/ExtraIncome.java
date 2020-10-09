package com.lian.entity;

import java.sql.Date;

/**
 * 4.20 营业外收入表
 * @author Lss
 */
public class ExtraIncome {

	private int id;

	private String name;
	private double money;
	private String incomeMonth;
	private Date writeDate;

	public ExtraIncome() {

	}

	public ExtraIncome(int id, String name, double money, String incomeMonth, Date writeDate) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.incomeMonth = incomeMonth;
		this.writeDate = writeDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getIncomeMonth() {
		return incomeMonth;
	}

	public void setIncomeMonth(String incomeMonth) {
		this.incomeMonth = incomeMonth;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "ExtraIncome [id=" + id + ", name=" + name + ", money=" + money + ", incomeMonth=" + incomeMonth
				+ ", writeDate=" + writeDate + "]";
	}

}
