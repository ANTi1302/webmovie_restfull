package com.webfilm.anime.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "movie")
public class Movie implements Serializable{
	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "movie_id")
	private String movieId;
	@Column(columnDefinition = "nvarchar(500)")
	private String title;
	@Column(columnDefinition = "nvarchar(500)")
	private String name;
	@Column(columnDefinition = "nvarchar(1000)")
	private String overview;
	@Column(columnDefinition = "nvarchar(500)")
	private int runtime;
	@Column(columnDefinition = "nvarchar(500)")
	private String tagline;
	@Column(columnDefinition = "nvarchar(500)")
	private String status;
	@Column(name = "votes_avg")
	private float votesAvg;
	@Column(name = "votes_count")
	private int votesCount;
	@Column(columnDefinition = "nvarchar(500)")
	private String type;
	@Column(name = "date_aired")
	private int dateAired;
	@Column(columnDefinition = "nvarchar(500)")
	private String quality;
	@Column(columnDefinition = "nvarchar(500)")
	private double views;
	@Column(name = "scores_avg")
	private float scoresAvg;
	@Column(name = "scores_count")
	private int scoresCount;
	@Column(name = "poster_path",columnDefinition = "nvarchar(1000)")
	private String posterPath;
	@Column(columnDefinition = "nvarchar(500)")
	private int recently;
	@Column(columnDefinition = "nvarchar(500)")
	private int live;
	@Column(columnDefinition = "nvarchar(500)")
	private int popular;
	@Column(columnDefinition = "nvarchar(500)")
	private int trending;
	@Column(name = "movie_path",columnDefinition = "nvarchar(1000)")
	private String moviePath;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Movie() {
		super();
	}
	public Movie(String movieId, String title, String name, String overview, int runtime, String tagline, String status,
			float votesAvg, int votesCount, String type, int dateAired, String quality, double views, float scoresAvg,
			int scoresCount, String posterPath, int recently, int live, int popular, int trending, String moviePath,
			User user) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.name = name;
		this.overview = overview;
		this.runtime = runtime;
		this.tagline = tagline;
		this.status = status;
		this.votesAvg = votesAvg;
		this.votesCount = votesCount;
		this.type = type;
		this.dateAired = dateAired;
		this.quality = quality;
		this.views = views;
		this.scoresAvg = scoresAvg;
		this.scoresCount = scoresCount;
		this.posterPath = posterPath;
		this.recently = recently;
		this.live = live;
		this.popular = popular;
		this.trending = trending;
		this.moviePath = moviePath;
		this.user = user;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getVotesAvg() {
		return votesAvg;
	}
	public void setVotesAvg(float votesAvg) {
		this.votesAvg = votesAvg;
	}
	public int getVotesCount() {
		return votesCount;
	}
	public void setVotesCount(int votesCount) {
		this.votesCount = votesCount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDateAired() {
		return dateAired;
	}
	public void setDateAired(int dateAired) {
		this.dateAired = dateAired;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public double getViews() {
		return views;
	}
	public void setViews(double views) {
		this.views = views;
	}
	public float getScoresAvg() {
		return scoresAvg;
	}
	public void setScoresAvg(float scoresAvg) {
		this.scoresAvg = scoresAvg;
	}
	public int getScoresCount() {
		return scoresCount;
	}
	public void setScoresCount(int scoresCount) {
		this.scoresCount = scoresCount;
	}
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public int getRecently() {
		return recently;
	}
	public void setRecently(int recently) {
		this.recently = recently;
	}
	public int getLive() {
		return live;
	}
	public void setLive(int live) {
		this.live = live;
	}
	public int getPopular() {
		return popular;
	}
	public void setPopular(int popular) {
		this.popular = popular;
	}
	public int getTrending() {
		return trending;
	}
	public void setTrending(int trending) {
		this.trending = trending;
	}
	public String getMoviePath() {
		return moviePath;
	}
	public void setMoviePath(String moviePath) {
		this.moviePath = moviePath;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", name=" + name + ", overview=" + overview
				+ ", runtime=" + runtime + ", tagline=" + tagline + ", status=" + status + ", votesAvg=" + votesAvg
				+ ", votesCount=" + votesCount + ", type=" + type + ", dateAired=" + dateAired + ", quality=" + quality
				+ ", views=" + views + ", scoresAvg=" + scoresAvg + ", scoresCount=" + scoresCount + ", posterPath="
				+ posterPath + ", recently=" + recently + ", live=" + live + ", popular=" + popular + ", trending="
				+ trending + ", moviePath=" + moviePath + "]";
	}
	
	
}
