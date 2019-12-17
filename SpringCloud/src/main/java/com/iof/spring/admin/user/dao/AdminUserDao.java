package com.iof.spring.admin.user.dao;

import java.util.List;

import com.iof.spring.user.model.VO.UserVO;

public interface AdminUserDao {
	
	/** Create User data access object */
	public void CreateRaw(UserVO vo);
	/** Email Check data access object */
	public UserVO EmailCheckRaw(String Email);
	/** Member list */
	public List<UserVO> list();
	

}
