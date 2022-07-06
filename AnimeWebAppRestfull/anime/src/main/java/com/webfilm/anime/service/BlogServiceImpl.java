package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.BlogsDao;
import com.webfilm.anime.entity.Blogs;
@Service
public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogsDao blogsDao;
	@Override
	public Page<Blogs> listBlog(Pageable pageable) {
		// TODO Auto-generated method stub
		return blogsDao.findAll(pageable);
	}

}
