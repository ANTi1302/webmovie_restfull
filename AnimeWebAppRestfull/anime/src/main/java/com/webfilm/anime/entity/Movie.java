package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Type(type="uuid-char")
	@Column(name = "movie_id")
	private UUID movieId;
	private String title;
	private String name;
	private String overview;
	private Integer runtime;
	private String tagline;
	private String status;
	@Column(name = "votes_avg")
	private float votesAvg;
	@Column(name = "votes_count")
	private Integer votesCount;
	private String type;
	@Column(name = "date_aired")
	private Integer dateAired;
	private String quality;
	private double views;
	@Column(name = "scores_avg")
	private float scoresAvg;
	@Column(name = "scores_count")
	private Integer scoresCount;
	@Column(name = "poster_path")
	private String posterPath;
	private Integer recently;
	private Integer live;
	private Integer popular;
	private Integer trending;
	@Column(name = "role_age")
	private Integer roleAge;
//	@ManyToOne
//	@JoinColumn(name = "user_id")
//	private Users users;
	@OneToMany
	@JoinColumn(name = "movie_id")
	private List<MovieEpisode> movieEpisodes;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_id")
	private List<MovieGenres> movieGenres;
	@OneToMany
	@Transient
	@JoinColumn(name = "movie_id")
	@GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	private List<Review> reviews;
	@OneToMany
	@JoinColumn(name = "movie_id")
	private List<MovieCompany> movieCompanies;
	
	public Integer getRoleAge() {
		return roleAge;
	}

	public void setRoleAge(Integer roleAge) {
		this.roleAge = roleAge;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public List<MovieCompany> getMovieCompanies() {
		return movieCompanies;
	}

	public void setMovieCompanies(List<MovieCompany> movieCompanies) {
		this.movieCompanies = movieCompanies;
	}

	public Movie(UUID movieId, String title, String name, String overview, Integer runtime, String tagline, String status,
			float votesAvg, Integer votesCount, String type, Integer dateAired, String quality, double views, float scoresAvg,
			Integer scoresCount, String posterPath, Integer recently, Integer live, Integer popular, Integer trending,
			List<MovieCompany> movieCompanies) {
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
		this.movieCompanies = movieCompanies;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<MovieEpisode> getMovieEpisodes() {
		return movieEpisodes;
	}

	public void setMovieEpisodes(List<MovieEpisode> movieEpisodes) {
		this.movieEpisodes = movieEpisodes;
	}

	public Movie() {
		super();
	}

	public List<MovieGenres> getMovieGenres() {
		return movieGenres;
	}

	public void setMovieGenres(List<MovieGenres> movieGenres) {
		this.movieGenres = movieGenres;
	}

	public Movie(UUID movieId, String title, String name, String overview, Integer runtime, String tagline, String status,
			float votesAvg, Integer votesCount, String type, Integer dateAired, String quality, double views, float scoresAvg,
			Integer scoresCount, String posterPath, Integer recently, Integer live, Integer popular, Integer trending) {
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
	}
//	public List<MovieSeries> getMovieSeries() {
//		return movieSeries;
//	}
//
//	public void setMovieSeries(List<MovieSeries> movieSeries) {
//		this.movieSeries = movieSeries;
//	}

	public UUID getMovieId() {
		return movieId;
	}

	public void setMovieId(UUID movieId) {
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

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
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

	public void setVotesCount(Integer votesCount) {
		this.votesCount = votesCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getDateAired() {
		return dateAired;
	}

	public void setDateAired(Integer dateAired) {
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

	public Integer getScoresCount() {
		return scoresCount;
	}

	public void setScoresCount(Integer scoresCount) {
		this.scoresCount = scoresCount;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public Integer getRecently() {
		return recently;
	}

	public void setRecently(Integer recently) {
		this.recently = recently;
	}

	public Integer getLive() {
		return live;
	}

	public void setLive(Integer live) {
		this.live = live;
	}

	public Integer getPopular() {
		return popular;
	}

	public void setPopular(Integer popular) {
		this.popular = popular;
	}

	public Integer getTrending() {
		return trending;
	}

	public void setTrending(Integer trending) {
		this.trending = trending;
	}

//	public Users getUsers() {
//		return users;
//	}
//
//	public void setUsers(Users users) {
//		this.users = users;
//	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", name=" + name + ", overview=" + overview
				+ ", runtime=" + runtime + ", tagline=" + tagline + ", status=" + status + ", votesAvg=" + votesAvg
				+ ", votesCount=" + votesCount + ", type=" + type + ", dateAired=" + dateAired + ", quality=" + quality
				+ ", views=" + views + ", scoresAvg=" + scoresAvg + ", scoresCount=" + scoresCount + ", posterPath="
				+ posterPath + ", recently=" + recently + ", live=" + live + ", popular=" + popular + ", trending="
				+ trending + ", movieEpisodes=" + movieEpisodes + ", movieGenres=" + movieGenres + ", reviews="
				+ reviews + ", movieCompanies=" + movieCompanies + "]";
	}

}
