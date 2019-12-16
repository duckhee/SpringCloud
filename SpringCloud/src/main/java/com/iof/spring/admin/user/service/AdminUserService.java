package com.iof.spring.admin.user.service;

import java.util.List;

import com.iof.spring.user.model.VO.UserVO;

public interface AdminUserService {
	
	/** Create user */
	public void CreateUser(UserVO user);
	/** User Email Check */
	public UserVO EmailCheck(String Email);
	/** Delete User */
	public boolean DeleteUser(UserVO user);
	/** Member list */
	public List<UserVO> list();
	/** User Detail */
	public UserVO Detail(UserVO user);

}
