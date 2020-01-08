package com.iof.spring.admin.site.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iof.spring.admin.site.service.AdminSiteService;

@Controller
@RequestMapping("/admin/Sites")
public class SiteController {
	
	@Resource(name="AdminSiteService")
	private AdminSiteService service;
	
	@RequestMapping(value="/")
	public String SiteMain() {
		System.out.println("Admin Site Main");
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
		System.out.println("Admin Site List");
		return "Admin/Site/ListPage";
	}
	
	
	
}
