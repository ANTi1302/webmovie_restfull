package com.webfilm.anime.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.webfilm.anime.entity.Movie;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public interface MovieTrendService {

	public  Page<Movie> listMVTrend( Pageable pageable);
	public  Page<Movie> listMVPopular( Pageable pageable);
	public  Page<Movie> listMVRecently( Pageable pageable);
	public  Page<Movie> listMVLive(Pageable pageable);
	public  Page<Movie> listMovie( Pageable pageable);
}
