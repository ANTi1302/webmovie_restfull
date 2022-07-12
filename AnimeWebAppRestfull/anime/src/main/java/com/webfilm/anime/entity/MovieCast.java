package com.webfilm.anime.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie_cast")
@IdClass(MovieCastPK.class)
public class MovieCast {
	@Id
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	@Column(name = "character_name",columnDefinition = "nvarchar(500)")
	private String character_name;
	@Column(name = "cast_order")
	private Date castOrder;
	public String getCharacter_name() {
		return character_name;
	}
	public void setCharacter_name(String character_name) {
		this.character_name = character_name;
	}
	public Date getCastOrder() {
		return castOrder;
	}
	public void setCastOrder(Date castOrder) {
		this.castOrder = castOrder;
	}
	@Override
	public String toString() {
		return "MovieCast [character_name=" + character_name + ", castOrder=" + castOrder + "]";
	}
	
	
}
