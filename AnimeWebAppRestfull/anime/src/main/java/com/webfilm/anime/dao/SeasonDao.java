package com.webfilm.anime.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.webfilm.anime.entity.Season;

public interface SeasonDao extends JpaRepositoryImplementation<Season, UUID>{

}
