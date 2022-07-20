package com.webfilm.anime.service;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
	public Movie movieById(UUID id);
//	public Movie listMovieByEps(String movieId,int eps);
	public Page<Movie> listMoveByGenId(String genId, Pageable pageable);
	public Page<Movie> listMoveBySerId(String serId,Pageable pageable);
	public Page<Movie> listMoveByConId(String conId,Pageable pageable);
	public Page<Movie> listMoveBySeaId(String seaId,Pageable pageable);
	public Page<Movie> listByName(String name,Pageable pageable);
}
