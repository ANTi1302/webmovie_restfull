package com.webfilm.anime.service;

import java.util.List;
import java.util.UUID;

import com.webfilm.anime.entity.MovieCompany;
import com.webfilm.anime.entity.MovieCompanyPK;

public interface MovieCompanyService {
	public List<MovieCompany> companyById(UUID id);
}
