package com.webfilm.anime.service;

import java.util.List;

import com.webfilm.anime.dto.MovieDto;
import com.webfilm.anime.entity.Movie;

public interface MovieService {

	public List<Movie> moviesTrend();
	public List<Object[]> moviesPopular();
	public List<Object[]> moviesRecently();
	public List<Object[]> moviesLive();
	public List<Object[]> moviesOrderByView();
	public List<Movie> listMovie();
}
