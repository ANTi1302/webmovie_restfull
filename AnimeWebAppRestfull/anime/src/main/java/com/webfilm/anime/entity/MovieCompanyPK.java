package com.webfilm.anime.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
@Embeddable
public class MovieCompanyPK implements Serializable{
	private String company;
	
	
	public MovieCompanyPK() {
		super();
	}


	@Override
	public int hashCode() {
		return Objects.hash(company);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieCompanyPK other = (MovieCompanyPK) obj;
		return Objects.equals(company, other.company);
	}


}
