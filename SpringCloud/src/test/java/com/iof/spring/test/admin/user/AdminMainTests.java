package com.iof.spring.test.admin.user;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.iof.spring.admin.ctrl.IndexController;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= { "file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@WebAppConfiguration
public class AdminMainTests {
	
	@Autowired
	private IndexController controller;
	private MockMvc mockMvc;
	
	@Before
	public void SetUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void UserMainTests() throws Exception{
		RequestBuilder reqeustBuilder = MockMvcRequestBuilders.get("/admin").contentType(MediaType.ALL);
		mockMvc.perform(reqeustBuilder).andDo(print());
				
	}
	
	@Test
	public void UserMainTest() throws Exception{
		this.mockMvc.perform(get("/admin"))
		.andDo(print())
		.andExpect(status().isOk());
	}

}
