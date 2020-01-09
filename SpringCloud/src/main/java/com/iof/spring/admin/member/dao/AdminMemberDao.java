package com.iof.spring.admin.member.dao;

import java.util.List;

import com.iof.spring.user.model.VO.UserVO;

public interface AdminMemberDao {
	/** Member Email Check */
	public int EmailCheck(String Email);
	/** Count Member Number */
	public int CountMember();
	/** Paging Maker Member Use Offset */
	public List<UserVO> PagingMember(int page);

}
