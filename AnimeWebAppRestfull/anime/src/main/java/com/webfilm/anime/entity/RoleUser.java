package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

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
	private Users user;
	
	@Override
	public int hashCode() {
		return Objects.hash(user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleUser other = (RoleUser) obj;
		return Objects.equals(user, other.user);
	}
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public RoleUser(Roles roles, Users user) {
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
