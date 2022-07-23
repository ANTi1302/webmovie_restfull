package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role_user")
@IdClass(RoleUserPK.class)
public class RoleUserPK implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Roles roles;
	@ManyToOne
	@EmbeddedId
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
		RoleUserPK other = (RoleUserPK) obj;
		return Objects.equals(user, other.user);
	}
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	public RoleUserPK(Roles roles, Users user) {
		super();
		this.roles = roles;
		this.user = user;
	}
	public RoleUserPK() {
		super();
	}
	@Override
	public String toString() {
		return "RoleUser [roles=" + roles + ", user=" + user + "]";
	}
	
}
