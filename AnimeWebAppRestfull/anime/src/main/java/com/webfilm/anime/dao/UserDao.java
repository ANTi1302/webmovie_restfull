package com.webfilm.anime.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.Users;

public interface UserDao extends JpaRepository<Users, UUID>{

	@Query(value = "select *from users where email=:email",nativeQuery = true)
	List<Users> getUsersByGmail(@Param(value = "email")String email);

}
