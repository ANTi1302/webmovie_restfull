package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@IdClass(MovieGenresPK.class)
@Table(name = "movie_genres")
public class MovieGenres implements Serializable{

	@EmbeddedId
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
//		this.movie = movie;
		this.genres = genres;
	}
	public Genres getGenres() {
		return genres;
	}
	public void setGenres(Genres genres) {
		this.genres = genres;
	}
	@Override
	public String toString() {
		return "MovieGenres [genres=" + genres + "]";
	}
	
}
