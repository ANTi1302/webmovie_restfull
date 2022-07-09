package com.webfilm.anime.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.webfilm.anime.entity.Blogs;
import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieCompany;
import com.webfilm.anime.entity.MovieEpisode;
import com.webfilm.anime.entity.MovieGenres;
import com.webfilm.anime.entity.Review;
import com.webfilm.anime.service.BlogService;
import com.webfilm.anime.service.CountryService;
import com.webfilm.anime.service.GenresService;
import com.webfilm.anime.service.MenuService;
import com.webfilm.anime.service.MovieCompanyService;
import com.webfilm.anime.service.MovieEpisodeService;
import com.webfilm.anime.service.MovieGenresService;
import com.webfilm.anime.service.MovieService;
import com.webfilm.anime.service.MovieTrendService;
import com.webfilm.anime.service.ReviewService;
import com.webfilm.anime.service.SeasonService;
import com.webfilm.anime.service.SeriesService;
import com.webfilm.anime.service.SlideService;

@Controller
public class DemoController extends BaseController {
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
	@Autowired
	private MovieCompanyService movieCompanyService;
	@Autowired
	private MovieEpisodeService movieEpisodeService;
	@Autowired
	private BlogService blogService;
	
	@GetMapping({ "/home", "/trang-chu" })
	public ModelAndView home(Model model) {
		model.addAttribute("listSlide", slideService.listSlide());
		model.addAttribute("listTrend", movieService.moviesTrend());
		model.addAttribute("listPopular", movieService.moviesPopular());
		model.addAttribute("listRecently", movieService.moviesRecently());
		model.addAttribute("listLive", movieService.moviesLive());
		model.addAttribute("listView", movieService.moviesOrderByView());
		model.addAttribute("listReview", movieService.listMovieOrderByReview());
		modelAndView.setViewName("customer/index");
		return modelAndView;
	}

	@GetMapping({ "/trend", "/popular", "recently", "live", "movie" })
	public ModelAndView category(Model model,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size,
			HttpServletRequest request,
			@RequestParam(name = "sort", required = false, defaultValue = "ASC") String sort) {
		Sort sortable = null;
		if (sort.equals("ASC")) {
			sortable = Sort.by("name").ascending();
		}
		if (sort.equals("DESC")) {
			sortable = Sort.by("name").descending();
		}
		Pageable pageable = PageRequest.of(page - 1, size, sortable);

		if (request.getRequestURI().equals("/trend")) {
			model.addAttribute("listTrend", movieTrendService.listMVTrend(pageable));
			int totalPages = movieTrendService.listMVTrend(pageable).getTotalPages();
			if (totalPages > 0) {
				List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
				model.addAttribute("pageNumbers", pageNumbers);
			}
		} else if (request.getRequestURI().equals("/popular")) {
			model.addAttribute("listTrend", movieTrendService.listMVPopular(pageable));
			int totalPages = movieTrendService.listMVPopular(pageable).getTotalPages();
			if (totalPages > 0) {
				List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
				model.addAttribute("pageNumbers", pageNumbers);
			}
		} else if (request.getRequestURI().equals("/recently")) {
			model.addAttribute("listTrend", movieTrendService.listMVRecently(pageable));
			int totalPages = movieTrendService.listMVRecently(pageable).getTotalPages();
			if (totalPages > 0) {
				List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
				model.addAttribute("pageNumbers", pageNumbers);
			}
		} else if (request.getRequestURI().equals("/live")) {
			model.addAttribute("listTrend", movieTrendService.listMVLive(pageable));
			int totalPages = movieTrendService.listMVLive(pageable).getTotalPages();
			if (totalPages > 0) {
				List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
				model.addAttribute("pageNumbers", pageNumbers);
			}
		} else if (request.getRequestURI().equals("/movie")) {
			Page<Movie> bookPage = movieTrendService.listMV(pageable);
			model.addAttribute("listTrend", bookPage);
			int totalPages = bookPage.getTotalPages();
			if (totalPages > 0) {
				List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
				model.addAttribute("pageNumbers", pageNumbers);
			}
		}
		model.addAttribute("request", request.getRequestURI());
		model.addAttribute("listView", movieService.moviesOrderByView());
		model.addAttribute("listReview", movieService.listMovieOrderByReview());
		modelAndView.setViewName("customer/categories");
		return modelAndView;
	}
	@GetMapping("/moviebyid/{movieId}")
	public ModelAndView showSPbyID(Model theModel,@PathVariable("movieId") String movieId) {
		Movie movie=movieService.movieById(movieId);
		List<MovieCompany> movieCompanies= movieCompanyService.companyById(movieId);
		List<MovieGenres> movieGenres=movieGenresService.listGenresByMovieId(movieId);
		List<Review> reviews=reviewService.listByMovieId(movieId);
		movie.setMovieCompanies(movieCompanies);
		movie.setMovieGenres(movieGenres);
		movie.setReviews(reviews);
		theModel.addAttribute("movie", movie);
		for (MovieGenres review : movieGenres) {
			theModel.addAttribute("moviemighr", movieGenresService.listMovieByNameGen(review.getGenres().getName()));
		}
//		id=movieId;
		modelAndView.setViewName("customer/anime-details");
		return modelAndView;
	}
	@GetMapping("/moviegenres/{genId}")
	public ModelAndView moviegen(Model theModel,@PathVariable("genId") String genId,HttpServletRequest request,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		theModel.addAttribute("listTrend", movieService.listMoveByGenId(genId, pageable));
		theModel.addAttribute("listView", movieService.moviesOrderByView());
		theModel.addAttribute("listReview", movieService.listMovieOrderByReview());
		int totalPages =  movieService.listMoveByGenId(genId, pageable).getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			theModel.addAttribute("pageNumbers", pageNumbers);
		}
		theModel.addAttribute("request", request.getRequestURI());
		modelAndView.setViewName("customer/categories");
		return modelAndView;
	}
	@GetMapping("/movieser/{serId}")
	public ModelAndView movieser(Model theModel,@PathVariable("serId") String genId,HttpServletRequest request,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		theModel.addAttribute("listTrend", movieService.listMoveBySerId(genId, pageable));
		theModel.addAttribute("listView", movieService.moviesOrderByView());
		theModel.addAttribute("listReview", movieService.listMovieOrderByReview());
		int totalPages =  movieService.listMoveBySerId(genId, pageable).getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			theModel.addAttribute("pageNumbers", pageNumbers);
		}
		theModel.addAttribute("request", request.getRequestURI());
		modelAndView.setViewName("customer/categories");
		return modelAndView;
	}
	@GetMapping({ "/watch/{movieId}&{eps}"})
	public ModelAndView watch(Model model,@PathVariable("movieId") String movieId,@PathVariable("eps") int eps) {
		Movie movie=movieService.movieById(movieId);
		model.addAttribute("movie", movie);
		List<MovieEpisode> episode=movieEpisodeService.movieByEps(movieId, eps);
		movie.setMovieEpisodes(episode);
		modelAndView.setViewName("customer/anime-watching");
		model.addAttribute("eps", movieEpisodeService.movieEps(movieId));
		model.addAttribute("numeps", eps);
		return modelAndView;
	}
	@GetMapping({ "/blog"})
	public ModelAndView blog(Model model,@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "6") Integer size) {
		Pageable pageable = PageRequest.of(0, size);
		Page<Blogs> bookPage = blogService.listBlog(pageable);
		Pageable pageable2 = PageRequest.of(1, size);
		Page<Blogs> bookPage2 = blogService.listBlog(pageable2);
		model.addAttribute("blog", bookPage);
		model.addAttribute("blog2", bookPage2);
		modelAndView.setViewName("customer/blog");
		return modelAndView;
	}
	@GetMapping({ "/blogdetails/{blogId}"})
	public ModelAndView blogdetail(Model model,@PathVariable("blogId") String blogId) {
		Blogs blogs=blogService.blogById(blogId);
		model.addAttribute("blog", blogs);
		List<Review> comment=reviewService.listComment();
		List<Review> reply=null;
		for (Review review : comment) {
			reply=(reviewService.listReviewAndReplies(review.getReviewId()));
		}
		model.addAttribute("rep", reply);
		blogs.setReviews(comment);
		modelAndView.setViewName("customer/blog-details");
		return modelAndView;
	}
}
