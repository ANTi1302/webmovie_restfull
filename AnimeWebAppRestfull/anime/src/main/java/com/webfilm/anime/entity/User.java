package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user")
public class User implements Serializable{
	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "user_id")
	private String userId;
	@Column(name = "first_name",columnDefinition = "nvarchar(500)")
	private String firstName;
	@Column(name = "last_name",columnDefinition = "nvarchar(500)")
	private String lastName;
	@Column(columnDefinition = "nvarchar(500)")
	private String email;
	@Column(columnDefinition = "nvarchar(50)")
	private String phone;
	@Column(columnDefinition = "nvarchar(1000)")
	private String password;
	@Column(name = "access_tokenID",columnDefinition = "nvarchar(1000)")
	private String accessTokenID;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccessTokenID() {
		return accessTokenID;
	}
	public void setAccessTokenID(String accessTokenID) {
		this.accessTokenID = accessTokenID;
	}
	public User(String userId, String firstName, String lastName, String email, String phone, String password,
			String accessTokenID) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.accessTokenID = accessTokenID;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + ", accessTokenID=" + accessTokenID + "]";
	}
	
}
