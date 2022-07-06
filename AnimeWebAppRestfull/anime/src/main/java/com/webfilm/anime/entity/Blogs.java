package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "blogs")
public class Blogs implements Serializable{
	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "blog_id")
	private String blogId;
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
	public Blogs(String blogId, String title, String imgPath) {
		super();
		this.blogId = blogId;
		this.title = title;
		this.imgPath = imgPath;
	}
	public String getBlogId() {
		return blogId;
	}
	public void setBlogId(String blogId) {
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
