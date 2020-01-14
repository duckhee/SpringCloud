package com.iof.spring.admin.site.ctrl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iof.spring.admin.site.service.AdminSiteService;
import com.iof.spring.site.model.VO.SiteVO;

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
	public String SiteCreateDo(HttpServletRequest req) {
		System.out.println("Admin Site Create Do");
		/** Make Site Value Object */
		SiteVO _Site = new SiteVO();
		/** Get Parameter Site Owner and Site Name */
		String _SiteName = "";
		String _SiteOwner = "";
		System.out.println("Model : " + req.getParameter("siteName"));
		System.out.println("Model : " + req.getParameter("siteownerId"));
		return "redirect:/Sites/list";
	}
	
	/** 
	 * Site Edit Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String SiteEditPage(Model model, HttpServletRequest request) {
		System.out.println("Admin Site Edit Page");
		/** Get Parameter Site Id */
		return "Admin/Site/EditPage";
	}
	
	/**
	 * Site Edit Do Logic
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String SiteEditDo(Model model, HttpServletRequest request) {
		System.out.println("Admin Site Edit Do");
		/** Get Parameter Site Id */
		String _GetSiteId = request.getParameter("id");
		System.out.println("Get Parameter Site Id : " + _GetSiteId);
		return "redirect:/Sites/list";
	}
	
	/**
	 * Site Detail Page
	 * @param model set Detail Value
	 * @param request get Site Id Parameter
	 * @return view path
	 */
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String SiteDetailPage(Model model, HttpServletRequest request) {
		System.out.println("Admin Site Detail Page");
		return "/Admin/Site/DetailPage";
	}
	
	/**
	 * Site List Page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list")
	public String SiteListPage(Model model, HttpServletRequest request) {
		System.out.println("Admin Site List Page");
		/** Get page number Parameter */
		String _GetPage = request.getParameter("page");
		int page = 0;
		/** Get page Parameter Change Integer Type */
		if(_GetPage != null) {
			try {
				/** Page Make Integer Type */
				page = Integer.parseInt(_GetPage);
			}catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Input Not Number");
				page  = 0;
			}
		}
		/** Get paging Site List */
		List<SiteVO> ServiceList = service.PagingSite(page);
		/** List View Model */
		model.addAttribute("SiteList", ServiceList);
		
		return "Admin/Site/ListPage";
	}
	
	@RequestMapping(value="/realodList", method=RequestMethod.POST)
	@ResponseBody
	public List<SiteVO> ReloadList(@RequestBody Map<String, Object> _ReloadSiteParameter){
		System.out.println("Admin Site Reload List Ctrl");
		/** Get Reload Site List Parameter */
		Map<String, Object> _ReloadSite = _ReloadSiteParameter;
		System.out.println("Get Parameter : " + _ReloadSite);
		/** Get Reload Site List Data List */
		List<SiteVO> _ReloadList = null;
		return _ReloadList;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	@ResponseBody
	public String SiteDeleteDo(@RequestBody Map<String, Object> Delete) {
		System.out.println("Admin Site Delete Do");
		return "redirect:/admin/Site/list";
	}
	
	
}
