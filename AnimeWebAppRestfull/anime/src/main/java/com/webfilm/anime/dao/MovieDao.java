package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

import com.webfilm.anime.dto.MovieDto;
import com.webfilm.anime.entity.Movie;

public interface MovieDao extends JpaRepositoryImplementation<Movie, Integer>{

	@Query(value = "select top 6* from [dbo].[movie] where trending=1",nativeQuery = true)
	public List<Movie> listMovieTrend();
	@Query(value = "select top 6* from [dbo].[movie] where popular=1",nativeQuery = true)
	public List<Movie> listMoviePopular();
	@Query(value = "select top 6 * from [dbo].[movie] where recently=1",nativeQuery = true)
	public List<Movie> listMovieRecently();
	@Query(value = "select top 6 * from [dbo].[movie] where live=1",nativeQuery = true)
	public List<Movie> listMovieLive();
	@Query(value = "select top(5) movie.movie_id,movie.name,movie.poster_path,movie.views,count( episode.episode_id) FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  episode ON movie_episode.episode = episode.episode_id\r\n"
			+ "group by movie.movie_id,movie.name,movie.poster_path,movie.views\r\n"
			+ " order by views desc",nativeQuery = true)
	public List<Object[]> listMovieOrderByView();
	
}
