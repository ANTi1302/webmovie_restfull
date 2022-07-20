package com.webfilm.anime.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Service;

import com.webfilm.anime.entity.Menu;

public interface MenusDao extends JpaRepositoryImplementation<Menu, UUID>{

}
