package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie_company")
public class MovieCompany implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "company_id")
	private ProductCompany company;
	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	public ProductCompany getCompany() {
		return company;
	}
	public void setCompany(ProductCompany company) {
		this.company = company;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public MovieCompany(ProductCompany company, Movie movie) {
		super();
		this.company = company;
		this.movie = movie;
	}
	public MovieCompany() {
		super();
	}
	@Override
	public String toString() {
		return "MovieCompany [company=" + company + ", movie=" + movie + "]";
	}
	
}
