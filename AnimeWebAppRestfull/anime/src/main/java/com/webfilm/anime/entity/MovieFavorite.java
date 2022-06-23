package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie_favorite")
public class MovieFavorite implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "favorite_id")
	private Favorite favorite;
	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	public Favorite getFavorite() {
		return favorite;
	}
	public void setFavorite(Favorite favorite) {
		this.favorite = favorite;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public MovieFavorite(Favorite favorite, Movie movie) {
		super();
		this.favorite = favorite;
		this.movie = movie;
	}
	public MovieFavorite() {
		super();
	}
	@Override
	public String toString() {
		return "MovieFavorite [favorite=" + favorite + ", movie=" + movie + "]";
	}
	
}
