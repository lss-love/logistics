package com.lian.entity;

/**
 * 4.36 职员用户关系表
 * @author Lss
 */
public class EmployeeUser {

	private int id;
	
	private int employeeId;// 职员ID
	
	private int userId;// 用户ID
	
	public EmployeeUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeUser(int id, int employeeId, int userId) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "EmployeeCustomer [id=" + id + ", employeeId=" + employeeId + ", userId=" + userId + "]";
	}

}
