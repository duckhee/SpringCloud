package com.iof.spring.admin.member.service;

import java.util.List;

import com.iof.spring.user.model.VO.UserVO;
import com.iof.spring.util.ValidUtil;

public interface AdminMemberService {
	
	/** Member Registe */
	public int RegisteMember(UserVO vo);
	
	/** Member Email Check */
	public boolean EmailCheck(String Email);
	
	/** Member List */
	public List<UserVO> PagingMember(int page);
	
	/** Member Detail */
	
	
	/** Member Update */
	public UserVO UpdateMember(UserVO user);	
	
	/** Member Delete */
	public int DeleteMember(UserVO user);

}
