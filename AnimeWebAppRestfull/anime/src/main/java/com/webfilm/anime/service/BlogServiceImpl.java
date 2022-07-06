package com.webfilm.anime.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.BlogsDao;
import com.webfilm.anime.entity.Blogs;
import com.webfilm.anime.entity.Movie;
@Service
public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogsDao blogsDao;
	@Override
	public Page<Blogs> listBlog(Pageable pageable) {
		// TODO Auto-generated method stub
		return blogsDao.findAll(pageable);
	}
	@Override
	public Blogs blogById(String blogId) {
		// TODO Auto-generated method stub
		Optional<Blogs> result=blogsDao.findById(blogId);
		Blogs blogs=null;
		if (result.isPresent()) {
			blogs=result.get();
		}else {
			throw new RuntimeException("Did not find product id - "+blogId);
		}
		return blogs;
	}

}
