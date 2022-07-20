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
@Table(name = "episode")
public class Episode implements Serializable{
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "episode_id")
	private UUID episodeId;
	@Column(name = "number_season")
	private int episodeNumber;
	@Column(name = "path_video",columnDefinition = "nvarchar(1000)")
	private String pathVideo;
	@Column(name = "poster",columnDefinition = "nvarchar(1000)")
	private String poster;
	
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public UUID getEpisodeId() {
		return episodeId;
	}
	public void setEpisodeId(UUID episodeId) {
		this.episodeId = episodeId;
	}
	public int getEpisodeNumber() {
		return episodeNumber;
	}
	public void setEpisodeNumber(int episodeNumber) {
		this.episodeNumber = episodeNumber;
	}
	public String getPathVideo() {
		return pathVideo;
	}
	public void setPathVideo(String pathVideo) {
		this.pathVideo = pathVideo;
	}
	public Episode(UUID episodeId, int episodeNumber, String pathVideo) {
		super();
		this.episodeId = episodeId;
		this.episodeNumber = episodeNumber;
		this.pathVideo = pathVideo;
	}
	public Episode() {
		super();
	}
	@Override
	public String toString() {
		return "Episode [episodeId=" + episodeId + ", episodeNumber=" + episodeNumber + ", pathVideo=" + pathVideo
				+ ", poster=" + poster + "]";
	}
	
	
}
