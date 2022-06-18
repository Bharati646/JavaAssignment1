package com.citiustech.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrderDetails")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int totalCost;
	public int getTotalCost() {
		return totalCost;
	}
	@Override
	public String toString() {
		return "OrderDetails [totalCost=" + totalCost + ", Issue_date=" + Issue_date + ", Return_date=" + Return_date
				+ "]";
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public LocalDate getIssue_date() {
		return Issue_date;
	}
	public void setIssue_date(LocalDate issue_date) {
		Issue_date = issue_date;
	}
	public LocalDate getReturn_date() {
		return Return_date;
	}
	public void setReturn_date(LocalDate return_date) {
		Return_date = return_date;
	}
	private LocalDate Issue_date;
	private LocalDate Return_date ;
}
