package com.iof.spring.admin.ctrl;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

	
	/**
	 * Admin Main Page Redirect Login Page
	 * @return
	 */
	@RequestMapping("/admin")
	public String AdminHome() {
		System.out.println("Admin Home Ctrl redirect login Page");
		//return "redirect:/admin/Users/Login";
		return "Admin/index";
	}
}
