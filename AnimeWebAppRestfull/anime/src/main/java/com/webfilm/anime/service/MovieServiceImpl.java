package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.MovieDao;
import com.webfilm.anime.dto.MovieDto;
import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.Review;
@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieDao movieDao;
	@Override
	public List<Movie> moviesTrend() {
		// TODO Auto-generated method stub
		return movieDao.listMovieTrend();
	}
	@Override
	public List<Movie> moviesPopular() {
		// TODO Auto-generated method stub
		return movieDao.listMoviePopular();
	}
	@Override
	public List<Movie> moviesRecently() {
		// TODO Auto-generated method stub
		return movieDao.listMovieRecently();
	}
	@Override
	public List<Movie> moviesLive() {
		// TODO Auto-generated method stub
		return movieDao.listMovieLive();
	}
	@Override
	public List<Object[]> moviesOrderByView() {
		// TODO Auto-generated method stub
		return movieDao.listMovieOrderByView();
	}
	@Override
	public List<Movie> listMovie() {
		// TODO Auto-generated method stub
		return movieDao.findAll();
	}
	@Override
	public List<Movie> listMovieOrderByReview() {
		// TODO Auto-generated method stub
		return movieDao.listMovieOrderByReview();
	}

}
