package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.GenresDao;
import com.webfilm.anime.entity.Genres;
@Service
public class GenresServiceImpl implements GenresService{

	@Autowired
	private GenresDao genresDao;
	@Override
	public List<Genres> listGenres() {
		// TODO Auto-generated method stub
		return genresDao.findAll();
	}

}
