package com.iof.spring.admin.site.ctrl;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iof.spring.admin.site.service.AdminSiteService;

/**
 * Admin Site Management
 * @author duckheewon
 *
 */
@Controller
@RequestMapping("/admin/Sites")
public class SiteController {
	
	@Resource(name="AdminSiteService")
	private AdminSiteService service;
	
	@RequestMapping(value="/")
	public String SiteMain() {
		System.out.println("Admin Site Main Redirect List Page");
		return "redirect:/admin/Sites/list";
	}
	
	/**
	 * Site Create Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String SiteCreatePage(Model model) {
		System.out.println("Admin Site Create Page");
		return "Admin/Site/CreatePage";
	}
	
	/**
	 * Site Create Do Logic 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String SiteCreateDo(Model model) {
		System.out.println("Admin Site Create Do");
		return "redirect:/Sites/list";
	}
	
	/** 
	 * Site Edit Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String SiteEditPage(Model model) {
		System.out.println("Admin Site Edit Page");
		return "Admin/Site/EditPage";
	}
	
	/**
	 * Site Edit Do Logic
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String SiteEditDo(Model model) {
		System.out.println("Admin Site Edit Do");
		return "redirect:/Sites/list";
	}
	
	/**
	 * Site List Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String SiteListPage(Model model) {
		System.out.println("Admin Site List Page");
		return "Admin/Site/ListPage";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	@ResponseBody
	public String SiteDeleteDo(@RequestBody Map<String, Object> Delete) {
		System.out.println("Admin Site Delete Do");
		return "redirect:/admin/Site/list";
	}
	
	
}
