package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class GenresBlogPK implements Serializable{

	private String genres;
	private String blogs;
	
	public GenresBlogPK() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(blogs, genres);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenresBlogPK other = (GenresBlogPK) obj;
		return Objects.equals(blogs, other.blogs) && Objects.equals(genres, other.genres);
	}
	
	
}
