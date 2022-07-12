package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class MovieCastPK implements Serializable{

	private String movie;
	private String person;
	public MovieCastPK() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(movie, person);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieCastPK other = (MovieCastPK) obj;
		return Objects.equals(movie, other.movie) && Objects.equals(person, other.person);
	}
	
}
