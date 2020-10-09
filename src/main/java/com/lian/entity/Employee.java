package com.lian.entity;

import java.sql.Date;

/**
 * 4.26 职员信息表
 * @author Lss
 */
public class Employee {

	private String employeeCode;

	private String employeeName;

	private String department;

	private String position;

	private String gender;

	private Date birthday;

	public Employee() {

	}

	public Employee(String employeeCode, String employeeName, String department, String position, String gender,
			Date birthday) {
		super();
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.department = department;
		this.position = position;
		this.gender = gender;
		this.birthday = birthday;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Employee [employeeCode=" + employeeCode + ", employeeName=" + employeeName
				+ ", department=" + department + ", position=" + position + ", gender=" + gender + ", birthday="
				+ birthday + "]";
	}

}
