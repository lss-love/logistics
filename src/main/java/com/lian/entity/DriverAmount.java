package com.lian.entity;

/**
 * 4.40 打印司机运量
 * @author Lss
 */
public class DriverAmount {

	private String driverCode;//

	private double carryFeeTotal;// 承运费�?�计
	
	private double addCarriageTotal;// 加运费�?�计
	
	private double total;// 总计

	public DriverAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DriverAmount(int id, String driverCode, double carryFeeTotal, double addCarriageTotal, double total) {
		super();
		this.driverCode = driverCode;
		this.carryFeeTotal = carryFeeTotal;
		this.addCarriageTotal = addCarriageTotal;
		this.total = total;
	}

	

	public String getDriverCode() {
		return driverCode;
	}

	public void setDriverCode(String driverCode) {
		this.driverCode = driverCode;
	}

	public double getCarryFeeTotal() {
		return carryFeeTotal;
	}

	public void setCarryFeeTotal(double carryFeeTotal) {
		this.carryFeeTotal = carryFeeTotal;
	}

	public double getAddCarriageTotal() {
		return addCarriageTotal;
	}

	public void setAddCarriageTotal(double addCarriageTotal) {
		this.addCarriageTotal = addCarriageTotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "DriverAmount [ driverName=" + driverCode + ", carryFeeTotal=" + carryFeeTotal
				+ ", addCarriageTotal=" + addCarriageTotal + ", total=" + total + "]";
	}

	

}
