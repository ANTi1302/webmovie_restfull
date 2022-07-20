package com.webfilm.anime.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.webfilm.anime.entity.Country;

public interface CountryDao extends JpaRepositoryImplementation<Country, UUID>{

	
}
