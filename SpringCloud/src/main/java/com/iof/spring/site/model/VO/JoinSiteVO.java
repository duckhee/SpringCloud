package com.iof.spring.site.model.VO;

import java.util.Date;

import com.iof.spring.plot.model.VO.JoinPlotVO;

public class JoinSiteVO {
	
	private int id;
	private String name;
	private String Owner;
	private int site_cnt;
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
	public void setOwner(String owner) {
		Owner = owner;
	}	
	public int getSite_cnt() {
		return site_cnt;
	}
	public void setSite_cnt(int site_cnt) {
		this.site_cnt = site_cnt;
	}
	public JoinPlotVO getPlot() {
		return plot;
	}
	public void setPlot(JoinPlotVO plot) {
		this.plot = plot;
	}
	
	@Override
	public String toString() {
		return "JoinSiteVO [id=" + id + ", name=" + name + ", Owner=" + Owner + ", site_cnt=" + site_cnt
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", plot=" + plot + "]";
	}
	
	
}
