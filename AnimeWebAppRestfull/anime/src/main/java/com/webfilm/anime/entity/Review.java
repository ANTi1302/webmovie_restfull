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
@Table(name = "review")
public class Review implements Serializable{
	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "review_id")
	private String reviewId;
	@Column(columnDefinition = "nvarchar(1000)")
	private String comment;
	@Column(name = "created_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date createdAt;
	private int status;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;
	public Review(String reviewId, String comment, Date createdAt, int status, Users user) {
		super();
		this.reviewId = reviewId;
		this.comment = comment;
		this.createdAt = createdAt;
		this.status = status;
		this.user = user;
	}
	public Review() {
		super();
	}
	public String getReviewId() {
		return reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", comment=" + comment + ", createdAt=" + createdAt + ", status="
				+ status + ", user=" + user + "]";
	}
	
}
