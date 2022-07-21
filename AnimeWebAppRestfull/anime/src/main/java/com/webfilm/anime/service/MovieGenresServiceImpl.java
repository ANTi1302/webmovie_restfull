package com.webfilm.anime.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.MovieGenresDao;
import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieGenres;

@Service
public class MovieGenresServiceImpl implements MovieGenresService{

	@Autowired
	private MovieGenresDao movieGenresDao;
	@Override
	public List<MovieGenres> listGenresByMovieId(UUID movieId) {
		// TODO Auto-generated method stub
		return movieGenresDao.listGenresByMovie(movieId);
	}
	
	
	

}
