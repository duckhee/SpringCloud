package com.iof.spring.admin.site.dao;

import java.util.List;

import com.iof.spring.site.model.VO.SiteVO;
import com.iof.spring.user.model.VO.UserVO;

public interface AdminSiteDao {
	
	/** Create Site Data Access Object */
	public void CreateSite(SiteVO vo);
	
	/** Admin List Site Data Access Object */
	public List<SiteVO> AdminListSite();
	
	/** List Site Data Access Object */
	public List<SiteVO> ListSite(UserVO vo);
	
	/** Admin Edit Site Data Access Object */
	public List<SiteVO> EditSite(SiteVO vo); 
	
	/** Admin Delete Site Data Access Object */
	public boolean AdminDeleteSite(SiteVO vo);

}
