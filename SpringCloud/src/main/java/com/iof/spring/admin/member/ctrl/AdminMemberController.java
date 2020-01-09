package com.iof.spring.admin.member.ctrl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iof.spring.admin.member.service.AdminMemberService;
import com.iof.spring.user.model.VO.UserVO;

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
	@RequestMapping(value="Registe", method=RequestMethod.GET)
	public String RegisteMemberPage() {
		System.out.println("Admin Member Registe Page");
		return "Admin/Member/RegistePage";
	}
	
	@RequestMapping(value="/Registe", method=RequestMethod.POST)
	public String RegisteMemberDo() {
		System.out.println("Admin Member Registe Do");
		return "redirect:/admin/Members/list";
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
}