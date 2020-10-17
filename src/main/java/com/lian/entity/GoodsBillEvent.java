package com.lian.entity;

import java.util.Date;

/**
 * 4.4 货运单事件表
 * @author Lss
 */
public class GoodsBillEvent {
	//货物订单id
	private String goodsBillId;
	//事件名字
	private String eventName;
	//备注
	private String remark;
	//发生时间
	private Date occurTime;

	public GoodsBillEvent() {
		super();
	}

	public GoodsBillEvent(String goodsBillId, String eventName, String remark, Date occurTime) {
		super();
		this.goodsBillId = goodsBillId;
		this.eventName = eventName;
		this.remark = remark;
		this.occurTime = occurTime;
	}

	public String getGoodsBillId() {
		return goodsBillId;
	}

	public void setGoodsBillId(String goodsBillId) {
		this.goodsBillId = goodsBillId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getOccurTime() {
		return occurTime;
	}

	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	@Override
	public String toString() {
		return "BillEvent [goodsBillId=" + goodsBillId + ", eventName=" + eventName + ", remark=" + remark
				+ ", occurTime=" + occurTime + "]";
	}

}
