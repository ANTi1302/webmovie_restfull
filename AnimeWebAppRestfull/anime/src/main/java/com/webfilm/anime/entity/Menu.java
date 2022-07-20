package com.webfilm.anime.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "menus")
public class Menu {
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "menus_id")
	private UUID menusId;
	@Column(columnDefinition = "varchar(500)")
	private String name;
	@Column(columnDefinition = "varchar(1000)")
	private String url;
	public UUID getMenusId() {
		return menusId;
	}
	public void setMenusId(UUID menusId) {
		this.menusId = menusId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Menu(UUID menusId, String name, String url) {
		super();
		this.menusId = menusId;
		this.name = name;
		this.url = url;
	}
	public Menu() {
		super();
	}
	@Override
	public String toString() {
		return "Menu [menusId=" + menusId + ", name=" + name + ", url=" + url + "]";
	}
	
}
