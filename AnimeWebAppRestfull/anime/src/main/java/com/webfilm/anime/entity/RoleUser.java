package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role_user")
public class RoleUser implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Roles roles;
	@Id
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public RoleUser(Roles roles, User user) {
		super();
		this.roles = roles;
		this.user = user;
	}
	public RoleUser() {
		super();
	}
	@Override
	public String toString() {
		return "RoleUser [roles=" + roles + ", user=" + user + "]";
	}
	
}
