package com.iof.spring.admin.member.service;

import java.util.List;
import java.util.Map;

import com.iof.spring.user.model.VO.JoinUserVO;
import com.iof.spring.user.model.VO.UserVO;


public interface AdminMemberService {
	
	/** Member Registe */
	public int RegisteMember(UserVO vo);
	
	/** Member Email Check */
	public boolean EmailCheck(String Email);
	
	/** Member List */
	public List<UserVO> PagingMember(int page);
	
	/** Member Detail */
	//public List<JoinUserVO> DetailMember(UserVO user);
	public JoinUserVO DetailMember(UserVO user);
	
	/** Member Update */
	public UserVO UpdateMember(UserVO user);	
	
	/** Member Delete */
	public Map<String, Object> DeleteMember(Map<String, Object> user);

}
