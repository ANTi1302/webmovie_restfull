package com.webfilm.anime.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.ReviewDao;
import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.Review;
@Service
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	private ReviewDao reviewDao;

	@Override
	public List<Review> listByMovieId(UUID movieId) {
		// TODO Auto-generated method stub
		return reviewDao.listReviewByMovie(movieId);
	}

	@Override
	public List<Review> listReviewAndReplies(UUID replyId) {
		// TODO Auto-generated method stub
		return reviewDao.listReviewAndReplies(replyId);
	}

	@Override
	public List<Review> listComment(UUID blogId) {
		// TODO Auto-generated method stub
		return reviewDao.listComment(blogId);
	}

	@Override
	public int countReviewByMovie(UUID movieId) {
		// TODO Auto-generated method stub
		return reviewDao.countReviewByMovie(movieId);
	}
	
}
