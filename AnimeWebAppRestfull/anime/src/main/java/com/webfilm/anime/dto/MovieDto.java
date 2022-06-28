package com.webfilm.anime.dto;

import com.webfilm.anime.entity.Genres;
import com.webfilm.anime.entity.MovieEpisode;
import com.webfilm.anime.entity.MovieGenres;

public class MovieDto {

	private String movie_id;
	private String name;
	private String poster_path;
	private String views;
	private int sum;
	private String gen;
	public String getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
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
	public String getViews() {
		return views;
	}
	public void setViews(String views) {
		this.views = views;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public MovieDto(String movie_id, String name, String poster_path, String views, int sum, String gen) {
		super();
		this.movie_id = movie_id;
		this.name = name;
		this.poster_path = poster_path;
		this.views = views;
		this.sum = sum;
		this.gen = gen;
	}
	public MovieDto() {
		super();
	}
	@Override
	public String toString() {
		return "MovieDto [movie_id=" + movie_id + ", name=" + name + ", poster_path=" + poster_path + ", views=" + views
				+ ", sum=" + sum + ", gen=" + gen + "]";
	}
	
	
}
