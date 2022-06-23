package com.webfilm.anime.entity;

import java.io.Serializable;

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
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "episode_id")
	private String episodeId;
	@Column(name = "episode_number")
	private int episodeNumber;
	@Column(name = "path_video",columnDefinition = "nvarchar(1000)")
	private String pathVideo;
	@Column(name = "number_season")
	private int numberSeason;
	public int getNumberSeason() {
		return numberSeason;
	}
	public void setNumberSeason(int numberSeason) {
		this.numberSeason = numberSeason;
	}
	public String getEpisodeId() {
		return episodeId;
	}
	public void setEpisodeId(String episodeId) {
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
	public Episode(String episodeId, int episodeNumber, String pathVideo) {
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
				+ "]";
	}
	
	
}
