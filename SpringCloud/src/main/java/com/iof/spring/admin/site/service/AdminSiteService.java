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
	public JoinSiteVO DetailSite(SiteVO site);
	/** Admin Delete Site */
	
	/** Admin List Site */
	
	/** Admin Count Site */
	public int CountSite();
	/** Admin Paging Site */
	public List<SiteVO> PagingSite(int page);
}
