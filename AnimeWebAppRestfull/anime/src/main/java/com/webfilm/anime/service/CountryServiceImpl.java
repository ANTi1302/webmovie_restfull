package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.CountryDao;
import com.webfilm.anime.entity.Country;
@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryDao countryDao;
	@Override
	public List<Country> listCountry() {
		// TODO Auto-generated method stub
		return countryDao.findAll();
	}

}
