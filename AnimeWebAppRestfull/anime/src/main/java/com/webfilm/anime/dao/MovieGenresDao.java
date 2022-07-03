package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieCompany;
import com.webfilm.anime.entity.MovieGenres;
import com.webfilm.anime.entity.MovieGenresPK;

public interface MovieGenresDao extends JpaRepositoryImplementation<MovieGenres, String>{

	@Query(value = "select movie_genres.genres_id,movie_genres.movie_id from  movie_genres where [movie_id]=:movieId group by movie_genres.genres_id,movie_genres.movie_id\r\n"
			+ "",nativeQuery = true)
	public List<MovieGenres> listGenresByMovie(@Param("movieId") String movieId);
}
