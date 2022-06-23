package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "movie_episode")
public class MovieEpisode implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	@Id
	@ManyToOne
	@JoinColumn(name = "episode_id")
	private Episode episode;
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Episode getEpisode() {
		return episode;
	}
	public void setEpisode(Episode episode) {
		this.episode = episode;
	}
	
	public MovieEpisode(Movie movie, Episode episode) {
		super();
		this.movie = movie;
		this.episode = episode;
	}
	public MovieEpisode() {
		super();
	}
	@Override
	public String toString() {
		return "MovieEpisode [movie=" + movie + ", episode=" + episode + "]";
	}
	
	
}
