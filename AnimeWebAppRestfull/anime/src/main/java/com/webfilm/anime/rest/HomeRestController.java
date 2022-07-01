package com.webfilm.anime.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webfilm.anime.dto.MovieDto;
import com.webfilm.anime.entity.Country;
import com.webfilm.anime.entity.Genres;
import com.webfilm.anime.entity.Menu;
import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieGenres;
import com.webfilm.anime.entity.Review;
import com.webfilm.anime.entity.Season;
import com.webfilm.anime.entity.Series;
import com.webfilm.anime.entity.Slides;
import com.webfilm.anime.service.CountryService;
import com.webfilm.anime.service.GenresService;
import com.webfilm.anime.service.MenuService;
import com.webfilm.anime.service.MovieGenresService;
import com.webfilm.anime.service.MovieService;
import com.webfilm.anime.service.MovieTrendService;
import com.webfilm.anime.service.ReviewService;
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
	@Autowired
	private ReviewService reviewService;
	@Autowired
	private MovieTrendService movieTrendService;

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
	public List<Movie> findMoviePopular() {
		return movieService.moviesPopular();
	}

	@GetMapping("/listMvRecently")
	public List<Movie> findMovieRecently() {
		return movieService.moviesRecently();
	}

	@GetMapping("/listMvLive")
	public List<Movie> findMovieLive() {
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

	@GetMapping("/listMovieByReview")
	public List<Movie> listMovieByReview() {
		return movieService.listMovieOrderByReview();
	}

	@GetMapping("/listTrend")
	public Page<Movie> listMovieByTrend(@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {

		Pageable pageable = PageRequest.of(page, size);

		return movieTrendService.listMVTrend(pageable);
	}
	@GetMapping("/listPopular")
	public Page<Movie> listPopular(@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {

		Pageable pageable = PageRequest.of(page, size);

		return movieTrendService.listMVPopular(pageable);
	}
	@GetMapping("/listRecently")
	public Page<Movie> listRecently(@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {

		Pageable pageable = PageRequest.of(page, size);

		return movieTrendService.listMVRecently(pageable);
	}
	@GetMapping("/listLive")
	public Page<Movie> listLive(@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {

		Pageable pageable = PageRequest.of(page, size);

		return movieTrendService.listMVLive(pageable);
	}
	@GetMapping("/movie/{movieId}")
	public Movie findMovie(@PathVariable String movieId) {
		Movie movie=movieService.movieById(movieId);
		if (movie==null) {
			throw new RuntimeException("Product id not found - "+movieId);
		}
		return movie;
	}
}
