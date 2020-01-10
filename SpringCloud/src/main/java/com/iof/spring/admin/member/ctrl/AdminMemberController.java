package com.iof.spring.admin.member.ctrl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
		System.out.println("Admin Member Registe Page");
		return "Admin/Member/RegistePage";
	}
	
	/**
	 * Member having Check
	 * @return
	 */
	@RequestMapping(value="/checkEmail", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> EmailCheck(@RequestBody Map<String, String> Email, ValidUtil valid){
		System.out.println("Admin Member Registe Email Check Controller");
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
	public String RegisteMemberDo(HttpServletRequest req) {
		System.out.println("Admin Member Registe Do");
		/** Get Parameter */
		String UserEmail = req.getParameter("UserEmail");
		String UserName = req.getParameter("UserName");
		String UserPassword = req.getParameter("UserPassword");
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
		System.out.println("Admin Member List Page");
		/** Get Page Number Parameter */
		String GetPage = request.getParameter("page");
		int page = 0;
		/** Get Page Parameter Change Integer Type */
		if(GetPage != null) {
			try {
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
	 * Member Detail page
	 * @param request 
	 * @return ModelAndView
	 */
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public ModelAndView AdminMemberDetailPage(HttpServletRequest request) {
		System.out.println("Admin Member Detail page");
		String _UserEmail = request.getParameter("Email");
		UserVO _user = new UserVO();
		_user.setId(1);
		//_user.setUserEmail(_UserEmail);
		JoinUserVO user = service.DetailMember(_user);
		System.out.println("JOIN USER : " + user);
		ModelAndView MemberDetailView = new ModelAndView();
		MemberDetailView.setViewName("Admin/Member/DetailPage");
		return MemberDetailView;
	}
	
	/**
	 * Member Edit Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView AdminMemberEditPage() {
		System.out.println("Admin Member Edit Page");
		ModelAndView EditView = new ModelAndView();
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
		
		return "redirect:/admin/Members/detail";
	}
	
}
