package com.iof.spring.admin.user.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iof.spring.admin.user.service.AdminUserService;
import com.iof.spring.user.model.VO.UserVO;

@Controller
@RequestMapping("/admin/Users")
public class AdminUserController {
	
	@Resource(name="AdminUserService")
	private AdminUserService service;
	
	
	/**
	 * Go to Login Page Redirect
	 * @return
	 */
	@RequestMapping(value="/")
		public String UserMain() {
			System.out.println("Admin User Main");
			return "redirect:/admin/Users/Login";
		}
	
	/**
	 * Go to Login Page 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/Login", method=RequestMethod.GET)
	public String UserLogIn(Model model) {
		System.out.println("Admin User Login Page");
		return "Admin/User/LogInPage";
	}
	
	/**
	 * Login Post Logic Here 
	 * Redirect Main Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/Login", method=RequestMethod.POST)
	public String UserLogInDo(Model model) {
		System.out.println("Admin User Login Do");
		return "";
		
	}
	
	/**
	 * Log Out Logic Do
	 * here
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/LogOut", method=RequestMethod.POST)
	public String UserLogOutDo(Model model) {
		System.out.println("Admin User LogOut");
		return "";
	}
	
	/**
	 * User List Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list")
	public ModelAndView UserList(Model model, HttpServletRequest request) {
		/** get Page Number parameter */
		String GetPage = request.getParameter("page");
		int page = 0;
		/** Null Check */
		if(GetPage != null)
			page = Integer.parseInt(GetPage);
		System.out.println("Admin User List Page : " + page);
		/** List View Model */
		ModelAndView ListModel = new ModelAndView();
		/** Get Service */
		List<UserVO> list = service.PagingUser(page);
		/** Add Data Model */
		ListModel.addObject("UserList", list);
		ListModel.addObject("CurrentPage", page);
		/** View Model Set*/
		ListModel.setViewName("Admin/User/ListPage");
		return ListModel;
	}
	
	/**
	 * User Profile Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/Profile", method=RequestMethod.GET)
	public String UserProfilePage(Model model) {
		System.out.println("Admin User Profile Page");
		return "Admin/User/ProfilePage";
	}
	
	/**
	 * User Edit Page 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/EditPage", method=RequestMethod.GET)
	public String UserEditPage(Model model) {
		System.out.println("Admin User Edit Page");
		return "Admin/User/EditPage";
	}
	
	/**
	 * User Edit Logic Do
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/EditDo", method=RequestMethod.POST)
	public String UserEditDo(Model model) {
		System.out.println("Admin User Edit Do");
		return "redirect:/";
	}
	
}
