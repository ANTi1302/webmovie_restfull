package com.webfilm.anime.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.webfilm.anime.entity.Users;
import com.webfilm.anime.service.UserService;


public class LoginSuccessHandler implements AuthenticationSuccessHandler {
	@Autowired
	private UserService userService;
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		Users u= this.userService.getUsersByGmail(authentication.getName()).get(0);
		request.getSession().setAttribute("acc", u);
//		Cookie arr[] = request.getCookies();
//		for (Cookie o : arr) {
//				o.setMaxAge(0);
//				response.addCookie(o);
//		}
		response.sendRedirect("/");
	
	}
}
