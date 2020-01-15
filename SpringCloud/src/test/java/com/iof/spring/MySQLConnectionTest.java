package com.iof.spring;

import java.sql.Connection;

import javax.sql.DataSource;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MySQLConnectionTest {
	
	@Inject
	private DataSource database;
	
	@Test
	public void testConnection() throws Exception{
		try {
			/** Get Connection */
			Connection con = database.getConnection();
			System.out.println("\nMysql Connection Test Get Connection : " + con + "\r\n");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
