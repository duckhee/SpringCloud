package com.iof.spring.admin.site.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.iof.spring.admin.site.dao.AdminSiteDao;
import com.iof.spring.site.model.VO.JoinSiteVO;
import com.iof.spring.site.model.VO.SiteVO;
import com.iof.spring.user.model.VO.UserVO;

/**
 * Admin Site Delete Service
 * @author duckheewon
 *
 */
@Service("AdminSiteService")
public class AdminSiteServiceImpl implements AdminSiteService {
	
	@Resource(name="AdminSiteDao")
	private AdminSiteDao dao;

	@Override
	public int CreateSite(SiteVO site) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Create Service");
		return dao.CreateSite(site);
	}

	@Override
	public int UpdateSite(SiteVO site) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Update Service");
		return 0;
	}
	
	@Override
	public SiteVO DetailSite(SiteVO site) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Detail Service");
		return dao.AdminSiteDetail(site);
	}

	@Override
	public Map<String, Object> DeleteSite(Map<String, Object> site) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Delete Service");
		return null;
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
		/**  Total Site Number */
		int totalCountSite = dao.AdminCountSite();
		System.out.println("Total : " + totalCountSite);
		if(page <= 0) {
			page = 1;
		}
		int _ListNumber = 10;
		int _TotalPage = 0;
		/** Get All Page Number */
		if(totalCountSite % _ListNumber == 0) {
			_TotalPage = totalCountSite / _ListNumber;
		}else {
			_TotalPage = totalCountSite / _ListNumber + 1;
		}
		/** View Page Max set */
		if(page > _TotalPage) {
			page = _TotalPage;
		}
		page = page - 1;
		System.out.println("Page : " + page);
		List<SiteVO> SitePagingList = dao.AdminPagingSite(page);
		return SitePagingList;
	}

}
