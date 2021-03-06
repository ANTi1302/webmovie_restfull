package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.Transactional;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "review")
public class Review implements Serializable{
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "review_id")
	private UUID reviewId;
	private String comment;
	@Column(name = "created_at")
	private Date createdAt;
	private Boolean status;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;
//	@ManyToOne
//	@JoinColumn(name = "movie_id")
//	private Movie movie;
	@Column(name = "count_like")
	private Integer countLike;
	@OneToMany
	@JoinColumn(name="review_id")
	@Column(name = "review_reply")
	private List<Review> reviewReply;
	

	public Integer getCountLike() {
		return countLike;
	}

	public void setCountLike(Integer countLike) {
		this.countLike = countLike;
	}
	//	public List<Review> getReviewReply() {
//		return reviewReply;
//	}
//
//	public void setReviewReply(List<Review> reviewReply) {
//		this.reviewReply = reviewReply;
//	}
	@Transient
	private Integer count;
	
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Review(UUID reviewId, String comment, Date createdAt, Boolean status, Users user) {
		super();
		this.reviewId = reviewId;
		this.comment = comment;
		this.createdAt = createdAt;
		this.status = status;
//		this.user = user;
	}
	
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

//	public Movie getMovie() {
//		return movie;
//	}
//
//	public void setMovie(Movie movie) {
//		this.movie = movie;
//	}

	public Review() {
		super();
	}
	public UUID getReviewId() {
		return reviewId;
	}
	public void setReviewId(UUID reviewId) {
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
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
//	public Users getUser() {
//		return user;
//	}
//	public void setUser(Users user) {
//		this.user = user;
//	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", comment=" + comment + ", createdAt=" + createdAt + ", status="
				+ status + "]";
	}
	
}
