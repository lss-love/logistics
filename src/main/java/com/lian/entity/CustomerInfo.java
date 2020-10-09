package com.lian.entity;

/**
 * 4.25 客户基本信息表
 * @author Lss
 */
public class CustomerInfo {
	
	private String customerCode;

	private String customer;

	private String phone;

	private String fax;

	private String address;

	private String postCode;

	private String linkman;

	private String linkmanMobile;

	private String customerType;

	private String enterpriseProperty;

	private String enterpriseSize;

	private String email;

	public CustomerInfo() {

	}

	public CustomerInfo(String customerCode, String customer, String phone, String fax, String address,
			String postCode, String linkman, String linkmanMobile, String customerType, String enterpriseProperty,
			String enterpriseSize, String email) {
		super();
		this.customerCode = customerCode;
		this.customer = customer;
		this.phone = phone;
		this.fax = fax;
		this.address = address;
		this.postCode = postCode;
		this.linkman = linkman;
		this.linkmanMobile = linkmanMobile;
		this.customerType = customerType;
		this.enterpriseProperty = enterpriseProperty;
		this.enterpriseSize = enterpriseSize;
		this.email = email;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getLinkmanMobile() {
		return linkmanMobile;
	}

	public void setLinkmanMobile(String linkmanMobile) {
		this.linkmanMobile = linkmanMobile;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getEnterpriseProperty() {
		return enterpriseProperty;
	}

	public void setEnterpriseProperty(String enterpriseProperty) {
		this.enterpriseProperty = enterpriseProperty;
	}

	public String getEnterpriseSize() {
		return enterpriseSize;
	}

	public void setEnterpriseSize(String enterpriseSize) {
		this.enterpriseSize = enterpriseSize;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CustomerInfo [customerCode=" + customerCode + ", customer=" + customer + ", phone="
				+ phone + ", fax=" + fax + ", address=" + address + ", postCode=" + postCode + ", linkman=" + linkman
				+ ", linkmanMobile=" + linkmanMobile + ", customerType=" + customerType + ", enterpriseProperty="
				+ enterpriseProperty + ", enterpriseSize=" + enterpriseSize + ", email=" + email + "]";
	}

}
