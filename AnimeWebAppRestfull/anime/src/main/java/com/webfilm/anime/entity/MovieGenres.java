package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie_genres")
public class MovieGenres implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	@Id
	@ManyToOne
	@JoinColumn(name = "genres_id")
	private Genres genres;
	
	public MovieGenres() {
		super();
	}
	public MovieGenres(Movie movie, Genres genres) {
		super();
		this.movie = movie;
		this.genres = genres;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Genres getGenres() {
		return genres;
	}
	public void setGenres(Genres genres) {
		this.genres = genres;
	}
	@Override
	public String toString() {
		return "MovieGenres [movie=" + movie + ", genres=" + genres + "]";
	}
	
}
