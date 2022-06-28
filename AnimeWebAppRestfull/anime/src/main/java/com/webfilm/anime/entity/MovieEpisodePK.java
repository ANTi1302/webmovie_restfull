package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
@Embeddable
public class MovieEpisodePK implements Serializable{

	private String movie;
	private String episode;
	
	public MovieEpisodePK() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(episode, movie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieEpisodePK other = (MovieEpisodePK) obj;
		return Objects.equals(episode, other.episode) && Objects.equals(movie, other.movie);
	}

}
