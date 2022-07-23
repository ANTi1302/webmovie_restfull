package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
public class RoleUserPK2 implements Serializable{

	private String roles;
	private String user;
	
	public RoleUserPK2() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(roles, user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleUserPK2 other = (RoleUserPK2) obj;
		return Objects.equals(roles, other.roles) && Objects.equals(user, other.user);
	}
	
}
