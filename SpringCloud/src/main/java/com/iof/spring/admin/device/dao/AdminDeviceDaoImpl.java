package com.iof.spring.admin.device.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("AdminDeviceDao")
public class AdminDeviceDaoImpl implements AdminDeviceDao{

	@Autowired
	private SqlSession session;
}
