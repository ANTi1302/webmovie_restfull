package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "season")
public class Season implements Serializable{
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "season_id")
	private UUID seasonId;
	@Column(name = "start_year")
	private int startYear;
	@Column(name = "end_year")
	private int endYear;
	public UUID getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(UUID seasonId) {
		this.seasonId = seasonId;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getEndYear() {
		return endYear;
	}
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	public Season(UUID seasonId, int startYear, int endYear) {
		super();
		this.seasonId = seasonId;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	public Season() {
		super();
	}
	@Override
	public String toString() {
		return "Season [seasonId=" + seasonId + ", startYear=" + startYear + ", endYear=" + endYear + "]";
	}
	
}
