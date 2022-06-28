package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

import com.webfilm.anime.dto.MovieDto;
import com.webfilm.anime.entity.Movie;

public interface MovieDao extends JpaRepositoryImplementation<Movie, Integer>{

//	@Query(value = "select top(6) movie.movie_id,movie.name,movie.poster_path,movie.views,count( movie_episode.episode) as sum\r\n"
//			+ "FROM     movie INNER JOIN\r\n"
//			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
//			+ "                  movie_genres ON movie.movie_id = movie_genres.movie_id INNER JOIN\r\n"
//			+ "                  genres ON movie_genres.genres_id = genres.genres_id\r\n"
//			+ "		where movie.trending=1\r\n"
//			+ "		group by movie.movie_id,movie.name,movie.poster_path,movie.views",nativeQuery = true)
	@Query(value = "select top 6* from [dbo].[movie] where trending=1",nativeQuery = true)
	public List<Movie> listMovieTrend();
	@Query(value = "select top(6) movie.movie_id,movie.name,movie.poster_path,movie.views,count( movie_episode.episode),genres.name as gen\r\n"
			+ "FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  movie_genres ON movie.movie_id = movie_genres.movie_id INNER JOIN\r\n"
			+ "                  genres ON movie_genres.genres_id = genres.genres_id\r\n"
			+ "		where movie.popular=1\r\n"
			+ "		group by movie.movie_id,movie.name,movie.poster_path,movie.views,genres.name",nativeQuery = true)
	public List<Object[]> listMoviePopular();
	@Query(value = "select top(6) movie.movie_id,movie.name,movie.poster_path,movie.views,count( movie_episode.episode),genres.name as gen\r\n"
			+ "FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  movie_genres ON movie.movie_id = movie_genres.movie_id INNER JOIN\r\n"
			+ "                  genres ON movie_genres.genres_id = genres.genres_id\r\n"
			+ "		where movie.recently=1\r\n"
			+ "		group by movie.movie_id,movie.name,movie.poster_path,movie.views,genres.name",nativeQuery = true)
	public List<Object[]> listMovieRecently();
	@Query(value = "select top(6) movie.movie_id,movie.name,movie.poster_path,movie.views,count( movie_episode.episode),genres.name as gen\r\n"
			+ "FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  movie_genres ON movie.movie_id = movie_genres.movie_id INNER JOIN\r\n"
			+ "                  genres ON movie_genres.genres_id = genres.genres_id\r\n"
			+ "		where movie.live=1\r\n"
			+ "		group by movie.movie_id,movie.name,movie.poster_path,movie.views,genres.name",nativeQuery = true)
	public List<Object[]> listMovieLive();
	@Query(value = "select top(5) movie.movie_id,movie.name,movie.poster_path,movie.views,count( episode.episode_id) FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  episode ON movie_episode.episode = episode.episode_id\r\n"
			+ "group by movie.movie_id,movie.name,movie.poster_path,movie.views\r\n"
			+ " order by views desc",nativeQuery = true)
	public List<Object[]> listMovieOrderByView();
	
}
