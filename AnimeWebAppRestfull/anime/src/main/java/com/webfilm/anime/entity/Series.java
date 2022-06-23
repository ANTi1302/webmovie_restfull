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
	
	public Series() {
		super();
	}
	public Series(String seriesId, String title, int startYear) {
		super();
		this.seriesId = seriesId;
		this.title = title;
		this.startYear = startYear;
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
	@Override
	public String toString() {
		return "Series [seriesId=" + seriesId + ", title=" + title + ", startYear=" + startYear + "]";
	}
	
}
