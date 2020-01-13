package com.iof.spring.plot.model.VO;

import java.util.Date;

public class PlotVO {
	
	private int id;
	private String PlotName;
	private String Owner;
	private int SiteIdx;
	private Date createdAt;
	private Date updatedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlotName() {
		return PlotName;
	}
	public void setPlotName(String plotName) {
		PlotName = plotName;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public int getSiteIdx() {
		return SiteIdx;
	}
	public void setSiteIdx(int siteIdx) {
		SiteIdx = siteIdx;
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
		return "PlotVO [id=" + id + ", PlotName=" + PlotName + ", Owner=" + Owner + ", SiteIdx=" + SiteIdx
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	

}
