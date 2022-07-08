package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.MovieGenresDao;
import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieGenres;

@Service
public class MovieGenresServiceImpl implements MovieGenresService{

	@Autowired
	private MovieGenresDao movieGenresDao;
	@Override
	public List<MovieGenres> listGenresByMovieId(String movieId) {
		// TODO Auto-generated method stub
		return movieGenresDao.listGenresByMovie(movieId);
	}
	@Override
	public List<Object[]> listMovieByNameGen(String name) {
		// TODO Auto-generated method stub
		return movieGenresDao.listMovieByNameGen(name);
	}
	
	

}
