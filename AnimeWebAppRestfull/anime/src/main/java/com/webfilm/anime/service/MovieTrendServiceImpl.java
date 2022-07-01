package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.MovieTrendDao;
import com.webfilm.anime.entity.Movie;
@Service
public class MovieTrendServiceImpl implements MovieTrendService {

	@Autowired
	private MovieTrendDao movieTrendDao;

	@Override
	public  Page<Movie> listMVTrend(Pageable pageable) {
		// TODO Auto-generated method stub
		return movieTrendDao.listMovieTrend(pageable);
	}

	@Override
	public Page<Movie> listMVPopular(Pageable pageable) {
		// TODO Auto-generated method stub
		return movieTrendDao.listMoviePopular(pageable);
	}

	@Override
	public Page<Movie> listMVRecently(Pageable pageable) {
		// TODO Auto-generated method stub
		return movieTrendDao.listMovieRecently(pageable);
	}

	@Override
	public Page<Movie> listMVLive(Pageable pageable) {
		// TODO Auto-generated method stub
		return movieTrendDao.listMovieLive(pageable);
	}

	@Override
	public Page<Movie> listMV(Pageable pageable) {
		// TODO Auto-generated method stub
		return movieTrendDao.listMovie(pageable);
	}

}
