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
@Table(name = "series")
public class Series implements Serializable{
	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	@Column(name = "series_id")
	private String seriesId;
	@Column(columnDefinition = "nvarchar(500)")
	private String title;
	@Column(name = "start_year")
	private int startYear;
	@Column(name = "number_season")
	private int numberSeason;
	
	public Series() {
		super();
	}
	public Series(String seriesId, String title, int startYear, int numberSeason) {
		super();
		this.seriesId = seriesId;
		this.title = title;
		this.startYear = startYear;
		this.numberSeason = numberSeason;
	}
	public String getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getNumberSeason() {
		return numberSeason;
	}
	public void setNumberSeason(int numberSeason) {
		this.numberSeason = numberSeason;
	}
	@Override
	public String toString() {
		return "Series [seriesId=" + seriesId + ", title=" + title + ", startYear=" + startYear + ", numberSeason="
				+ numberSeason + "]";
	}
	
}
