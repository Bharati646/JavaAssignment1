package com.citiustech.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int customer_id;
	private String customer_name;
	private LocalDate  dateOfBirth;
	private String address;
	private int membership_no;
	private LocalDate issued_date;
	private int movie_id;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMembership_no() {
		return membership_no;
	}
	public void setMembership_no(int membership_no) {
		this.membership_no = membership_no;
	}
	public LocalDate getIssued_date() {
		return issued_date;
	}
	public void setIssued_date(LocalDate issued_date) {
		this.issued_date = issued_date;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + ", membership_no=" + membership_no + ", issued_date="
				+ issued_date + ", movie_id=" + movie_id + ", age=" + age + "]";
	}

}
