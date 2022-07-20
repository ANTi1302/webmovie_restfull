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
@Table(name = "country")
public class Country implements Serializable{
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "country_id")
	private UUID countryId;
	@Column(columnDefinition = "nvarchar(500)")
	private String name;
	public Country(UUID countryId, String name) {
		super();
		this.countryId = countryId;
		this.name = name;
	}
	public Country() {
		super();
	}
	public UUID getCountryId() {
		return countryId;
	}
	public void setCountryId(UUID countryId) {
		this.countryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", name=" + name + "]";
	}
	
}
