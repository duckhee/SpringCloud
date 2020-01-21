package com.iof.spring.device.model.VO;

import java.util.Date;

public class JoinDeviceVO {
	private int id;
	private String name;
	private int PlotIdx;
	private String Latitude;
	private String Longitude;
	private String DeviceType;
	private String FTPFolder;
	private Date createdAt;
	private Date updatedAt;
	
	public JoinDeviceVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JoinDeviceVO(int id, String name, int plotIdx, String latitude, String longitude, String deviceType,
			String fTPFolder, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		PlotIdx = plotIdx;
		Latitude = latitude;
		Longitude = longitude;
		DeviceType = deviceType;
		FTPFolder = fTPFolder;
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
	public int getPlotIdx() {
		return PlotIdx;
	}
	public void setPlotIdx(int plotIdx) {
		PlotIdx = plotIdx;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getDeviceType() {
		return DeviceType;
	}
	public void setDeviceType(String deviceType) {
		DeviceType = deviceType;
	}
	public String getFTPFolder() {
		return FTPFolder;
	}
	public void setFTPFolder(String fTPFolder) {
		FTPFolder = fTPFolder;
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
	
	
}
