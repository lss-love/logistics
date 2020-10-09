package com.lian.entity;

/**
 * 4.34 功能与组表
 * @author Lss
 */
public class FunctionWithGroup {

	private int id;
	
	private int functionId;// 功能ID
	
	private int groupId;// 组ID
	
	public FunctionWithGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FunctionWithGroup(int id, int functionId, int groupId) {
		super();
		this.id = id;
		this.functionId = functionId;
		this.groupId = groupId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFunctionId() {
		return functionId;
	}

	public void setFunctionId(int functionId) {
		this.functionId = functionId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "FunctionWithGroup [id=" + id + ", functionId=" + functionId + ", groupId=" + groupId + "]";
	}

}
