package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie_keyword")
public class MovieKeyword implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	@Id
	@ManyToOne
	@JoinColumn(name = "keyword_id")
	private Keyword keyword;
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Keyword getKeyword() {
		return keyword;
	}
	public void setKeyword(Keyword keyword) {
		this.keyword = keyword;
	}
	public MovieKeyword(Movie movie, Keyword keyword) {
		super();
		this.movie = movie;
		this.keyword = keyword;
	}
	public MovieKeyword() {
		super();
	}
	@Override
	public String toString() {
		return "MovieKeyword [movie=" + movie + ", keyword=" + keyword + "]";
	}
	
}
