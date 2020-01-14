package com.iof.spring.admin.site.service;

import java.util.List;

import com.iof.spring.site.model.VO.JoinSiteVO;
import com.iof.spring.site.model.VO.SiteVO;

public interface AdminSiteService {
	/** Admin Create Site */
	public int CreateSite(SiteVO site);
	/** Admin Update Site */
	public int UpdateSite(SiteVO site);
	/** Admin Detail Site */
	public SiteVO DetailSite(SiteVO site);
	/** Admin Delete Site */
	public int DeleteSite(SiteVO site);
	/** Admin List Site */
	
	/** Admin Count Site */
	public int CountSite();
	/** Admin Paging Site */
	public List<SiteVO> PagingSite(int page);
}
