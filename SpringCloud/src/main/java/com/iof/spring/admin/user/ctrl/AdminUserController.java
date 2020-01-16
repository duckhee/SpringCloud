package com.iof.spring.admin.user.ctrl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.iof.spring.admin.user.service.AdminUserService;
import com.iof.spring.user.model.VO.UserVO;

/**
 * Admin User Management
 * @author duckheewon
 *
 */
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
	 * Go to Registe User Page
	 * @return
	 */
	@RequestMapping(value="/Registe", method=RequestMethod.GET)
	public String UserRegistePage() {
		System.out.println("Admin User Registe Page");
		return "Admin/User/RegistePage";
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
	public String UserLogInDo(UserVO user, HttpServletRequest request) {
		System.out.println("Admin User Login Do : " + user);
		/** Login Service */
		UserVO _login = service.LoginUser(user);
		System.out.println("Login Service Value : " + _login);
		/** Login Info Save Session */
		//HttpSession session;
		Map<String, Object> _LoginSession = new HashMap<String, Object>();
		String referer = request.getHeader("Referer");
		System.out.println("Test Redirect Previous Page : " + referer);
		/** Login After Do */
		if(_login == null) {
			return "redirect:/admin/Users/Login";
		}else {
			_LoginSession.put("UserEmail", _login.getUserEmail());
			_LoginSession.put("UserName", _login.getUserName());
			_LoginSession.put("UserLevel", _login.getUserLevel());
			request.getSession().setAttribute("user", _LoginSession);
			return "redirect:/admin";
		}
		
	}
	
	/**
	 * Log Out Logic Do
	 * here
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/LogOut", method=RequestMethod.POST)
	public String UserLogOutDo(Model model, HttpSession session) {
		System.out.println("Admin User LogOut");
		/** Session Get Attribute user */
		if(session.getAttribute("user") == null) {
			System.out.println("Not Login User");
			return "redirect:/admin/Users/Login";
		}
		System.out.println("Get Session : " + session.getAttribute("user"));
		/** Session reset */
		session.invalidate();
		return "redirect:/admin";
	}
	
	
	/**
	 * TODO delete this method
	 * User List Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list")
	public String UserList(Model model, HttpServletRequest request) {
		System.out.println("Admin User List Control Redirect Member List");
		/** get Page Number parameter */
		String GetPage = request.getParameter("page");
		if(GetPage != null) {
			/** redirect Get page Number */
			return "redirect:/admin/Members/list?page="+GetPage;
		}else {
			/** redirect Main List Page */
			return "redirect:/admin/Members/list";
		}
	}
	
	/**
	 * User Profile Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/Profile", method=RequestMethod.GET)
	public String UserProfilePage(Model model, HttpServletRequest request) {
		System.out.println("Admin User Profile Page");
		/** Get User Profile Id */
		String _Getid = request.getParameter("id");
		int _Id;
		try {
			_Id = Integer.parseInt(_Getid);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Not Integer Type Parameter");
			return "redirect:/admin/";
		}
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
