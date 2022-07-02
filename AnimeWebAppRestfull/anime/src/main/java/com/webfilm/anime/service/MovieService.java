package com.webfilm.anime.service;

import java.util.List;

import com.webfilm.anime.dto.MovieDto;
import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieCompany;
import com.webfilm.anime.entity.Review;

public interface MovieService {

	public List<Movie> moviesTrend();
	public List<Movie> moviesPopular();
	public List<Movie> moviesRecently();
	public List<Movie> moviesLive();
	public List<Object[]> moviesOrderByView();
	public List<Movie> listMovie();
	public List<Movie> listMovieOrderByReview();
	public Movie movieById(String id);
	
}
