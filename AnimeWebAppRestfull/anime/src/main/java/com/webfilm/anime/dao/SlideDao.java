package com.webfilm.anime.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.webfilm.anime.entity.Slides;
public interface SlideDao extends JpaRepositoryImplementation<Slides, UUID>{

}
