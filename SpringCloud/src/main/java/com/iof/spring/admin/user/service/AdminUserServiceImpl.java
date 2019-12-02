package com.iof.spring.admin.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.iof.spring.admin.user.dao.AdminUserDao;
import com.iof.spring.user.model.VO.UserVO;

@Service("AdminUserService")
public class AdminUserServiceImpl implements AdminUserService {
	
	@Resource(name="AdminUserDao")
	private AdminUserDao dao;

	@Override
	public void CreateUser(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("Admin User Service Create");
		dao.CreateRaw(user);
		
	}

	@Override
	public UserVO EmailCheck(String Email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean DeleteUser(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}
}
