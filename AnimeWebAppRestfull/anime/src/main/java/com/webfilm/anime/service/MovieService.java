package com.webfilm.anime.service;

import java.util.List;

import com.webfilm.anime.dto.MovieDto;
import com.webfilm.anime.entity.Movie;

public interface MovieService {

	public List<Movie> moviesTrend();
	public List<Movie> moviesPopular();
	public List<Movie> moviesRecently();
	public List<Movie> moviesLive();
	public List<Object[]> moviesOrderByView();
	public List<Movie> listMovie();
}
