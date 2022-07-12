package com.webfilm.anime.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController extends BaseController{
	@RequestMapping({"/login","/admin/login"})
	public ModelAndView showformlogin(HttpServletResponse response, HttpServletRequest request) {

		modelAndView.setViewName("customer/login");
		return modelAndView;
	}
}