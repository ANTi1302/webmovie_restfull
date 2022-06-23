package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.SlideDao;
import com.webfilm.anime.entity.Slides;
@Service
public class SlideServiceImpl implements SlideService{

	@Autowired
	private SlideDao slideDao;
	@Override
	public List<Slides> listSlide() {
		// TODO Auto-generated method stub
		return slideDao.findAll();
	}

}
