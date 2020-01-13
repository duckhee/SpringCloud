package com.iof.spring.site.model.VO;

import java.util.Date;

import com.iof.spring.plot.model.VO.JoinPlotVO;

public class JoinSiteVO {
	
	private int id;
	private String name;
	private String Owner;
	private Date createdAt;
	private Date updatedAt;
	
	private JoinPlotVO plot;

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
	public JoinPlotVO getPlot() {
		return plot;
	}
	public void setPlot(JoinPlotVO plot) {
		this.plot = plot;
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
		return "JoinSiteVO [id=" + id + ", name=" + name + ", Owner=" + Owner + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", plot=" + plot + "]";
	}
	
}
