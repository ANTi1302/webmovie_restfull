package com.webfilm.anime.service;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.Review;

public interface ReviewService {

	public List<Review> listByMovieId(UUID movieId);
	public List<Review> listReviewAndReplies(UUID uuid);
	public List<Review> listComment(UUID blogId);
	public int countReviewByMovie(UUID uuid);
}
