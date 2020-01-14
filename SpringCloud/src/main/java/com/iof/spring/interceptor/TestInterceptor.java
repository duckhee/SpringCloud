package com.iof.spring.interceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class TestInterceptor extends HandlerInterceptorAdapter{
	/**
	 * Check Login Level 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	throws Exception {
		System.out.println(">>>>>>>>> pre"); 
		HttpSession session = request.getSession();
		/** Session Check */
		/*
		@SuppressWarnings("unchecked")
		Map<String, Object> _LoginSession = (Map<String, Object>) session.getAttribute("user");
		System.out.println("session Get : " + session.getAttribute("user"));
		System.out.println("Login Session Level : " + _LoginSession.get("UserLevel"));
		*/
		return true ; 
	}
	
	@Override
	public void postHandle(	HttpServletRequest request, HttpServletResponse response, Object handler,
							ModelAndView modelAndView) throws Exception {
		System.out.println(">>>>>>>>>> post");
 	}
}
