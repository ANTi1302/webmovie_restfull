package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie_watch")
public class MovieWatch implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "watch_id")
	private Watch watch;
	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	@Override
	public int hashCode() {
		return Objects.hash(movie);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieWatch other = (MovieWatch) obj;
		return Objects.equals(movie, other.movie);
	}
	public Watch getWatch() {
		return watch;
	}
	public void setWatch(Watch watch) {
		this.watch = watch;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public MovieWatch(Watch watch, Movie movie) {
		super();
		this.watch = watch;
		this.movie = movie;
	}
	public MovieWatch() {
		super();
	}
	@Override
	public String toString() {
		return "MovieWatch [watch=" + watch + ", movie=" + movie + "]";
	}
	
}
