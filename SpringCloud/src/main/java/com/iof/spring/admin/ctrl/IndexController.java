package com.iof.spring.admin.ctrl;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Admin Main Management
 * @author duckheewon
 *
 */
@Controller
public class IndexController {
	@Autowired
	CookieCsrfTokenRepository _csrf;
	/**
	 * Admin Main Page Redirect Login Page
	 * @return
	 */
	@RequestMapping("/admin")
	public String AdminHome(Model model, HttpSession session) {
		System.out.println("Admin Home Page");
		System.out.println("Get Session : " + session.getAttribute("user"));
		return "Admin/index";
	}
}
