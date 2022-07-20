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
@Table(name = "production_company")
public class ProductCompany implements Serializable{

	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name = "company_id")
	private UUID companyId;
	@Column(columnDefinition = "nvarchar(500)")
	private String name;
	public UUID getCompanyId() {
		return companyId;
	}
	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductCompany(UUID companyId, String name) {
		super();
		this.companyId = companyId;
		this.name = name;
	}
	public ProductCompany() {
		super();
	}
	@Override
	public String toString() {
		return "ProductCompany [companyId=" + companyId + ", name=" + name + "]";
	}
	
}
