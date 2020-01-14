package com.iof.spring.device.model.VO;

public enum TypeDevice {
	Null("null"), DataTracker("DataTracker"), HikVision("HikVision"), ecolog("ecolog");
	/** Get Enum Type Value */
	private String DeviceValue;
	
	public String getType() {
		return DeviceValue;
	}
	
	private TypeDevice(String DeviceValue) {
		this.DeviceValue = DeviceValue;
	}
	
	
}
