package com.iof.spring.admin.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iof.spring.user.model.VO.JoinUserVO;
import com.iof.spring.user.model.VO.UserVO;

@Repository("AdminMemberDao")
public class AdminMemberDaoImpl implements AdminMemberDao {
	
	@Autowired
	private SqlSession session;
	

	@Override
	public int RegisteMember(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Registe Dao");
		return session.insert("AdminRegisteMember", vo);
	}

	@Override
	public UserVO FindByEmailMember(String Email) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Find By Email Dao");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Email", Email);
		return session.selectOne("AdminFindEmailMember", map);
	}

	
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

	@Override
	public JoinUserVO DetailMember(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Detail Dao(Use LEFT JOIN)");
		return session.selectOne("AdminDetailMember", user);
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
