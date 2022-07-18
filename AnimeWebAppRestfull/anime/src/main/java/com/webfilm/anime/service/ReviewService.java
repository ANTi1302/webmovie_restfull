package com.webfilm.anime.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.Review;

public interface ReviewService {

	public List<Review> listByMovieId(String movieId);
	public List<Review> listReviewAndReplies(String replyId);
	public List<Review> listComment(String blogId);
	public int countReviewByMovie(String movieId);
}
