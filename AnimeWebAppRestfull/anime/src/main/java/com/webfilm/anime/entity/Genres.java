package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.UUID;

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
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "genres_id")
	private UUID genresId;
	@Column(columnDefinition = "nvarchar(1000)")
	private String name;
	public UUID getGenresId() {
		return genresId;
	}
	public void setGenresId(UUID genresId) {
		this.genresId = genresId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Genres(UUID genresId, String name) {
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
