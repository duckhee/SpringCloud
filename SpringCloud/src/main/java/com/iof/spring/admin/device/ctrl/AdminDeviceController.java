package com.iof.spring.admin.device.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

}
