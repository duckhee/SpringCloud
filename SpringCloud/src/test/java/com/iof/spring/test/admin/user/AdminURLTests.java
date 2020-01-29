package com.iof.spring.test.admin.user;


import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
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
@ContextConfiguration(locations= { "file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.JVM)
public class AdminURLTests {
	
	/** 
	 *  AdminUserController Test
	 */
	@Autowired
	private AdminUserController controller;
	private MockMvc mockMvc;
	
	/**
	 * Test Setting 
	 */
	@Before
	public void SetUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		System.out.println("Setting");
	}
	
	/**
	 * Admin Main Page Test 
	 * Redirect Login Page
	 * @throws Exception
	 */
	@Test
	public void UserMainTest() throws Exception{
		System.out.println("Testing Main");
		this.mockMvc.perform(get("/admin/Users"))
		.andExpect(status().is3xxRedirection())
		.andDo(print());
	}
	
	@Test
	public void UserLoginTest() throws Exception
	{
		System.out.println("Testing Login");
		this.mockMvc.perform(get("/admin/Users/Login"))
		.andExpect(status().isOk())
		.andDo(print());
		
	}
	
	@Test
	public void UserLoginDoTest() throws Exception{
		System.out.println("Testing Login Do");
		this.mockMvc.perform(post("/admin/Users")
				.param("UserEmail", "admin@co.kr")
				.param("UserPassword", "admin")
				.with(csrf()))
		.andExpect(status().isFound())
		.andDo(print());
		
	}
	
}
