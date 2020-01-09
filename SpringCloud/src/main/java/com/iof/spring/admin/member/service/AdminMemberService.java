package com.iof.spring.admin.member.service;

import java.util.List;

import com.iof.spring.user.model.VO.UserVO;

public interface AdminMemberService {
	
	/** Member Email Check */
	public boolean EmailCheck(String Email);
	
	/** Member List */
	public List<UserVO> PagingMember(int page);
	

}
