package com.iof.spring.admin.site.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iof.spring.site.model.VO.SiteVO;
import com.iof.spring.user.model.VO.UserVO;

@Repository("AdminSiteDao")
public class AdminSiteDaoImpl implements AdminSiteDao{
	
	@Autowired
	private SqlSession session;

	@Override
	public void CreateSite(SiteVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Create Dao");
		
	}

	@Override
	public List<SiteVO> AdminListSite() {
		// TODO Auto-generated method stub
		System.out.println("Admin Site All List Dao");
		return null;
	}

	@Override
	public List<SiteVO> ListSite(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site List Dao");
		return null;
	}

	@Override
	public boolean AdminDeleteSite(SiteVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Delete Dao");
		return false;
	}

	@Override
	public List<SiteVO> EditSite(SiteVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Edit Dao");
		return null;
	}
	
	
}
