package com.webfilm.anime.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.webfilm.anime.entity.Genres;

public interface GenresDao extends JpaRepositoryImplementation<Genres, UUID>{

}
