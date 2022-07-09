package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.webfilm.anime.entity.Series;

public interface SeriesDao extends JpaRepositoryImplementation<Series, Integer> {

	@Query(value = "select * from Series ",nativeQuery = true)
	public List<Series> listGroupTitleSeries();
	
}
