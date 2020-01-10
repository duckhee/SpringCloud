package com.iof.spring.admin.user.dao;

import java.util.List;

import com.iof.spring.user.model.VO.UserVO;

public interface AdminUserDao {
	
	/** Create User data access object */
	public void CreateRaw(UserVO vo);
	/** Email Check data access object */
	public UserVO EmailCheckRaw(String Email);
	/** User Login */
	public UserVO LoginUser(UserVO vo);
	/** Member Number */
	public int CountUser();
	/** Member list */
	public List<UserVO> list();
	/** Member Paging */
	public List<UserVO> PagingUser(int page);
	

}
