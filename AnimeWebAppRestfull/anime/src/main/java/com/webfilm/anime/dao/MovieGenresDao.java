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
	@Query(value = "SELECT movie.movie_id,movie.title, movie.name, movie.overview, movie.runtime, movie.tagline, movie.status, movie.votes_avg, movie.votes_count, movie.type, movie.studios, movie.date_aired, movie.quality, movie.views, movie.scores_avg, \r\n"
			+ "                  movie.scores_count, movie.poster_path, movie.recently, movie.live, movie.popular, movie.trending,count(movie_episode.episode)\r\n"
			+ "FROM     movie INNER JOIN\r\n"
			+ "                  movie_genres ON movie.movie_id = movie_genres.movie_id INNER JOIN\r\n"
			+ "                  genres ON movie_genres.genres_id = genres.genres_id INNER JOIN\r\n"
			+ "                  movie_episode ON movie.movie_id = movie_episode.movie_id"
			+ "				  where movie.name NOT IN (SELECT movie.name FROM movie where movie.name like :namemovie)and genres.name like %:namegen% group by movie.movie_id, movie.title, movie.name, movie.overview, movie.runtime, movie.tagline, movie.status, movie.votes_avg, movie.votes_count, movie.type, movie.studios, movie.date_aired, movie.quality, movie.views, movie.scores_avg, \r\n"
			+ "                  movie.scores_count, movie.poster_path, movie.recently, movie.live, movie.popular, movie.trending",nativeQuery = true)
	public List<Object[]> listMovieByNameGen(@Param("namegen")String name,@Param("namemovie")String nameMovie);

}
