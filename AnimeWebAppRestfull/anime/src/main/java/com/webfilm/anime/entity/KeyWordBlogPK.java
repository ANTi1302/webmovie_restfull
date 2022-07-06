package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
@Embeddable
public class KeyWordBlogPK implements Serializable{

	private  String keyword;
	private String blogs;
	
	public KeyWordBlogPK() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(blogs, keyword);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyWordBlogPK other = (KeyWordBlogPK) obj;
		return Objects.equals(blogs, other.blogs) && Objects.equals(keyword, other.keyword);
	}
	
	
}
