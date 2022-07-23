package com.webfilm.anime.controller;

import java.io.IOException;
import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webfilm.anime.entity.Users;
import com.webfilm.anime.service.CountryService;
import com.webfilm.anime.service.GenresService;
import com.webfilm.anime.service.MenuService;
import com.webfilm.anime.service.SeasonService;
import com.webfilm.anime.service.SeriesService;
import com.webfilm.anime.service.UserService;

@Controller
public class LoginController extends BaseController {

	@Autowired
	private UserService userService;

	@RequestMapping({ "/login", "/admin" })
	public ModelAndView showformlogin(HttpServletResponse response, HttpServletRequest request) throws IOException {
		HttpSession session = request.getSession();
		Users username = (Users) session.getAttribute("acc");
		if (username != null) {
			response.sendRedirect("/");
		} else {
			modelAndView.setViewName("customer/login");
		}
		return modelAndView;
	}

	@GetMapping("/signup")
	public ModelAndView register(Model model, @ModelAttribute("user") Users theUsers, HttpServletResponse response,
			HttpServletRequest request) throws IOException {
		HttpSession session = request.getSession();
		Users username = (Users) session.getAttribute("acc");
		if (username != null) {
			response.sendRedirect("/");
		} else {
			model.addAttribute("user", theUsers);
			modelAndView.setViewName("customer/signup");
		}
		return modelAndView;
	}

	@PostMapping("/register")
	public ModelAndView register(@ModelAttribute("user") Users theUsers, HttpServletRequest request) {
		String errMsg = "";
		HttpSession session = request.getSession();
		String confirm = request.getParameter("confimlpassword");
		if (theUsers.getPassword().equals(confirm)) {
			try {
				userService.addNewUser(theUsers);
				session.setAttribute("acc", theUsers);
				modelAndView.setViewName("customer/login");
			} catch (Exception e) {
				errMsg = "Da xay ra loi";
			}
		} else {
			errMsg = "Mat khau khong khop";
		}
		request.setAttribute("errMsg", errMsg);
		return modelAndView;
	}
}
