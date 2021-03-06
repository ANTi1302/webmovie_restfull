package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "movie_season")
public class MovieSeason implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name = "season_id")
	private Season season;
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
		MovieSeason other = (MovieSeason) obj;
		return Objects.equals(movie, other.movie);
	}
	public MovieSeason() {
		super();
	}
	public MovieSeason(Season season, Movie movie) {
		super();
		this.season = season;
		this.movie = movie;
	}
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "MovieSeason [season=" + season + ", movie=" + movie + "]";
	}
	
}
