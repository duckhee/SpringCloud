package com.iof.spring.admin.site.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.iof.spring.admin.site.dao.AdminSiteDao;
import com.iof.spring.site.model.VO.SiteVO;

@Service("AdminSiteService")
public class AdminSiteServiceImpl implements AdminSiteService {
	
	@Resource(name="AdminSiteDao")
	private AdminSiteDao dao;

	@Override
	public int CreateSite(SiteVO site) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Create Service");
		return 0;
	}

	@Override
	public int UpdateSite(SiteVO site) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Update Service");
		return 0;
	}

	@Override
	public int CountSite() {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Count Service");
		return 0;
	}

	@Override
	public List<SiteVO> PagingSite(int page) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Paging Service");
		return dao.AdminPagingSite(page);
	}
	
}
