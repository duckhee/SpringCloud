package com.iof.spring.admin.user.dao;

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
		System.out.println("Create Dao");
	}

	@Override
	public UserVO EmailCheckRaw(String Email) {
		// TODO Auto-generated method stub
		return null;
	}

}
