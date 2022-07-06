package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "blog_detail")
public class BlogDetail implements Serializable{
	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "blog_id")
	private Blogs blogs;
	@Column(columnDefinition = "nvarchar(1000)")
	private String details;
	@Column(columnDefinition = "nvarchar(50)")
	private String tagline;
	@Column(name = "created_at")
	@DateTimeFormat(pattern = "yyyy-MMMM-dd")
	private Date createdAt;
	@Column(name = "updated_at")
	@DateTimeFormat(pattern = "yyyy-MMMM-dd")
	private Date updateAt;
	
	public BlogDetail() {
		super();
	}
	public BlogDetail(Blogs blogs, String details, String tagline, Date createdAt, Date updateAt) {
		super();
		this.details = details;
		this.tagline = tagline;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	@Override
	public String toString() {
		return "BlogDetail [details=" + details + ", tagline=" + tagline + ", createdAt="
				+ createdAt + ", updateAt=" + updateAt + "]";
	}
	
}
