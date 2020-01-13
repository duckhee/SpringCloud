package com.iof.spring.user.model.VO;

import java.util.Date;

public class UserVO {
	
	/**
	 * Index 
	 */
	private int id;
	/**
	 * User Email
	 */
	private String UserEmail;
	/**
	 * User Name
	 */
	private String UserName;
	/**
	 * User Password
	 */
	private String UserPassword;
	/**
	 * User Level
	 */
	private int UserLevel;
	
	/**
	 * Create User Time
	 */
	private Date createdAt;
	/**
	 * Update User Time
	 */
	private Date updatedAt;
	
	

	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserVO(int id, String userEmail, String userName, String userPassword, int userLevel, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		UserEmail = userEmail;
		UserName = userName;
		UserPassword = userPassword;
		UserLevel = userLevel;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/**
	 * Getter Setter 
	 * @return
	 */
	
	
	public int getId() {
		return id;
	}
	public void setId(int idx) {
		id = idx;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public int getUserLevel() {
		return UserLevel;
	}
	public void setUserLevel(int userLevel) {
		UserLevel = userLevel;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", UserEmail=" + UserEmail + ", UserName=" + UserName + ", UserPassword="
				+ UserPassword + ", UserLevel=" + UserLevel + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]";
	}

	
}
