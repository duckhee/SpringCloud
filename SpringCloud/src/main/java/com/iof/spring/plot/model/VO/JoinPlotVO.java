package com.iof.spring.plot.model.VO;

import java.util.Date;
import java.util.List;

import com.iof.spring.device.model.VO.JoinDeviceVO;

public class JoinPlotVO {
	
	private int id;
	private String PlotName;
	private String Owner;
	private int SiteIdx;
	private Date createdAt;
	private Date updatedAt;
	private List<JoinDeviceVO> device;
	public JoinPlotVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JoinPlotVO(int id, String plotName, String owner, int siteIdx, Date createdAt, Date updatedAt,
			List<JoinDeviceVO> device) {
		super();
		this.id = id;
		PlotName = plotName;
		Owner = owner;
		SiteIdx = siteIdx;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.device = device;
	}
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
	public List<JoinDeviceVO> getDevice() {
		return device;
	}
	public void setDevice(List<JoinDeviceVO> device) {
		this.device = device;
	}
	@Override
	public String toString() {
		return "JoinPlotVO [id=" + id + ", PlotName=" + PlotName + ", Owner=" + Owner + ", SiteIdx=" + SiteIdx
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", device=" + device + "]";
	} 
	
	

	
}
