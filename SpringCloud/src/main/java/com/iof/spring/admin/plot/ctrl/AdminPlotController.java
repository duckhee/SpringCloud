package com.iof.spring.admin.plot.ctrl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iof.spring.admin.plot.service.AdminPlotService;

@Controller
@RequestMapping("/admin/Plots")
public class AdminPlotController {

	@Autowired
	private AdminPlotService service;
	
	@RequestMapping(value="/")
	public String AdminPlotMainCtrl() {
		System.out.println("Admin Plot Main Controller Redirect Plots/list Page");
		return "redirect:/admin/Plots/list";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String AdminPlotCreatePage(Model model) {
		System.out.println("Admin Plot Controller Create Page");
		return "Admin/Plot/CreatePage";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String AdminPlotCreateDo() {
		System.out.println("Admin Plot Controller Create Do");
		return "redirect:/admin/Plots/list";
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String AdminPlotDetailPage() {
		return "Admin/Plot/DetailPage";
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String AdminPlotEditPage(HttpServletRequest request) {
		System.out.println("Admin Plot Controller Edit Page");
		return "Admin/Plot/EditPage";
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String AdminPlotEditDo() {
		System.out.println("Admin Plot Controller Edit Page");
		return "redirect:/admin/Plots/list";
	}
	
	@RequestMapping(value="/list")
	public String AdminPlotListPage(Model model) {
		System.out.println("Admin Plot Controller List Page");
		return "Admin/Plot/ListPage";
	}
	
	
	@RequestMapping(value="/delete")
	@ResponseBody
	public Map<String, Object> AdminPlotDeleteDo(@RequestBody Map<String, Object> _Delete){
		Map<String, Object> _DeleteDo = null;
		
		return _DeleteDo;
	}
}
