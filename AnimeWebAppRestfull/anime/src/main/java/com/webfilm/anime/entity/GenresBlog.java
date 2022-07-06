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
@Table(name = "blog_genres")
@IdClass(GenresBlogPK.class)
public class GenresBlog implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "genres_id")
	private Genres genres;
	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "blog_id")
	private Blogs blogs;
	public Genres getGenres() {
		return genres;
	}
	public void setGenres(Genres genres) {
		this.genres = genres;
	}
	public GenresBlog() {
		super();
	}
	@Override
	public String toString() {
		return "GenresBlog [genres=" + genres + "]";
	}
	
}
