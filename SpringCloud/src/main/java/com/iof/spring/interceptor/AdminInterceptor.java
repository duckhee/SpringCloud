package com.iof.spring.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * Admin Login Handling Interceptor
 * Check Login and permission
 * @author duckheewon
 *
 */
public class AdminInterceptor extends HandlerInterceptorAdapter{

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		/** Get Base Content Path */
		String _Base = request.getContextPath()+"";
		if(session == null) {
			System.out.println("Not Have Session");
			/** Redirect Send Login Page */
			response.sendRedirect(_Base + "/admin/Users/Login");
			
			return false;
		}
		/** Get Login Value Session get Map */
		@SuppressWarnings("unchecked")
		Map<String, Object> _LoginSession = (Map<String, Object>)session.getAttribute("user");
		if(_LoginSession == null) {
			System.out.println("Not Login User");
			response.sendRedirect(_Base + "/admin/Users/Login");
			return false;
		}
		
		System.out.println("Get Interceptor : " + _LoginSession);
		if((int)_LoginSession.get("UserLevel") >= 5) {
			System.out.println("Not Have permission");
		}
		return super.preHandle(request, response, handler);
	}
	
	
}
