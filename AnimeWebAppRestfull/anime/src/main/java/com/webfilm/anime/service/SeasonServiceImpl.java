package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.SeasonDao;
import com.webfilm.anime.entity.Season;

@Service
public class SeasonServiceImpl implements SeasonService {

	@Autowired
	private SeasonDao seasonDao;
	@Override
	public List<Season> listSeason() {
		// TODO Auto-generated method stub
		return seasonDao.findAll();
	}

}
