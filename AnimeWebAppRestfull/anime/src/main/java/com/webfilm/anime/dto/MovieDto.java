package com.webfilm.anime.dto;

import java.util.UUID;

import com.webfilm.anime.entity.Genres;
import com.webfilm.anime.entity.MovieEpisode;
import com.webfilm.anime.entity.MovieGenres;

public class MovieDto {

	private UUID movie_id;
	private String name;
	private String poster_path;
	private double views;
	private int sum;
	private Integer role_age;
	public UUID getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(UUID uuid) {
		this.movie_id = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	public double getViews() {
		return views;
	}
	public void setViews(double views) {
		this.views = views;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public Integer getRole_age() {
		return role_age;
	}
	public void setRole_age(Integer role_age) {
		this.role_age = role_age;
	}
	@Override
	public String toString() {
		return "MovieDto [movie_id=" + movie_id + ", name=" + name + ", poster_path=" + poster_path + ", views=" + views
				+ ", sum=" + sum + ", role_age=" + role_age + "]";
	}
	
	
}
