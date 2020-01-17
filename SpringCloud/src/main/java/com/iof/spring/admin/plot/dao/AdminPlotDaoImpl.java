package com.iof.spring.admin.plot.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("AdminPlotDao")
public class AdminPlotDaoImpl implements AdminPlotDao{

	@Autowired
	private SqlSession session;
}
