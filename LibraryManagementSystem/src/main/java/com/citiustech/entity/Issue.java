package com.citiustech.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Issue")
public class Issue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int issued_to;
	
	@JoinColumn(name="issued_date")  // foreign key mapping
    @ManyToOne
    Customer customer;
	private LocalDate issued_date;
	private String issued_movie;
	
	
	public int getIssued_to() {
		return issued_to;
	}
	public void setIssued_to(int issued_to) {
		this.issued_to = issued_to;
	}
	
	public LocalDate getIssued_date() {
		return issued_date;
	}
	public void setIssued_date(LocalDate localDate) {
		this.issued_date = localDate;
	}
	public String getIssued_movie() {
		return issued_movie;
	}
	public void setIssued_movie(String issued_movie) {
		this.issued_movie = issued_movie;
	}
	
	@Override
	public String toString() {
		return "Issue [issued_to=" + issued_to + ", issued_date=" + issued_date + ", issued_movie=" + issued_movie
				+ "]";
	}

}
