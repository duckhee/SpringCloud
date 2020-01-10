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
	/** Member Paging */
	public List<UserVO> PagingUser(int page);
	/** User Login */
	public UserVO LoginUser(UserVO user);
	/** User Detail */
	public UserVO Detail(UserVO user);

}
