package com.webfilm.anime.service;

import java.util.List;

import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieGenres;

public interface MovieGenresService {

	public List<MovieGenres> listGenresByMovieId(String movieId);
}
