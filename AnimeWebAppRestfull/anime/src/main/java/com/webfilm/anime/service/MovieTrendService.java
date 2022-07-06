package com.webfilm.anime.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.webfilm.anime.entity.Movie;

public interface MovieTrendService {

	public  Page<Movie> listMVTrend( Pageable pageable);
	public  Page<Movie> listMVPopular( Pageable pageable);
	public  Page<Movie> listMVRecently( Pageable pageable);
	public  Page<Movie> listMVLive(Pageable pageable);
	public  Page<Movie> listMV( Pageable pageable);
}
