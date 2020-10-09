package com.lian.entity;

/**
 * 4.31 功能表
 * @author Lss
 */
public class Function {

	private int id;
	
	private String pageFunction;// 页面功能
	
	private String pageName;// 页面名称

	public Function() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Function(int id, String pageFunction, String pageName) {
		super();
		this.id = id;
		this.pageFunction = pageFunction;
		this.pageName = pageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPageFunction() {
		return pageFunction;
	}

	public void setPageFunction(String pageFunction) {
		this.pageFunction = pageFunction;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	@Override
	public String toString() {
		return "Function [id=" + id + ", pageFunction=" + pageFunction + ", pageName=" + pageName + "]";
	}

}
