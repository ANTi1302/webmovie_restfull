package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="keyword_blog")
@IdClass(KeyWordBlogPK.class)
public class KeyWordBlog implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "keyword_id")
	private Keyword keyword;
	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "blog_id")
	private Blogs blogs;
	public Keyword getKeyword() {
		return keyword;
	}
	public void setKeyword(Keyword keyword) {
		this.keyword = keyword;
	}
	public KeyWordBlog() {
		super();
	}
	@Override
	public String toString() {
		return "KeyWordBlog [keyword=" + keyword + "]";
	}
	
}
