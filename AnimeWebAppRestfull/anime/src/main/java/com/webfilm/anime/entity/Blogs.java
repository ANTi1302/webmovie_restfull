package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "blogs")
public class Blogs implements Serializable{
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "blog_id")
	private UUID blogId;
	@Column(columnDefinition = "nvarchar(500)")
	private String title;
	@Column(columnDefinition = "nvarchar(500)")
	private String imgPath;
	@Column(name = "top_blog")
	private int topBlog;
	@OneToMany
	@JoinColumn(name = "blog_id")
	private List<KeyWordBlog> keyWordBlogs;
	@OneToMany
	@JoinColumn(name = "blog_id")
	private List<GenresBlog> genresBlogs;
	@OneToMany
	@JoinColumn(name = "blog_id")
	private List<BlogDetail> blogDetails;
	@OneToMany
	@JoinColumn(name = "blog_id")
	private List<Review> reviews;
	
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public int getTopBlog() {
		return topBlog;
	}
	public void setTopBlog(int topBlog) {
		this.topBlog = topBlog;
	}
	public List<BlogDetail> getBlogDetails() {
		return blogDetails;
	}
	public void setBlogDetails(List<BlogDetail> blogDetails) {
		this.blogDetails = blogDetails;
	}
	public List<KeyWordBlog> getKeyWordBlogs() {
		return keyWordBlogs;
	}
	public void setKeyWordBlogs(List<KeyWordBlog> keyWordBlogs) {
		this.keyWordBlogs = keyWordBlogs;
	}
	public List<GenresBlog> getGenresBlogs() {
		return genresBlogs;
	}
	public void setGenresBlogs(List<GenresBlog> genresBlogs) {
		this.genresBlogs = genresBlogs;
	}
	public Blogs() {
		super();
	}
	public Blogs(UUID blogId, String title, String imgPath) {
		super();
		this.blogId = blogId;
		this.title = title;
		this.imgPath = imgPath;
	}
	public UUID getBlogId() {
		return blogId;
	}
	public void setBlogId(UUID blogId) {
		this.blogId = blogId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	@Override
	public String toString() {
		return "Blogs [blogId=" + blogId + ", title=" + title + ", imgPath=" + imgPath + ", keyWordBlogs="
				+ keyWordBlogs + ", genresBlogs=" + genresBlogs + "]";
	}
	
}
