package com.webfilm.anime.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webfilm.anime.dto.MovieDto;
import com.webfilm.anime.entity.Country;
import com.webfilm.anime.entity.Genres;
import com.webfilm.anime.entity.Menu;
import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieGenres;
import com.webfilm.anime.entity.Season;
import com.webfilm.anime.entity.Series;
import com.webfilm.anime.entity.Slides;
import com.webfilm.anime.service.CountryService;
import com.webfilm.anime.service.GenresService;
import com.webfilm.anime.service.MenuService;
import com.webfilm.anime.service.MovieGenresService;
import com.webfilm.anime.service.MovieService;
import com.webfilm.anime.service.SeasonService;
import com.webfilm.anime.service.SeriesService;
import com.webfilm.anime.service.SlideService;
@RestController
public class HomeRestController {

	@Autowired
	private ModelMapper modelMapper;
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
	@Autowired
	private MovieGenresService movieGenresService;
	
	@GetMapping("/list")
	public List<Menu> findAllMenu() {
		return menuService.listMenus();
	}
	@GetMapping("/listGen")
	public List<Genres> findAllGenres() {
		return genresService.listGenres();
	}
	@GetMapping("/listSea")
	public List<Season> findAllSeason() {
		return seasonService.listSeason();
	}
	@GetMapping("/listSer")
	public List<String> findAllSeries() {
		return seriesService.listSeries();
	}
	@GetMapping("/listCoun")
	public List<Country> findAllCountry() {
		return countryService.listCountry();
	}
	@GetMapping("/listSlide")
	public List<Slides> findAllSlide() {
		return slideService.listSlide();
	}
	@GetMapping("/listMvTrend")
	public List<Movie> findMovieTrend() {
//		return movieService.moviesTrend().stream().map(post -> modelMapper.map(post, MovieDto.class))
//				.collect(Collectors.toList());
		return movieService.moviesTrend();
	}
	@GetMapping("/listMvPopular")
	public List<Object[]> findMoviePopular() {
		return movieService.moviesPopular();
	}
	@GetMapping("/listMvRecently")
	public List<Object[]> findMovieRecently() {
		return movieService.moviesRecently();
	}
	@GetMapping("/listMvLive")
	public List<Object[]> findMovieLive() {
		return movieService.moviesLive();
	}
	@GetMapping("/listMvOrderByView")
	public List<Object[]> findMovieOrderByView() {
		return movieService.moviesOrderByView();
	}
//	@PostMapping("/list/{movieId}")
//	public List<MovieGenres> listGenByMovieId(@PathVariable String movieId) {
//		List<MovieGenres> theName=movieGenresService.listGenresByMovieId(movieId);
//		if (theName==null) {
//			throw new RuntimeException("Product id not found - "+movieId);
//		}
//		return theName;
//	}
	@GetMapping("/listMovie")
	public List<Movie> list() {
		return movieService.listMovie();
	}
}
