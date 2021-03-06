package com.iof.spring.admin.member.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.iof.spring.admin.member.dao.AdminMemberDao;
import com.iof.spring.user.model.VO.JoinUserVO;
import com.iof.spring.user.model.VO.UserVO;
import com.iof.spring.util.ValidUtil;


/**
 * Admin Member ServiceImpl
 * @author duckheewon
 *
 */
@Service("AdminMemberService")
public class AdminMemberServiceImpl implements AdminMemberService {
	
	@Autowired
	AdminMemberDao dao;
	/** Password Security */
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	
	/**
	 * Member Registe Logic
	 * @param UserVO
	 * @return int
	 */
	@Override
	public int RegisteMember(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Registe Service");
		int _UserLevel = vo.getUserLevel();
		if(_UserLevel == 0) {
			vo.setUserLevel(5);
		}
		System.out.println("User Level Get : " + _UserLevel);
		/** Password Encoding */
		String _password = vo.getUserPassword();
		String password = passwordEncoder.encode(_password);
		System.out.println("Password Encoding : " + password);
		vo.setUserPassword(password);
		return dao.RegisteMember(vo);
		//return 0;
	}
	
	/**
	 * Member Email Check Logic
	 * @param UserEmail
	 * @return boolean
	 */
	@Override
	public boolean EmailCheck(String Email) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Registe Email Check Service");
		/** Get Data */
		int EmailNumber = dao.EmailCheck(Email);
		System.out.println("Get Email Number : " + EmailNumber);
		if(EmailNumber <= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Member List Service Logic
	 * @param page Number
	 * @return List<userVO>
	 */
	@Override
	public List<UserVO> PagingMember(int page) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member List Service");
		/** Total User Number */
		int totalCountMember = dao.CountMember();		
		System.out.println("Total : " + totalCountMember);
		if(page <= 0) {
			page = 1;
		}
		int ListNumber = 10;
		int TotalPage = 0;
		/** Get All Page Number */
		if(totalCountMember % ListNumber == 0) {
			TotalPage = totalCountMember / ListNumber;
		}else {
			TotalPage = totalCountMember / ListNumber + 1;
		}
		if(page > TotalPage) {
			page = TotalPage;
		}
		page = page - 1;
		System.out.println("Page : " + page);
		List<UserVO> MemberPagingList = dao.PagingMember(page);
		
		return MemberPagingList;
	}

	@Override
	//public List<JoinUserVO> DetailMember(UserVO user) {
	public JoinUserVO DetailMember(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Detail Service");
		
		return dao.DetailMember(user);
	}

	@Override
	public UserVO UpdateMember(UserVO user) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Update Service");
		return null;
	}

	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> DeleteMember(Map<String, Object> user) {
		// TODO Auto-generated method stub
		System.out.println("Admin Member Delete Service");
		/** Return Map */
		Map<String, Object> _ReturnValue = new HashMap<String, Object>();
		/** Get Member */
		List<UserVO> _GetMemberList = null;
		/** Get Delete userId Parameter Length */
		int _DeleteLength = -1;
		System.out.println("delete ID : " + user.get("deleteId"));
		try {
			_DeleteLength = ((ArrayList<Object>) user.get("deleteId")).size();
		}catch (Exception e) {
			// TODO: handle exception
			_DeleteLength = -1;
		}
		/** Check Parameter */
		if(_DeleteLength <= 0) {
			System.out.println("parameter Not Input");
			_ReturnValue.put("msgFlag", null);
			_ReturnValue.put("msg", "Not Input Parameter");
			return _ReturnValue;
		}
		/** Check Delete Flag */
		int _DeleteFlag = dao.DeleteMember(user);
		System.out.println("Delete Flag : " + _DeleteFlag);
		if(_DeleteFlag == 0) {
			System.out.println("Delete Failed");
			_ReturnValue.put("msgFlag", null);
			_ReturnValue.put("msg", "Delete Failed");
			return _ReturnValue;
		}
		/** Get Page Number */
		int Page;
		try {
			Page = (int)user.get("page");
			System.out.println("Page : " + Page);
		}catch(Exception e) {
			System.out.println("Change Integer type Error : " + user.get("page"));
			Page = 0;
		}
		/** Delete Success Get Paging Member */		
		_GetMemberList = dao.PagingMember((int)user.get("page"));
		if(_GetMemberList == null) {
			_ReturnValue.put("msgFlag", false);
			_ReturnValue.put("msg", "not have Value");
		}else {
			_ReturnValue.put("msgFlag", true);
		}
		_ReturnValue.put("reload", _GetMemberList);
		
		return _ReturnValue;
	}


}
