package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.MovieCompany;
import com.webfilm.anime.entity.MovieCompanyPK;

public interface MovieCompanyDao extends JpaRepository<MovieCompany, MovieCompanyPK>{

	@Query(value = "select *from [dbo].[movie_company] where movie_company.movie_id=:movieId",nativeQuery = true)
	public List<MovieCompany> movieCompaniesByIdMovie(@Param(value = "movieId") String id);
}
