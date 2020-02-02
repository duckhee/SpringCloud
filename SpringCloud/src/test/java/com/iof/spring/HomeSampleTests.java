package com.iof.spring;


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


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml", "file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/spring-security.xml", "file:src/main/webapp/WEB-INF/spring/ws-config.xml"})
@WebAppConfiguration
public class HomeSampleTests {
	@Autowired
	private HomeController controller;
	private MockMvc mockMvc;
	
	@Before
	public void SetUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void MainTest() throws Exception{
		RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/").contentType(MediaType.ALL);
        mockMvc.perform(reqBuilder).andExpect(status().isOk()).andDo(print()); 
		
	}
	
	@Test
	public void HomeTests() throws Exception{
		System.out.println("Home Test Model ");
		this.mockMvc.perform(get("/"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(model().attributeExists("serverTime"));
	}
}
