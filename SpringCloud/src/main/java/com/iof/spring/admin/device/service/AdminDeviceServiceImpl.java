package com.iof.spring.admin.device.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iof.spring.admin.device.dao.AdminDeviceDao;

@Service("AdminDeviceService")
public class AdminDeviceServiceImpl implements AdminDeviceService{
	
	@Autowired
	private AdminDeviceDao dao;
}
