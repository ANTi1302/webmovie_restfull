package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie_series")
@IdClass(MovieSeriesPK.class)
public class MovieSeries implements Serializable{

	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	@Id
	@ManyToOne
	@JoinColumn(name = "series_id")
	private Series series;
//	public Movie getMovie() {
//		return movie;
//	}
//	public void setMovie(Movie movie) {
//		this.movie = movie;
//	}
	
	public Series getSeries() {
		return series;
	}
	public void setSeries(Series series) {
		this.series = series;
	}
	public MovieSeries(Movie movie, Series series) {
		super();
//		this.movie = movie;
		this.series = series;
	}
	public MovieSeries() {
		super();
	}
	@Override
	public String toString() {
		return "MovieSeries [ series=" + series + "]";
	}
	
}
