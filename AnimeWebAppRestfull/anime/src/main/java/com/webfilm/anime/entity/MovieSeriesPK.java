package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
@Embeddable
public class MovieSeriesPK implements Serializable{

	private String movie;
	private String series;
	
	public MovieSeriesPK() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(movie, series);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieSeriesPK other = (MovieSeriesPK) obj;
		return Objects.equals(movie, other.movie) && Objects.equals(series, other.series);
	}

	
	
	
}
