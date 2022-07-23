package com.webfilm.anime.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.webfilm.anime.entity.Users;

public interface UserService extends UserDetailsService{

	List<Users> getUsersByGmail(String email);

}
