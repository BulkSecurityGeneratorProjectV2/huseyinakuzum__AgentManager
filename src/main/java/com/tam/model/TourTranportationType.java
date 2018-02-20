package com.tam.model;

// Generated Apr 26, 2015 5:10:28 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TourTranportationType generated by hbm2java
 */
@Entity
@Table(name = "tour_tranportation_type", catalog = "tam")
public class TourTranportationType implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String code;
	private String name;
	private Set<Tour> tours = new HashSet<Tour>(0);

	public TourTranportationType() {
	}

	public TourTranportationType(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public TourTranportationType(String code, String name, Set<Tour> tours) {
		this.code = code;
		this.name = name;
		this.tours = tours;
	}

	@Id
	@Column(name = "code", unique = true, nullable = false, length = 2)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tourTranportationType")
	public Set<Tour> getTours() {
		return this.tours;
	}

	public void setTours(Set<Tour> tours) {
		this.tours = tours;
	}

}