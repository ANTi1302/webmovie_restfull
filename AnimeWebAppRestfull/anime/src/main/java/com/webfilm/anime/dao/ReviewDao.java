package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.Review;

public interface ReviewDao extends JpaRepositoryImplementation<Review, Integer>{

}
