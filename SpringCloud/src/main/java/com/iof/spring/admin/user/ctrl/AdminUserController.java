package com.iof.spring.admin.user.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iof.spring.admin.user.service.AdminUserService;

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
			return "redirect:/admin/Users/Login";
		}
	
	/**
	 * Go to Login Page 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/Login", method=RequestMethod.GET)
	public String UserLogIn(Model model) {
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
		return "";
	}
	
	/**
	 * User List Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list")
	public String UserList(Model model) {
		
		return "Admin/User/ListPage";
	}
	
	/**
	 * User Profile Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/Profile", method=RequestMethod.GET)
	public String UserProfilePage(Model model) {
		return "Admin/User/ProfilePage";
	}
	
	/**
	 * User Edit Page 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/EditPage", method=RequestMethod.GET)
	public String UserEditPage(Model model) {
		return "Admin/User/EditPage";
	}
	
	/**
	 * User Edit Logic Do
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/EditDo", method=RequestMethod.POST)
	public String UserEditDo(Model model) {
		return "redirect:/";
	}
	
}
