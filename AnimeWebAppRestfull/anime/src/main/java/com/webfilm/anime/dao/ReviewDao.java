package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieGenres;
import com.webfilm.anime.entity.Review;

public interface ReviewDao extends JpaRepositoryImplementation<Review, String>{

	@Query(value = "select * from  review where [movie_id]=:movieId\r\n"
			+ "",nativeQuery = true)
	public List<Review> listReviewByMovie(@Param("movieId") String movieId);
}
