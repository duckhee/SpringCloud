package com.iof.spring.admin.user.service;

import com.iof.spring.user.model.VO.UserVO;

public interface AdminUserService {
	
	/** Create user */
	public void CreateUser(UserVO user);
	/** User Email Check */
	public UserVO EmailCheck(String Email);
	/** Delete User */
	public boolean DeleteUser(UserVO user);

}
