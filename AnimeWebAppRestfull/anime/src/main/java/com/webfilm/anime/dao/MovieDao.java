package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.Movie;

public interface MovieDao extends JpaRepositoryImplementation<Movie, Integer>{

	@Query(value = "select top(6) movie.movie_id,movie.name,movie.poster_path,movie.views,count( episode.episode_id) FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  episode ON movie_episode.episode = episode.episode_id\r\n"
			+ "where trending=1\r\n"
			+ "group by movie.movie_id,movie.name,movie.poster_path,movie.views",nativeQuery = true)
	public List<Object[]> listMovieTrend();
	@Query(value = "select top(6) movie.movie_id,movie.name,movie.poster_path,movie.views,count( episode.episode_id) FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  episode ON movie_episode.episode = episode.episode_id\r\n"
			+ "where popular=1\r\n"
			+ "group by movie.movie_id,movie.name,movie.poster_path,movie.views",nativeQuery = true)
	public List<Object[]> listMoviePopular();
	@Query(value = "select top(6) movie.movie_id,movie.name,movie.poster_path,movie.views,count( episode.episode_id) FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  episode ON movie_episode.episode = episode.episode_id\r\n"
			+ "where recently=1\r\n"
			+ "group by movie.movie_id,movie.name,movie.poster_path,movie.views",nativeQuery = true)
	public List<Object[]> listMovieRecently();
	@Query(value = "select top(6) movie.movie_id,movie.name,movie.poster_path,movie.views,count( episode.episode_id) FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  episode ON movie_episode.episode = episode.episode_id\r\n"
			+ "where live=1\r\n"
			+ "group by movie.movie_id,movie.name,movie.poster_path,movie.views",nativeQuery = true)
	public List<Object[]> listMovieLive();
	@Query(value = "select top(5) movie.movie_id,movie.name,movie.poster_path,movie.views,count( episode.episode_id) FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  episode ON movie_episode.episode = episode.episode_id\r\n"
			+ "group by movie.movie_id,movie.name,movie.poster_path,movie.views\r\n"
			+ " order by views desc",nativeQuery = true)
	public List<Object[]> listMovieOrderByView();
	
}
