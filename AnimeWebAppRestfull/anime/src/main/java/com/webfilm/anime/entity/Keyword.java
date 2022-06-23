package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "keyword")
public class Keyword implements Serializable{
	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "keyword_id", columnDefinition = "uniqueidentifier")
	private String keywordId;
	@Column(columnDefinition = "nvarchar(500)")
	private String name;
	public String getKeywordId() {
		return keywordId;
	}
	public void setKeywordId(String keywordId) {
		this.keywordId = keywordId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Keyword(String keywordId, String name) {
		super();
		this.keywordId = keywordId;
		this.name = name;
	}
	public Keyword() {
		super();
	}
	@Override
	public String toString() {
		return "Keyword [keywordId=" + keywordId + ", name=" + name + "]";
	}
	
}
