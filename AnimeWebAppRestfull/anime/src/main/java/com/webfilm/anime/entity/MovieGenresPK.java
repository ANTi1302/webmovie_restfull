package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
@Embeddable
public class MovieGenresPK implements Serializable{
	private String genres;
	private String movie;
	
	
	public MovieGenresPK() {
		super();
	}


	@Override
	public int hashCode() {
		return Objects.hash(genres, movie);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieGenresPK other = (MovieGenresPK) obj;
		return Objects.equals(genres, other.genres) && Objects.equals(movie, other.movie);
	}


	
}
