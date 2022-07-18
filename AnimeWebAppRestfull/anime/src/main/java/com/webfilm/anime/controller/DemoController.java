package com.webfilm.anime.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
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

	@GetMapping({ "/" })
	public ModelAndView home(Model model, HttpServletRequest req, HttpServletResponse resp) {
		model.addAttribute("listSlide", slideService.listSlide());
		model.addAttribute("listTrend", movieService.moviesTrend());
		model.addAttribute("listPopular", movieService.moviesPopular());
		model.addAttribute("listRecently", movieService.moviesRecently());
		model.addAttribute("listLive", movieService.moviesLive());
		model.addAttribute("listView", movieService.moviesOrderByView());
		model.addAttribute("listReview", movieService.listMovieOrderByReview());
		///////
		
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
	public ModelAndView showSPbyID(Model theModel, @PathVariable("movieId") String movieId,HttpServletRequest req) {
		Movie movie = movieService.movieById(movieId);
		List<MovieCompany> movieCompanies = movieCompanyService.companyById(movieId);
		List<MovieGenres> movieGenres = movieGenresService.listGenresByMovieId(movieId);
		List<Review> reviews = reviewService.listByMovieId(movieId);
		movie.setMovieCompanies(movieCompanies);
		movie.setMovieGenres(movieGenres);
		movie.setReviews(reviews);
		theModel.addAttribute("movie", movie);
		for (MovieGenres review : movieGenres) {
			theModel.addAttribute("moviemighr", movieGenresService.listMovieByNameGen(review.getGenres().getName(),movie.getName()));
		}
//		id=movieId;
		//////Cookie
		Cookie arr[] = req.getCookies();
		int eps=1;
		if (arr!=null) {
			for (Cookie o : arr) {
	            if (o.getName().equals(movieId)) {
	            	theModel.addAttribute("eps", o.getValue());
	            }else {
	            	
	            	theModel.addAttribute("eps",eps);
				}
	        }
		}else {
        	theModel.addAttribute("eps",eps);
		}
		modelAndView.setViewName("customer/anime-details");
		return modelAndView;
	}

	@GetMapping("/moviegenres/{genId}")
	public ModelAndView moviegen(Model theModel, @PathVariable("genId") String genId, HttpServletRequest request,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		theModel.addAttribute("listTrend", movieService.listMoveByGenId(genId, pageable));
		theModel.addAttribute("listView", movieService.moviesOrderByView());
		theModel.addAttribute("listReview", movieService.listMovieOrderByReview());
		int totalPages = movieService.listMoveByGenId(genId, pageable).getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			theModel.addAttribute("pageNumbers", pageNumbers);
		}
		theModel.addAttribute("request", request.getRequestURI());
		theModel.addAttribute("id", genId);
		modelAndView.setViewName("customer/categories");
		return modelAndView;
	}

	@GetMapping("/movieser/{serId}")
	public ModelAndView movieser(Model theModel, @PathVariable("serId") String genId, HttpServletRequest request,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		theModel.addAttribute("listTrend", movieService.listMoveBySerId(genId, pageable));
		theModel.addAttribute("listView", movieService.moviesOrderByView());
		theModel.addAttribute("listReview", movieService.listMovieOrderByReview());
		int totalPages = movieService.listMoveBySerId(genId, pageable).getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			theModel.addAttribute("pageNumbers", pageNumbers);
		}
		theModel.addAttribute("request", request.getRequestURI());
		theModel.addAttribute("id", genId);
		System.out.println(request.getRequestURI());
		modelAndView.setViewName("customer/categories");
		return modelAndView;
	}

	@GetMapping("/moviecon/{conId}")
	public ModelAndView moviecon(Model theModel, @PathVariable("conId") String genId, HttpServletRequest request,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		theModel.addAttribute("listTrend", movieService.listMoveByConId(genId, pageable));
		theModel.addAttribute("listView", movieService.moviesOrderByView());
		theModel.addAttribute("listReview", movieService.listMovieOrderByReview());
		int totalPages = movieService.listMoveByConId(genId, pageable).getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			theModel.addAttribute("pageNumbers", pageNumbers);
		}
		theModel.addAttribute("request", request.getRequestURI());
		theModel.addAttribute("id", genId);
		modelAndView.setViewName("customer/categories");
		return modelAndView;
	}

	@GetMapping("/moviesea/{seaId}")
	public ModelAndView moviesea(Model theModel, @PathVariable("seaId") String genId, HttpServletRequest request,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		theModel.addAttribute("listTrend", movieService.listMoveBySeaId(genId, pageable));
		theModel.addAttribute("listView", movieService.moviesOrderByView());
		theModel.addAttribute("listReview", movieService.listMovieOrderByReview());
		int totalPages = movieService.listMoveBySeaId(genId, pageable).getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			theModel.addAttribute("pageNumbers", pageNumbers);
		}
		theModel.addAttribute("request", request.getRequestURI());
		theModel.addAttribute("id", genId);
		modelAndView.setViewName("customer/categories");
		return modelAndView;
	}

	@GetMapping({ "/watch/{movieId}&{eps}" })
	public ModelAndView watch(Model model, @PathVariable("movieId") String movieId, @PathVariable("eps") int eps,
			HttpServletRequest req, HttpServletResponse resp) {
		Movie movie = movieService.movieById(movieId);
		List<MovieEpisode> episode = movieEpisodeService.movieByEps(movieId, eps);
		movie.setMovieEpisodes(episode);
		model.addAttribute("movie", movie);
		model.addAttribute("eps", movieEpisodeService.movieEps(movieId));
		model.addAttribute("numeps", eps);
		modelAndView.setViewName("customer/anime-watching");
		return modelAndView;
	}

	@GetMapping({ "/blog" })
	public ModelAndView blog(Model model,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
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

	@GetMapping({ "/blogdetails/{blogId}" })
	public ModelAndView blogdetail(Model model, @PathVariable("blogId") String blogId) {
		Blogs blogs = blogService.blogById(blogId);
		model.addAttribute("blog", blogs);
		List<Review> comment = reviewService.listComment(blogId);
		List<Review> reply = null;
		int count = 0;
		for (Review review : comment) {
			reply = (reviewService.listReviewAndReplies(review.getReviewId()));
			count=(reviewService.countReviewByMovie(review.getReviewId()));
		}
		model.addAttribute("count", count);
		model.addAttribute("rep", reply);
		blogs.setReviews(comment);
		modelAndView.setViewName("customer/blog-details");
		return modelAndView;
	}

	@GetMapping("/search/")
	public ModelAndView search(Model theModel, @Param("name") String name, HttpServletRequest request,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "18") Integer size) {
		Pageable pageable = PageRequest.of(page - 1, size);
		String[] tenx = name.split("[,; \\t\\n\\r]+");
		for (String string : tenx) {
			theModel.addAttribute("listTrend", movieService.listByName(string, pageable));
		}
		theModel.addAttribute("listView", movieService.moviesOrderByView());
		theModel.addAttribute("listReview", movieService.listMovieOrderByReview());
		int totalPages = movieService.listByName(name, pageable).getTotalPages();
		if (totalPages > 0) {
			List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
			theModel.addAttribute("pageNumbers", pageNumbers);
		}
		theModel.addAttribute("request", request.getRequestURI());
		theModel.addAttribute("id", name);
		modelAndView.setViewName("customer/categories");
		return modelAndView;
	}

	@GetMapping("/add/{movieId}&{eps}")
	public ModelAndView addCookie(Model model,HttpServletResponse resp, HttpServletRequest req,
			@PathVariable("movieId") String movieId, @PathVariable("eps") int eps) {
		/// Cookie
		
		Cookie page[] = req.getCookies();
		String num_page = "";
		String ep_co = String.valueOf(eps);
		if (page==null) {
			Cookie p = new Cookie(movieId,ep_co);
			p.setMaxAge(60 * 60 * 24);
			p.setPath("/");
			resp.addCookie(p);
		}else {
		for (Cookie o : page) {
			if (o.getName().equals(movieId)) {
				num_page = num_page + o.getValue();
					o.setMaxAge(0);
					resp.addCookie(o);
			}
		}
		if (num_page.isEmpty()) {
			num_page = ep_co;
		} else {
			num_page = ep_co;
		}
		Cookie p = new Cookie(movieId,num_page);
		p.setMaxAge(60 * 60 * 24);
		p.setPath("/");
		resp.addCookie(p);
		}
		/////
		
		///////////
		modelAndView.setViewName("redirect:/watch/{movieId}&{eps}");
		return modelAndView;
	}
}
