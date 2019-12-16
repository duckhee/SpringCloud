package com.iof.spring.admin.user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iof.spring.user.model.VO.UserVO;

@Repository("AdminUserDao")
public class AdminUserDaoImpl implements AdminUserDao {
	
	@Autowired
	private SqlSession session;

	@Override
	public void CreateRaw(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Create User Dao");
		System.out.println("parameter : "+ vo.toString());
		session.insert("Insert", vo);
	}

	@Override
	public UserVO EmailCheckRaw(String Email) {
		// TODO Auto-generated method stub
		System.out.println("User Email Check" + Email);
		Map<String, String> EmailChecking = new HashMap<String, String>();
		EmailChecking.put("UserEmail", Email);
		session.selectOne("EmailCheck", EmailChecking);
		return null;
	}

	@Override
	public List<UserVO> list() {
		// TODO Auto-generated method stub
		System.out.println("User Member List Dao");
		return session.selectList("listUser");
	}

}
