package com.iof.spring.admin.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.iof.spring.admin.user.dao.AdminUserDao;
import com.iof.spring.user.model.VO.UserVO;

@Service("AdminUserService")
public class AdminUserServiceImpl implements AdminUserService {
	
	@Resource(name="AdminUserDao")
	private AdminUserDao dao;
	
	/** Password Security */
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	//BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Override
	public void CreateUser(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("Admin User Service Create");
		System.out.println(""+dao.CountUser());
		String password = passwordEncoder.encode(user.getUserPassword());
		user.setUserPassword(password);
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
		System.out.println("Admin User List Service");
		
		return null;
	}

	@Override
	public UserVO Detail(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserVO> PagingUser(int page) {
		// TODO Auto-generated method stub
		System.out.println("Admin User List Paging Service");
		if(page <= 0) {
			page = 1;
		}
		/** Total User Number */
		int totalCount = dao.CountUser();
		/** View Number */
		int ListNumber = 10;
		/** total page */
		int TotalPage;
		if(totalCount % ListNumber == 0) {			
			TotalPage = totalCount / ListNumber;
		}else {
			TotalPage = totalCount / ListNumber + 1;
		}
		if(page > TotalPage) {
			page = TotalPage;
		}
		page = page - 1;
		System.out.println("Total User Number : " + totalCount+", View Number : "+ListNumber);
		System.out.println("page : " + page);
		List<UserVO> UserList = dao.PagingUser(page);
		System.out.println(""+UserList);
		return UserList;
	}

	@Override
	public UserVO LoginUser(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("Admin User Login Service");
		System.out.println("Login User Input Value : " + user);
		UserVO _Login = dao.LoginUser(user);
		String _password = _Login.getUserPassword();
		boolean Flag = passwordEncoder.matches(user.getUserPassword(), _password);
		if(Flag == true) {
			return _Login;
		}else {
			return null;
		}
	}
	
}
