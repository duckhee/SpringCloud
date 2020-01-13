package com.iof.spring.admin.member.dao;

import java.util.List;
import java.util.Map;

import com.iof.spring.user.model.VO.JoinUserVO;
import com.iof.spring.user.model.VO.UserVO;

public interface AdminMemberDao {
	/** Member Registe */
	public int RegisteMember(UserVO vo);
	/** Member find by Email */
	public UserVO FindByEmailMember(String Email);
	/** Member Email Check */
	public int EmailCheck(String Email);
	/** Member Detail */
	//public List<JoinUserVO> DetailMember(UserVO user);
	public JoinUserVO DetailMember(UserVO user);
	/** Member Delete */
	public int DeleteMember(UserVO user);
	/** Count Member Number */
	public int CountMember();
	/** Paging Maker Member Use Offset */
	public List<UserVO> PagingMember(int page);

}
