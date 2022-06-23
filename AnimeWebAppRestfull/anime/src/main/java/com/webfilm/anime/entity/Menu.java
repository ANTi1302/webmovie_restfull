package com.webfilm.anime.entity;

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
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "menus_id", columnDefinition = "uniqueidentifier")
	private String menusId;
	@Column(columnDefinition = "nvarchar(500)")
	private String name;
	@Column(columnDefinition = "nvarchar(1000)")
	private String url;
	public String getMenusId() {
		return menusId;
	}
	public void setMenusId(String menusId) {
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
	public Menu(String menusId, String name, String url) {
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
