package com.webfilm.anime.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.MovieCompanyDao;
import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieCompany;
import com.webfilm.anime.entity.MovieCompanyPK;
@Service
public class MovieCompanyServiceImpl implements MovieCompanyService{

	@Autowired
	private MovieCompanyDao movieCompanyDao;
	@Override
	public List<MovieCompany> companyById(String id) {
		return movieCompanyDao.movieCompaniesByIdMovie(id);
	}

}
