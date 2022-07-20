package com.webfilm.anime.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webfilm.anime.entity.Blogs;

public interface BlogsDao extends JpaRepository<Blogs, UUID>{

}
