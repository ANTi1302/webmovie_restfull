package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webfilm.anime.dto.MovieDto;
import com.webfilm.anime.entity.Movie;
public interface MovieDao extends JpaRepositoryImplementation<Movie, String>{

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
	@Query(value = "SELECT top 5 movie.movie_id, movie.title, movie.name, movie.overview, movie.runtime, movie.tagline, movie.status, movie.votes_avg, movie.votes_count, movie.type, movie.studios, movie.date_aired, movie.quality, movie.views, movie.scores_avg, \r\n"
			+ "                  movie.scores_count, movie.poster_path, movie.recently, movie.live, movie.popular, movie.trending,COUNT(review_id) as sum\r\n"
			+ "FROM     review INNER JOIN\r\n"
			+ "                  movie ON review.movie_id = movie.movie_id\r\n "
			+ "GROUP BY movie.movie_id, movie.title, movie.name, movie.overview, movie.runtime, movie.tagline, movie.status, movie.votes_avg, movie.votes_count, movie.type, movie.studios, movie.date_aired, movie.quality, movie.views, movie.scores_avg, \r\n"
			+ "                  movie.scores_count, movie.poster_path, movie.recently, movie.live, movie.popular, movie.trending\r\n"
			+ "				  order by MAX(review.created_at) ",nativeQuery = true)
	public List<Movie> listMovieOrderByReview();
	@Query(value = "SELECT movie.*\r\n"
			+ "FROM     movie INNER JOIN\r\n"
			+ "                  movie_genres ON movie.movie_id = movie_genres.movie_id\r\n"
			+ "						 where movie_genres.genres_id=:genId",nativeQuery = true)
	public Page<Movie> listMoveByGenId(@Param(value = "genId")String genId,Pageable pageable);
}
