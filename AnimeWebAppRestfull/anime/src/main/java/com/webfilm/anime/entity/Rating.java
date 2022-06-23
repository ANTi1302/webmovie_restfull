package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "rating")
public class Rating implements Serializable{
	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "rating_id")
	private String ratingId;
	@Column(name = "count_start")
	private int countStart;
	@Column(name = "num_rating")
	private int numRating;
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	public Rating() {
		super();
	}
	public String getRatingId() {
		return ratingId;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public int getCountStart() {
		return countStart;
	}
	public void setCountStart(int countStart) {
		this.countStart = countStart;
	}
	public int getNumRating() {
		return numRating;
	}
	public void setNumRating(int numRating) {
		this.numRating = numRating;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Rating(String ratingId, int countStart, int numRating, Movie movie) {
		super();
		this.ratingId = ratingId;
		this.countStart = countStart;
		this.numRating = numRating;
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", countStart=" + countStart + ", numRating=" + numRating + ", movie="
				+ movie + "]";
	}
	
}
