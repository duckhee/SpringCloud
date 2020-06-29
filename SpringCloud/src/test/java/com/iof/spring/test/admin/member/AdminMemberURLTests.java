package com.iof.spring.test.admin.member;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.iof.spring.admin.member.ctrl.AdminMemberController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= { "file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.JVM)
public class AdminMemberURLTests {
	
	@Autowired
	private AdminMemberController controller;
	private MockMvc mockMvc;
	
	@Before
	public void SetUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		System.out.println("Setting");
	}
	
	@Test
	public void MemberMainTest() throws Exception{
		System.out.println("Member Main Page");
		this.mockMvc.perform(get("/admin/Members"))
		.andExpect(status().is3xxRedirection())
		.andDo(print());
	}
	
	@Test
	public void MemberListTest() throws Exception{
		System.out.println("Member List Page");
		this.mockMvc.perform(get("/admin/Members/list"))
		.andExpect(status().isOk())
		.andExpect(model().attributeExists("UserList"))
		.andDo(print());
	}
	
	@Test
	public void MemberCreatePageTests() throws Exception{
		System.out.println("Member Create Page");
		this.mockMvc.perform(get("/admin/Members/Registe"))
		.andExpect(status().isOk())
		.andDo(print());
	}
	
	/**
	 * Email check Test
	 * @throws Exception
	 */
	@Test
	public void MemberEmailCheckTests() throws Exception{
		System.out.println("Member Check Email Post Test");
		this.mockMvc.perform(post("/admin/Members/checkEmail").contentType(MediaType.APPLICATION_JSON).content("{\"Email\":\"admin@co.kr\"}").with(csrf()))
		.andExpect(status().isOk())
		.andDo(print());
		
	}

}
