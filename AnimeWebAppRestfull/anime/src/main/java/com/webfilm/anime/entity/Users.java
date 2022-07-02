package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "users")
public class Users implements Serializable{
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
	@Column(name = "path_img",columnDefinition = "nvarchar(1000)")
	private String pathImg;
	@OneToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "user_id")
	private List<Review> reviews;
	
	public String getPathImg() {
		return pathImg;
	}
	public void setPathImg(String pathImg) {
		this.pathImg = pathImg;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
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
	public Users(String userId, String firstName, String lastName, String email, String phone, String password,
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
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + ", accessTokenID=" + accessTokenID + ", pathImg="
				+ pathImg + "]";
	}
	
}
