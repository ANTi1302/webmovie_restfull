package com.webfilm.anime.service;

import java.util.List;
import java.util.UUID;

import com.webfilm.anime.entity.Country;
import com.webfilm.anime.entity.MovieEpisode;

public interface MovieEpisodeService {

	public List<MovieEpisode> movieByEps(UUID movieId,int eps);
	public List<MovieEpisode> movieEps(UUID movieId);
}
