package com.webfilm.anime.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.webfilm.anime.service.CountryService;
import com.webfilm.anime.service.GenresService;
import com.webfilm.anime.service.MenuService;
import com.webfilm.anime.service.SeasonService;
import com.webfilm.anime.service.SeriesService;

@Controller
public class BaseController {
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
	ModelAndView modelAndView= new ModelAndView();
	@PostConstruct
	public ModelAndView init() {
		modelAndView.addObject("list", menuService.listMenus());
		modelAndView.addObject("listGen", genresService.listGenres());
		modelAndView.addObject("listSea", seasonService.listSeason());
		modelAndView.addObject("listSer", seriesService.listSeries());
		modelAndView.addObject("listCoun", countryService.listCountry());
		return modelAndView;
	}
}
