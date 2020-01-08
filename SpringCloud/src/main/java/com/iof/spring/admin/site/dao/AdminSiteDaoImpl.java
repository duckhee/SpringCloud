package com.iof.spring.admin.site.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("AdminSiteDao")
public class AdminSiteDaoImpl implements AdminSiteDao{
	
	@Autowired
	private SqlSession session;
	
	
}
