package com.iof.spring.admin.ctrl;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Admin Main Management
 * @author duckheewon
 *
 */
@Controller
public class IndexController {

	
	/**
	 * Admin Main Page Redirect Login Page
	 * @return
	 */
	@RequestMapping("/admin")
	public String AdminHome() {
		System.out.println("Admin Home Page");
		//return "redirect:/admin/Users/Login";
		return "Admin/index";
	}
}
