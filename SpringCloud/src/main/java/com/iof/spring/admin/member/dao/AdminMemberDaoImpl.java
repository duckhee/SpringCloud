package com.iof.spring.admin.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iof.spring.user.model.VO.UserVO;

@Repository("AdminMemberDao")
public class AdminMemberDaoImpl implements AdminMemberDao {
	
	@Autowired
	private SqlSession session;
	
	/**
	 * Get Member Email Check
	 */
	@Override
	public int EmailCheck(String Email) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Emaili Check Dao");
		Map<String, Object> EmailMap = new HashMap<String, Object>();
		EmailMap.put("email", Email);
		return session.selectOne("AdminEmailCheckMember", EmailMap);
	}
	
	/**
	 * Get Member Number
	 */
	@Override
	public int CountMember() {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Count Dao");
		return session.selectOne("AdminCountMember");
	}
	
	/**
	 * Get Member Paging
	 */
	@Override
	public List<UserVO> PagingMember(int page) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member List Dao : " + page);
		Map<String, Object> PageMap = new HashMap<String, Object>();
		PageMap.put("page", page);
		return session.selectList("AdminPagingMember", PageMap);
	}

	

}
