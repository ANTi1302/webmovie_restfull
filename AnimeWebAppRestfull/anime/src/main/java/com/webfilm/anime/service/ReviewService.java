package com.webfilm.anime.service;

import java.util.List;

import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.Review;

public interface ReviewService {

	public List<Review> listByMovieId(String movieId);
}
