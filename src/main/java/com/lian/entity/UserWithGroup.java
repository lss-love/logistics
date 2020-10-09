package com.lian.entity;

/**
 * 4.35 用户与组表
 * @author lss
 */
public class UserWithGroup {
	
	private int id;
	
	private String userId;// 用户ID
	
	private int groupId;// 组ID

	public UserWithGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserWithGroup(int id, String userId, int groupId) {
		super();
		this.id = id;
		this.userId = userId;
		this.groupId = groupId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "UserWithGroup [id=" + id + ", userId=" + userId + ", groupId=" + groupId + "]";
	}

}
