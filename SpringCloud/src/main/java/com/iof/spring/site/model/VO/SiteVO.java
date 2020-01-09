package com.iof.spring.site.model.VO;

import java.util.Date;

/**
 * @author duckheewon
 *
 */
public class SiteVO {
	
	private int id;
	private String name;
	private String Owner;
	private Date createdAt;
	private Date updatedAt;
	
	public SiteVO(int id, String name, String owner, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		Owner = owner;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
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
		return "SiteVO [id=" + id + ", name=" + name + ", Owner=" + Owner + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
	
	
}
