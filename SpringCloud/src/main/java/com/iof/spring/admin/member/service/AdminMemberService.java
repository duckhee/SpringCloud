package com.iof.spring.admin.member.service;

import java.util.List;

import com.iof.spring.user.model.VO.UserVO;

public interface AdminMemberService {
	
	/** Member List */
	public List<UserVO> PagingMember(int page);

}
