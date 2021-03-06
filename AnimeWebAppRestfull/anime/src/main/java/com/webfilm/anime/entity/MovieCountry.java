package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "movie_country")
public class MovieCountry implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	@Id
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
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
		MovieCountry other = (MovieCountry) obj;
		return Objects.equals(movie, other.movie);
	}
	public MovieCountry() {
		super();
	}
	public MovieCountry(Movie movie, Country country) {
		super();
		this.movie = movie;
		this.country = country;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "MovieCountry [movie=" + movie + ", country=" + country + "]";
	}
	
}
