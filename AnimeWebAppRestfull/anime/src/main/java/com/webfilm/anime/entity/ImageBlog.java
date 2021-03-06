package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "image_blogs")
public class ImageBlog implements Serializable{
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "image_id")
	private UUID imageId;
	@Column(columnDefinition = "nvarchar(1000)")
	private String url;
	@ManyToOne
	@JoinColumn(name = "blog_id")
	private Blogs blogs;
	public ImageBlog(UUID imageId, String url, Blogs blogs) {
		super();
		this.imageId = imageId;
		this.url = url;
		this.blogs = blogs;
	}
	public UUID getImageId() {
		return imageId;
	}
	public void setImageId(UUID imageId) {
		this.imageId = imageId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Blogs getBlogs() {
		return blogs;
	}
	public void setBlogs(Blogs blogs) {
		this.blogs = blogs;
	}
	@Override
	public String toString() {
		return "ImageBlog [imageId=" + imageId + ", url=" + url + ", blogs=" + blogs + "]";
	}
	
}
