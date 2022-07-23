package com.webfilm.anime.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webfilm.anime.entity.Users;
import com.webfilm.anime.service.CountryService;
import com.webfilm.anime.service.GenresService;
import com.webfilm.anime.service.MenuService;
import com.webfilm.anime.service.SeasonService;
import com.webfilm.anime.service.SeriesService;
@Controller
public class LoginController extends BaseController{

	@RequestMapping({"/login","/admin"})
	public ModelAndView showformlogin(HttpServletResponse response, HttpServletRequest request) throws IOException {
		HttpSession session = request.getSession();
		Users username = (Users) session.getAttribute("acc");
		if (username !=null) {
			response.sendRedirect("/");
		}else {
			modelAndView.setViewName("customer/login");
		}
		
		return modelAndView;
	}
}
