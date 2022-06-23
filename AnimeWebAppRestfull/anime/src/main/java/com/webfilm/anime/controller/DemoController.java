package com.webfilm.anime.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.webfilm.anime.service.CountryService;
import com.webfilm.anime.service.GenresService;
import com.webfilm.anime.service.MenuService;
import com.webfilm.anime.service.MovieService;
import com.webfilm.anime.service.SeasonService;
import com.webfilm.anime.service.SeriesService;
import com.webfilm.anime.service.SlideService;

@Controller
public class DemoController {

	@Autowired
	private MenuService menuService;
	@Autowired
	private GenresService genresService;
	@Autowired
	private SeasonService seasonService;
	@Autowired
	private SeriesService seriesService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private SlideService slideService;
	@Autowired
	private MovieService movieService;
	
	@GetMapping({"/home","/trang-chu"})
	public String home(Model model) {
		model.addAttribute("list", menuService.listMenus());
		model.addAttribute("listGen", genresService.listGenres());
		model.addAttribute("listSea", seasonService.listSeason());
		model.addAttribute("listSer", seriesService.listSeries());
		model.addAttribute("listCoun", countryService.listCountry());
		model.addAttribute("listSlide", slideService.listSlide());
		model.addAttribute("listTrend", movieService.moviesTrend());
		model.addAttribute("listPopular", movieService.moviesPopular());
		model.addAttribute("listRecently", movieService.moviesRecently());
		model.addAttribute("listLive", movieService.moviesLive());
		model.addAttribute("listView", movieService.moviesOrderByView());
		return "customer/index";
	}
}
