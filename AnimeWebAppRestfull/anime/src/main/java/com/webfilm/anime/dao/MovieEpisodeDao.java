package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.Country;
import com.webfilm.anime.entity.MovieCompany;
import com.webfilm.anime.entity.MovieEpisode;
import com.webfilm.anime.entity.MovieEpisodePK;

public interface MovieEpisodeDao extends JpaRepositoryImplementation<MovieEpisode, MovieEpisodePK>{
	@Query(value = "select*from movie_episode INNER JOIN\r\n"
			+ " episode ON movie_episode.episode = episode.episode_id where movie_episode.movie_id=:movieId and episode.number_season=:eps",nativeQuery = true)
public List<MovieEpisode> listMovieByEps(@Param(value ="movieId") String movieId, @Param(value = "eps")int eps);
	@Query(value = "select*from movie_episode INNER JOIN\r\n"
			+ " episode ON movie_episode.episode = episode.episode_id where movie_episode.movie_id=:movieId",nativeQuery = true)
public List<MovieEpisode> listEps(@Param(value ="movieId") String movieId);
	
}
