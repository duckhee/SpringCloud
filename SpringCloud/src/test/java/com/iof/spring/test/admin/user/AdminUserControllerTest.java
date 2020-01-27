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

/**
 * https://github.com/spring-projects/spring-framework/blob/master/spring-webmvc/src/test/java/org/springframework/web/servlet/mvc/WebContentInterceptorTests.java
 * 참조
 * @author duckheewon
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/spring-security.xml", "file:src/main/webapp/WEB-INF/spring/ws-config.xml"})
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
			this.mockMvc.perform(get("/admin/")).andExpect(status().isTemporaryRedirect());
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
	
	@Test
	public void TestAdminMemberListPage() {
		System.out.println("\r\n3. Admin Member List Test Page Start");
		
		try {
			this.mockMvc.perform(get("/admin/Members/list")).andExpect(status().isTemporaryRedirect());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("\r\n\r\n Admin Member List Page Error : " + e.getStackTrace());
		}
	}
	
	@After
	public void FinshUserController() {
		System.out.println("\r\n\r\nAdminUserController Test End \r\n\r\n");
	}
	
	
}
