package com.iof.spring.admin.site.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.iof.spring.admin.site.dao.AdminSiteDao;

@Service("AdminSiteService")
public class AdminSiteServiceImpl implements AdminSiteService {
	
	@Resource(name="AdminSiteDao")
	private AdminSiteDao dao;
	
}
