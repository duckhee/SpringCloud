package com.iof.spring.test.admin.user;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.iof.spring.admin.user.ctrl.AdminUserController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
@FixMethodOrder(MethodSorters.JVM)
public class AdminUserControllerTest {
	
	/**
	 * Admin User Controller Get
	 * web application config support
	 */
	@InjectMocks
	private AdminUserController _AdminUserController;
	/** Test Object Not Tomcat Use Controller Test do*/
	private MockMvc mockMvc;
	
	/**
	 * Setting MockMvs Test Setting
	 */
	@Before
	public void InitUserController() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(_AdminUserController).build();
		System.out.println("AdminUserController Build");
	}
	
	//TODO find how to test code 
	@Test
	public void TestGetAdminRootPage(){
		System.out.println("\r\n1. Admin Main Page Test Start");
		try {
			//this.mockMvc.perform(get("/admin/")).andExpect(status().isTemporaryRedirect());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("\r\n\r\nGet Admin Main Page Error :" + e.getStackTrace());
		}
		System.out.println("Admin Main Page Test End \r\n");
	}
	
	/**
	 * Login Page Test 
	 * @throws Exception
	 */
	@Test
	public void TestGetAdminLogInPage() {
		System.out.println("\r\n2. Admin Login Page Test Start");
		try {			
			this.mockMvc.perform(get("/admin/Users/Login")).andExpect(status().isOk());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("\r\n\r\nGet Admin Login Page Error :" + e.getStackTrace());
		}
		System.out.println("Admin Login Page Test End \r\n");
	}
	
	@After
	public void FinshUserController() {
		System.out.println("\r\n\r\nAdminUserController Test End \r\n\r\n");
	}
}
