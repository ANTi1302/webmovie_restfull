package com.webfilm.anime.service;

import java.util.List;

import com.webfilm.anime.entity.Country;
import com.webfilm.anime.entity.MovieEpisode;

public interface MovieEpisodeService {

	public List<MovieEpisode> movieByEps(String movieId,int eps);
	public List<MovieEpisode> movieEps(String movieId);
}
