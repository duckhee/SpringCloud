package com.iof.spring.admin.device.ctrl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iof.spring.admin.device.service.AdminDeviceService;

@Controller
@RequestMapping("/admin/Devices")
public class AdminDeviceController {
	
	@Autowired
	private AdminDeviceService service;
	
	@RequestMapping(value="/")
	public String AdminDeviceMain() {
		System.out.println("Admin Device Controller Main Redirect Device List Page");
		return "redirect:/admin/Devices/list";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String AdminDeviceCreatePage() {
		System.out.println("Admin Device Controller Create Page");
		return "Admin/Device/CreatePage";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String AdminDeviceCreateDo(){
		System.out.println("Admin Device Controller Create Do");
		return "redirect:/admin/Devices/list";
	}
	
	
	@RequestMapping(value="/list")
	public String AdminDeviceListPage() {
		System.out.println("Admin Device Controller List Page");
		return "Admin/Device/ListPage";
	}
	
	 @RequestMapping(value="/delete", method=RequestMethod.POST)
	 @ResponseBody
	 public Map<String, Object> AdminDeviceDeleteDo(){
		 Map<String, Object> _return = new HashMap<String, Object>();
		 return _return;
	 }
	 
	 @RequestMapping(value="/detail", method=RequestMethod.GET)
	 public String AdminDeviceDetailPage(HttpServletRequest request, HttpSession session) {
		 return "redirect:/";
	 }
	 
	 
	 @RequestMapping(value="/edit", method=RequestMethod.GET)
	 public String AdminDeviceEditPage(Model model, HttpServletRequest request, HttpSession session) {
		 return "redirect:/";
	 }
	 
	 @RequestMapping(value="/edit", method=RequestMethod.POST)
	 public String AdminDeviceEditDo(HttpServletRequest request, HttpSession session) {
		 return "redirect:/";
	 }
}
