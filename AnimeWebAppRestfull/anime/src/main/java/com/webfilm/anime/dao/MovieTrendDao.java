package com.webfilm.anime.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.webfilm.anime.entity.Movie;
@RepositoryRestResource(path = "trending")
public interface MovieTrendDao extends PagingAndSortingRepository<Movie, Integer>{
	@Query(value = "select * from [dbo].[movie] where trending=1",nativeQuery = true)
	public  Page<Movie> listMovieTrend(Pageable pageable);
	@Query(value = "select * from [dbo].[movie] where popular=1",nativeQuery = true)
	public  Page<Movie> listMoviePopular(Pageable pageable);
	@Query(value = "select * from [dbo].[movie] where recently=1",nativeQuery = true)
	public  Page<Movie> listMovieRecently(Pageable pageable);
	@Query(value = "select * from [dbo].[movie] where live=1",nativeQuery = true)
	public  Page<Movie> listMovieLive(Pageable pageable);
	@Query(value = "select * from [dbo].[movie] ",nativeQuery = true)
	public  Page<Movie> listMovie(Pageable pageable);
}
