package com.webfilm.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.MenusDao;
import com.webfilm.anime.entity.Menu;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private MenusDao menusDao;
	
	@Override
	public List<Menu> listMenus() {
		// TODO Auto-generated method stub
		return menusDao.findAll();
	}

}
