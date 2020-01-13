package com.iof.spring.user.model.VO;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Many;

import com.iof.spring.site.model.VO.JoinSiteVO;


public class JoinUserVO {

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
	/**
	 * User Site
	 */
	private List<JoinSiteVO> Site;

	
	public JoinUserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public JoinUserVO(int id, String userEmail, String userName, String userPassword, int userLevel, Date createdAt,
			Date updatedAt, List<JoinSiteVO> site) {
		super();
		this.id = id;
		UserEmail = userEmail;
		UserName = userName;
		UserPassword = userPassword;
		UserLevel = userLevel;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		Site = site;
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
	public List<JoinSiteVO> getSite() {
		return Site;
	}
	public void setSite(List<JoinSiteVO> Site) {
		this.Site = Site;
	}
	@Override
	public String toString() {
		return "JoinUserVO [id=" + id + ", UserEmail=" + UserEmail + ", UserName=" + UserName + ", UserPassword="
				+ UserPassword + ", UserLevel=" + UserLevel + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", Site=" + Site + "]";
	}
	
}
