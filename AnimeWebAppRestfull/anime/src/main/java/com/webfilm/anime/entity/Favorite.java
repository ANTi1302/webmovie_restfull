package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "favorite")
public class Favorite implements Serializable{
	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "favorite_id")
	private String favoriteId;
	@Column(name = "created_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date createdAt;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;
	
	public Favorite() {
		super();
	}
	public Favorite(String favoriteId, Date createdAt, Users user) {
		super();
		this.favoriteId = favoriteId;
		this.createdAt = createdAt;
		this.user = user;
	}
	public String getFavoriteId() {
		return favoriteId;
	}
	public void setFavoriteId(String favoriteId) {
		this.favoriteId = favoriteId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Favorite [favoriteId=" + favoriteId + ", createdAt=" + createdAt + ", user=" + user + "]";
	}
	
}
