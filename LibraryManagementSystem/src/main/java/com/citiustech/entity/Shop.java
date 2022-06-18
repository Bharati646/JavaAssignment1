package com.citiustech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Shop")
public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shop_id;
	private String shop_address;
	private String available_movie;
	private String out_of_stock_movie;
	@Override
	public String toString() {
		return "Shop [shop_id=" + shop_id + ", shop_address=" + shop_address + ", available_movie=" + available_movie
				+ ", out_of_stock_movie=" + out_of_stock_movie + ", memmbership_no=" + memmbership_no + "]";
	}
	private int memmbership_no;
	
	@JoinColumn(name="membership_no")  // foreign key mapping
    @ManyToOne
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_address() {
		return shop_address;
	}
	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}
	public String getAvailable_movie() {
		return available_movie;
	}
	public void setAvailable_movie(String available_movie) {
		this.available_movie = available_movie;
	}
	public String getOut_of_stock_movie() {
		return out_of_stock_movie;
	}
	public void setOut_of_stock_movie(String out_of_stock_movie) {
		this.out_of_stock_movie = out_of_stock_movie;
	}
	public int getMemmbership_no() {
		return memmbership_no;
	}
	public void setMemmbership_no(int memmbership_no) {
		this.memmbership_no = memmbership_no;
	}
	
}
