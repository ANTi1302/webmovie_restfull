package com.webfilm.anime.dao;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webfilm.anime.dto.MovieDto;
import com.webfilm.anime.entity.Movie;
public interface MovieDao extends JpaRepositoryImplementation<Movie, UUID>{

	@Query(value = "select * from movie where trending= 1 limit 6",nativeQuery = true)
	public List<Movie> listMovieTrend();
	@Query(value = "select * from movie where popular= 1 limit 6",nativeQuery = true)
	public List<Movie> listMoviePopular();
	@Query(value = "select * from movie where recently= 1 limit 6",nativeQuery = true)
	public List<Movie> listMovieRecently();
	@Query(value = "select * from movie where live= 1 limit 6",nativeQuery = true)
	public List<Movie> listMovieLive();
	@Query(value = "select movie.movie_id,movie.name,movie.poster_path,movie.views,count( episode.episode_id) as count_eps,movie.role_age FROM     movie INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id INNER JOIN\r\n"
			+ "                  episode ON movie_episode.episode = episode.episode_id\r\n"
			+ "group by movie.movie_id,movie.name,movie.poster_path,movie.views,movie.role_age\r\n"
			+ " order by views desc limit 5",nativeQuery = true)
	public List<Object[]> listMovieOrderByView();
	@Query(value = "SELECT movie.movie_id, movie.title, movie.name, movie.overview, movie.runtime, movie.tagline, movie.status, movie.votes_avg, movie.votes_count, movie.type, movie.studios, movie.date_aired, movie.quality, movie.views, movie.scores_avg, \r\n"
			+ "                  movie.scores_count, movie.poster_path, movie.recently, movie.live, movie.popular, movie.trending,movie.role_age,COUNT(review_id) as sum\r\n"
			+ "FROM     review INNER JOIN\r\n"
			+ "                  movie ON review.movie_id = movie.movie_id\r\n "
			+ "GROUP BY movie.movie_id, movie.title, movie.name, movie.overview, movie.runtime, movie.tagline, movie.status, movie.votes_avg, movie.votes_count, movie.type, movie.studios, movie.date_aired, movie.quality, movie.views, movie.scores_avg, \r\n"
			+ "                  movie.scores_count, movie.poster_path, movie.recently, movie.live, movie.popular, movie.trending,movie.role_age\r\n"
			+ "				  order by MAX(review.created_at) limit 5",nativeQuery = true)
	public List<Movie> listMovieOrderByReview();
	@Query(value = "SELECT movie.*\r\n"
			+ "FROM     movie INNER JOIN\r\n"
			+ "                  movie_genres ON movie.movie_id = movie_genres.movie_id\r\n"
			+ "						 where movie_genres.genres_id=:genId",nativeQuery = true)
	public Page<Movie> listMoveByGenId(@Param(value = "genId")String genId,Pageable pageable);
	@Query(value = "SELECT movie.*\r\n"
			+ "FROM     movie INNER JOIN\r\n"
			+ "                  movie_series ON movie.movie_id = movie_series.movie_id\r\n"
			+ "				   where [movie_series].series_id=:serId",nativeQuery = true)
	public Page<Movie> listMoveBySerId(@Param(value = "serId")String serId,Pageable pageable);
	@Query(value = "SELECT movie.*\r\n"
			+ "FROM     movie INNER JOIN\r\n"
			+ "                  movie_country ON movie.movie_id = movie_country.movie_id\r\n"
			+ "				  where movie_country.country_id=:conId",nativeQuery = true)
	public Page<Movie> listMoveByConId(@Param(value = "conId")String conId,Pageable pageable);
	@Query(value = "SELECT movie.*\r\n"
			+ "FROM     movie INNER JOIN\r\n"
			+ "                  movie_season ON movie.movie_id = movie_season.movie_id\r\n"
			+ "				  where movie_season.season_id=:seaId",nativeQuery = true)
	public Page<Movie> listMoveBySeaId(@Param(value = "seaId")String seaId,Pageable pageable);
	@Query(value = "select * from movie where movie.name like %:name%",nativeQuery = true)
	public Page<Movie> listByName(@Param(value = "name")String name,Pageable pageable);
}
