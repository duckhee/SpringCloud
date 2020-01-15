package com.iof.spring.test.admin.user;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.iof.spring.admin.user.ctrl.AdminUserController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class AdminUserControllerTest {
	
	/**
	 * Admin User Controller Get
	 */
	@InjectMocks
	private AdminUserController _AdminUserController;
	/** Test Object */
	private MockMvc mockMvc;
	
	/**
	 * Setting MockMvs Test Setting
	 */
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(_AdminUserController).build();
		
	}
	
	/**
	 * Login Page Test 
	 * @throws Exception
	 */
	@Test
	public void testCreateSingupFormInvalidUser() throws Exception{
		System.out.println("\r\n" + get("/admin") + "\r\n");
		this.mockMvc.perform(get("/admin/Users/Login")).andExpect(status().isOk());
	}
}
