package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.SeriesDao;
import com.webfilm.anime.entity.Series;
@Service
public class SeriesServiceImpl implements SeriesService{

	@Autowired
	private SeriesDao seriesDao;
	@Override
	public List<Series> listSeries() {
		// TODO Auto-generated method stub
		return seriesDao.listGroupTitleSeries();
	}

}
