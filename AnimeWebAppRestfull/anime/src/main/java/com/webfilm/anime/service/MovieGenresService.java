package com.webfilm.anime.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieGenres;

public interface MovieGenresService {

	public List<MovieGenres> listGenresByMovieId(String movieId);
	public List<Object[]> listMovieByNameGen(String name,@Param("namemovie")String nameMovie);

}
