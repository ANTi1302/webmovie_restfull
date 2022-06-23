package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "genres")
public class Genres implements Serializable{
	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "genres_id", columnDefinition = "uniqueidentifier")
	private String genresId;
	@Column(columnDefinition = "nvarchar(1000)")
	private String name;
	public String getGenresId() {
		return genresId;
	}
	public void setGenresId(String genresId) {
		this.genresId = genresId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Genres(String genresId, String name) {
		super();
		this.genresId = genresId;
		this.name = name;
	}
	public Genres() {
		super();
	}
	@Override
	public String toString() {
		return "Genres [genresId=" + genresId + ", name=" + name + "]";
	}
	
}
