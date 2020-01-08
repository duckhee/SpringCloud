package com.iof.spring.admin.user.service;

import java.util.List;

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
		System.out.println(""+dao.CountUser());
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

	@Override
	public List<UserVO> list() {
		// TODO Auto-generated method stub
		System.out.println(""+dao.CountUser());
		return null;
	}

	@Override
	public UserVO Detail(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}
}
