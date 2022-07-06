package com.webfilm.anime.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.webfilm.anime.entity.Blogs;

public interface BlogService {

	public Page<Blogs> listBlog(Pageable pageable);

	public Blogs blogById(String blogId);
}
