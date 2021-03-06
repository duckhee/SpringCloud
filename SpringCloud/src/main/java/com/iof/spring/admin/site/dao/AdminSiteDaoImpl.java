package com.iof.spring.admin.site.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public int CreateSite(SiteVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Admin Site Create Dao");
		return session.insert("AdminCreateSite", vo);
	}

	@Override
	public List<SiteVO> AdminListSite() {
		// TODO Auto-generated method stub
		System.out.println("Admin Site All List Dao");
		return null;
	}

	@Override
	public int AdminCountSite() {
		// TODO Auto-generated method stub
		System.out.println("Admin Site All Count Number Dao");
		return session.selectOne("AdminCountSite");
	}

	@Override
	public List<SiteVO> AdminPagingSite(int page){
		// TODO Auto-generated method stub
		System.out.println("Admin Site List Dao");
		Map<String, Object> PageMap = new HashMap<String, Object>();
		PageMap.put("page", page);
		return session.selectList("AdminPagingSite", PageMap);
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

	@Override
	public SiteVO AdminSiteDetail(SiteVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Admi Site Detail Dao");
		return session.selectOne("AdminDetailSite", vo);
	}

	
	
}
