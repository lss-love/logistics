package com.lian.entity;

/**
 * 4.37 打印客户运量
 * @author Lss
 */
public class CustomerAmount {

	private String sendGoodsCustomer;// 发货客户
	
	private double carriageTotal;// 运费总计
	
	private double insuranceTotal;// 保险费�?�计
	
	private int pieceAmountTotal;// 件数总计

	public CustomerAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerAmount( String sendGoodsCustomer, double carriageTotal, double insuranceTotal,
			int pieceAmountTotal) {
		super();
		this.sendGoodsCustomer = sendGoodsCustomer;
		this.carriageTotal = carriageTotal;
		this.insuranceTotal = insuranceTotal;
		this.pieceAmountTotal = pieceAmountTotal;
	}

	

	public String getSendGoodsCustomer() {
		return sendGoodsCustomer;
	}

	public void setSendGoodsCustomer(String sendGoodsCustomer) {
		this.sendGoodsCustomer = sendGoodsCustomer;
	}

	public double getCarriageTotal() {
		return carriageTotal;
	}

	public void setCarriageTotal(double carriageTotal) {
		this.carriageTotal = carriageTotal;
	}

	public double getInsuranceTotal() {
		return insuranceTotal;
	}

	public void setInsuranceTotal(double insuranceTotal) {
		this.insuranceTotal = insuranceTotal;
	}

	public int getPieceAmountTotal() {
		return pieceAmountTotal;
	}

	public void setPieceAmountTotal(int pieceAmountTotal) {
		this.pieceAmountTotal = pieceAmountTotal;
	}

	@Override
	public String toString() {
		return "CustomerAmount [sendGoodsCustomer=" + sendGoodsCustomer + ", carriageTotal="
				+ carriageTotal + ", insuranceTotal=" + insuranceTotal + ", pieceAmountTotal=" + pieceAmountTotal + "]";
	}

}
