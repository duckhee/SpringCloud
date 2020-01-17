package com.iof.spring.admin.plot.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.iof.spring.admin.plot.dao.AdminPlotDao;

@Service("AdminPlotService")
public class AdminPlotServiceImpl implements AdminPlotService {

	@Autowired
	/**
	 * @Qualifier("AdminPlotDao") 
	 * 특정 서비스를 지정 하여 가져오기 위한 Annotation 
	 */
	private AdminPlotDao doa;
}
