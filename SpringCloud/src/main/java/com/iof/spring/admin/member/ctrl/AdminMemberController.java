package com.iof.spring.admin.member.ctrl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.iof.spring.admin.member.service.AdminMemberService;
import com.iof.spring.user.model.VO.JoinUserVO;
import com.iof.spring.user.model.VO.UserVO;
import com.iof.spring.util.ValidUtil;

/**
 * Admin Member Management
 * @author duckheewon
 *
 */
@Controller
@RequestMapping("/admin/Members")
public class AdminMemberController {

	@Autowired
	private AdminMemberService service;
	
	/**
	 * Member Registe Page
	 * @return RegistePage.jsp
	 */
	@RequestMapping(value="/Registe", method=RequestMethod.GET)
	public String RegisteMemberPage() {
		System.out.println("Admin Member Ctrl Registe Page");
		return "Admin/Member/RegistePage";
	}
	
	/**
	 * Member having Check
	 * @return
	 */
	@RequestMapping(value="/checkEmail", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> EmailCheck(@RequestBody Map<String, String> Email, ValidUtil valid){
		System.out.println("Admin Member Ctrl Registe Email Check Controller");
		System.out.println("Parameter : " + Email);
		Map<String, Object> EmailMap = new HashMap<String, Object>();
		boolean flag;
		/** Not have Email value */
		if(Email.get("Email") == null || Email.get("Email") == "") {
			EmailMap.put("flag", false);
			EmailMap.put("message", "Email is Null");
			return EmailMap;
		}
		/** Check Email type */
		if(!valid.ValidEmail(Email.get("Email"))) {
			System.out.println("Not Email Type");
			EmailMap.put("flag", false);
			EmailMap.put("message", "Not Email Type");
			return EmailMap;
		}
		/** Email Having Check */
		flag = service.EmailCheck(Email.get("Email"));
		EmailMap.put("flag", flag);
		if(flag) {
			System.out.println("Enable Make User");
			EmailMap.put("message", "Enable");
		}else {
			System.out.println("Disable Make User");
			EmailMap.put("message", "Disable");
		}
		/** Return Json */
		return EmailMap;
	}
	
	/**
	 * Member Registe Do Logic Controller
	 * @return
	 */
	@RequestMapping(value="/Registe", method=RequestMethod.POST)
	public String RegisteMemberDo(HttpServletRequest req, HttpSession session) {
		System.out.println("Admin Member Ctrl Registe Do");
		/** Get Parameter */
		String UserEmail = req.getParameter("UserEmail");
		String UserName = req.getParameter("UserName");
		String UserPassword = req.getParameter("UserPassword");
		/** Get Session Check User Level */
		
		/** Annotation Not Compile error
		 * 1. all : 모든 경고를 억제
		 * 2. cast : 캐스트 연산자 관련 경고 억제
		 * 3. dep-ann : 사용하지 말아야 할 주석 관련 경고 억제
		 * 4. deprecation : 사용하지 말아야 할 메소드 관련 경고 억제
		 * 5. fallthrough : switch문에서의 break 누락 관련 경고 억제
		 * 6. finally : 반환하지 않는 finally 블럭 관련 경고 억제
		 * 7. null : null 분석 관련 경고 억제
		 * 8. rawtypes : 제네릭을 사용하는 클래스 매개 변수가 불특정일 때의 경고 억제
		 * 9. unchecked : 검증되지 않은 연산자 관련 경고 억제
		 * 10. unused : 사용하지 않는 코드 관련 경고 억제
		 */
		@SuppressWarnings("unchecked")
		Map<String, Object> _UserSessionInfo = (HashMap<String, Object>)session.getAttribute("user");
		if(_UserSessionInfo == null) {
			/** Not Login User */
			return "redirect:/admin/Users/Login";
		}
		/**  Need To Login User Level Check */
		System.out.println("User Session : " + _UserSessionInfo.get("UserLevel"));
		/** Make UserVO */
		UserVO newUser =  new UserVO();
		newUser.setUserEmail(UserEmail);
		newUser.setUserName(UserName);
		newUser.setUserPassword(UserPassword);
		/** User Create Time */
		Date _CreateTime = new Date();
		/** Set User Create Time And Update Time */
		newUser.setCreatedAt(_CreateTime);
		newUser.setUpdatedAt(_CreateTime);
		System.out.println("User Email : " + UserEmail + ", User Name : " + UserName + ", User Password : " + UserPassword);
		System.out.println("User VO : " + newUser);
		/** Service Registe User */
		int InsertFlag = service.RegisteMember(newUser);
		/** Insert Result Check */
		if(InsertFlag > 0) {
			System.out.println("Admin Member Registe");
			return "redirect:/admin/Members/list";
		}else {
			System.out.println("Admin Member Not Registe");
			return "redirect:/admin/Members/Registe";
		}
		
	}
	
	/** 
	 * Member List Page
	 * @return ModelAndView
	 */
	@RequestMapping(value="/list")
	public ModelAndView AdminMemberList(HttpServletRequest request) {
		System.out.println("Admin Member Ctrl List Page");
		/** Get Page Number Parameter */
		String GetPage = request.getParameter("page");
		int page = 0;
		/** Get Page Parameter Change Integer Type */
		if(GetPage != null) {
			try {
				/** Page Make Integer Type Change */
				page = Integer.parseInt(GetPage);				
			}catch(NumberFormatException e) {
				System.out.println("Input not Number");
				page = 0;
			}
		}
		/** Get Paging Member List */
		List<UserVO> ServiceList = service.PagingMember(page);
		/** List View Model */
		ModelAndView MemberListView = new ModelAndView();
		/** Add Data Model */
		MemberListView.addObject("UserList", ServiceList);
		/** Set View Model */
		MemberListView.setViewName("Admin/Member/ListPage");
		return MemberListView;
	}
	
	/**
	 * Member List Reloading Data
	 * @param _ReloadList
	 * @return
	 */
	@RequestMapping(value="/reloadList", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> AdminMemberListReload(@RequestBody Map<String, Object> _ReloadList){
		System.out.println("Admin Member Ctrl Delete User Do And Reload List");
		Map<String, Object> _ReturnJson = new HashMap<String, Object>();
		return _ReturnJson;
	}
	
	/**
	 * Member Detail page
	 * @param request 
	 * @return ModelAndView
	 */
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public ModelAndView AdminMemberDetailPage(HttpServletRequest request) {
		System.out.println("Admin Member Ctrl Detail page");
		/** Model And View Call */
		ModelAndView MemberDetailView = new ModelAndView();
		String _UserEmail = request.getParameter("Email");
		String _UserId = request.getParameter("id");
		int UserId;
		String _pre = request.getHeader("Referer");
		UserVO _user = new UserVO();
		/** Check User Parameter Type */
		if(_UserId == null) {
			/** Return Previous Page */
			if(_pre == null) {
				/** Previous page not have */
				MemberDetailView.setViewName("redirect:/admin/Members/list");
			}else {
				/** Return Previous Page */
				System.out.println("Previous Page : " + _pre);
				MemberDetailView.setViewName("redirect:"+_pre);
			}
			return MemberDetailView;
		}
		try {
			UserId = Integer.parseInt(_UserId);
		}catch(NumberFormatException e) {
			/** Return Previous Page */
			if(_pre == null) {
				/** Previous page not have */
				MemberDetailView.setViewName("redirect:/admin/Members/list");
			}else {
				/** Return Previous Page */
				System.out.println("Previous Page : " + _pre);
				MemberDetailView.setViewName("redirect:"+_pre);
			}
			return MemberDetailView;
		}
		/** Detail View Page Search Parameter */
		_user.setId(UserId);
		//_user.setUserEmail(_UserEmail);
		//List<JoinUserVO> user = service.DetailMember(_user);
		JoinUserVO user = service.DetailMember(_user);
		/** If Not User Data Return List Page */
		if(user == null) {
			System.out.println("Not Registe Member");
			MemberDetailView.setViewName("redirect:/admin/Members/list");
			return MemberDetailView;
		}
		System.out.println("JOIN USER : " + user);
		/** Detail User Data */
		MemberDetailView.addObject("user", user);
		/** Detail View Template Set */
		MemberDetailView.setViewName("Admin/Member/DetailPage");
		return MemberDetailView;
	}
	
	/**
	 * Member Edit Page
	 * @param request String Type
	 * @return Edit Page
	 */
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView AdminMemberEditPage(HttpServletRequest request) {
		System.out.println("Admin Member Ctrl Edit Page");
		ModelAndView EditView = new ModelAndView();
		String _pre = request.getHeader("Referer");
		String _EditMemberId = request.getParameter("id");
		/** Find Set UserVO */
		UserVO _FindUser = new UserVO();
		/** Change Edit Member Id Integer Type */
		int EditMemberId = 0;
		/** Not Select Member ID */
		if(_EditMemberId == null) {
			/** Return Previous Page */
			if(_pre == null){
				/** Previous page not have */
				EditView.setViewName("redirect:/admin/Members/list");
			}else {
				/** Return Previous Page */
				System.out.println("Previous Page : " + _pre);
				EditView.setViewName("redirect:" + _pre);
			}
			return EditView;
		}
		try {
			EditMemberId = Integer.parseInt(_EditMemberId);
		}catch(NumberFormatException e) {
			EditView.setViewName("redirect:" + _pre);
			return EditView;
		}
		System.out.println("Edit Member Id : " + EditMemberId);
		/** Detail Find Set UserVO */
		_FindUser.setId(EditMemberId);
		//List<JoinUserVO> _DetailUser = service.DetailMember(_FindUser);
		JoinUserVO _DetailUser = service.DetailMember(_FindUser);
		/** Set User Data */
		EditView.addObject("DetailUser", _DetailUser);
		/** Set Edit View Page Set */
		EditView.setViewName("Admin/Member/EditPage");
		return EditView;
	}
	
	/**
	 * Member Edit Do
	 * @param model
	 * @return redirect Detail Page
	 */
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String AdminMemberEditDo(Model model) {
		System.out.println("Admin Member Ctrl Edit Do");
		return "redirect:/admin/Members/detail";
	}
	
	/**
	 * Member Delete Do Logic
	 * @return redirect Member List Value
	 */
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	/** Response Body Value */
	@ResponseBody
	public List<UserVO> AdminMemberDeleteDo(@RequestBody Map<String, Object> _Delete) {
		System.out.println("Admin Member Ctrl Delete Do");
		System.out.println("Delete Number : " + _Delete);
		/** Return List Value */
		List<UserVO> _ReturnList = new ArrayList<UserVO>();
		if(_Delete == null) {
			System.out.println("Delete User Not Select");
			_ReturnList = null;
			return _ReturnList;
		}
		/** Get Page Number */
		int Page;
		try {
			Page = Integer.parseInt((String)_Delete.get("page"));
		}catch(NumberFormatException e) {
			Page = 0;
		}
		_ReturnList = service.PagingMember(Page);
		return _ReturnList;
	}
	
}
