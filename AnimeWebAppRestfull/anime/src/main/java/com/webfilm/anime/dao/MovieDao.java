package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.Movie;

public interface MovieDao extends JpaRepositoryImplementation<Movie, Integer>{

	@Query(value = "select movie.movie_id,movie.name,movie.poster_path,movie.views,count( series.number_season) FROM     series  INNER JOIN\r\n"
			+ "                  movie_series ON series.series_id = movie_series.series_id INNER JOIN\r\n"
			+ "                  movie ON movie_series.movie_id = movie.movie_id\r\n"
			+ "where trending=1\r\n"
			+ "group by movie.movie_id,movie.name,movie.poster_path,movie.views",nativeQuery = true)
	public List<Object[]> listMovieTrend();
	
}
