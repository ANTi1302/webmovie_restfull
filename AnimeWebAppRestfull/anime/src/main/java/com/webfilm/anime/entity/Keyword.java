package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.UUID;

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
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "keyword_id")
	private UUID keywordId;
	@Column(columnDefinition = "nvarchar(500)")
	private String name;
	public UUID getKeywordId() {
		return keywordId;
	}
	public void setKeywordId(UUID keywordId) {
		this.keywordId = keywordId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Keyword(UUID keywordId, String name) {
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
