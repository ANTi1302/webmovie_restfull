package com.webfilm.anime.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.webfilm.anime.entity.Series;

public interface SeriesDao extends JpaRepositoryImplementation<Series, UUID> {

	@Query(value = "select * from Series ",nativeQuery = true)
	public List<Series> listGroupTitleSeries();
	
}
