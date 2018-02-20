package com.tam.model;

// Generated Apr 26, 2015 5:10:28 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Guide generated by hbm2java
 */
@Entity
@Table(name = "guide", catalog = "tam")
public class Guide implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private ContactInfo contactInfo;
	private String name;
	private String surname;
	private int kokartNo;
	private double fare;
	private String currency;
	private Set<Tour> tours = new HashSet<Tour>(0);

	public Guide() {
	}

	public Guide(String name, String surname, int kokartNo, double fare,
			String currency) {
		this.name = name;
		this.surname = surname;
		this.kokartNo = kokartNo;
		this.fare = fare;
		this.currency = currency;
	}

	public Guide(ContactInfo contactInfo, String name, String surname,
			int kokartNo, double fare, String currency, Set<Tour> tours) {
		this.contactInfo = contactInfo;
		this.name = name;
		this.surname = surname;
		this.kokartNo = kokartNo;
		this.fare = fare;
		this.currency = currency;
		this.tours = tours;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_info_id")
	public ContactInfo getContactInfo() {
		return this.contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "surname", nullable = false, length = 45)
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Column(name = "kokart_no", nullable = false)
	public int getKokartNo() {
		return this.kokartNo;
	}

	public void setKokartNo(int kokartNo) {
		this.kokartNo = kokartNo;
	}

	@Column(name = "fare", nullable = false, precision = 22, scale = 0)
	public double getFare() {
		return this.fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	@Column(name = "currency", nullable = false, length = 3)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "guide")
	public Set<Tour> getTours() {
		return this.tours;
	}

	public void setTours(Set<Tour> tours) {
		this.tours = tours;
	}

}