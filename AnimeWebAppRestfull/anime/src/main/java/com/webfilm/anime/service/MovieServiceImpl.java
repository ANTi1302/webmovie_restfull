package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.MovieDao;
import com.webfilm.anime.entity.Movie;
@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieDao movieDao;
	@Override
	public List<Object[]> movies() {
		// TODO Auto-generated method stub
		return movieDao.listMovieTrend();
	}

}
