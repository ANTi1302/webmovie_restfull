package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "watch")
public class Watch implements Serializable{
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "watch_id", columnDefinition = "uniqueidentifier")
	private UUID watchId;
	@Column(name = "created_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date createdAt;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;
	
	public Watch() {
		super();
	}
	public Watch(UUID watchId, Date createdAt, Users user) {
		super();
		this.watchId = watchId;
		this.createdAt = createdAt;
		this.user = user;
	}
	public UUID getWatchId() {
		return watchId;
	}
	public void setWatchId(UUID watchId) {
		this.watchId = watchId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Watch [watchId=" + watchId + ", createdAt=" + createdAt + ", user=" + user + "]";
	}
	
}
