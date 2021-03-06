package com.webfilm.anime.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.CountryDao;
import com.webfilm.anime.dao.MovieEpisodeDao;
import com.webfilm.anime.entity.Country;
import com.webfilm.anime.entity.MovieEpisode;
@Service
public class MovieEpisodeServiceImpl implements MovieEpisodeService{

	@Autowired
	private MovieEpisodeDao movieEpisodeDao;

	@Override
	public List<MovieEpisode> movieByEps(UUID movieId,int eps) {
		// TODO Auto-generated method stub
		return movieEpisodeDao.listMovieByEps(movieId, eps);
	}

	@Override
	public List<MovieEpisode> movieEps(UUID movieId) {
		// TODO Auto-generated method stub
		return movieEpisodeDao.listEps(movieId);
	}

}
