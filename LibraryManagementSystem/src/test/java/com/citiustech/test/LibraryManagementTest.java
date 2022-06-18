package com.citiustech.test;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.citiustech.dao.GenericDao;
import com.citiustech.entity.Customer;
import com.citiustech.entity.Issue;
import com.citiustech.entity.Manager;
import com.citiustech.entity.Movie;
import com.citiustech.entity.OrderDetails;
import com.citiustech.entity.Shop;
import com.citiustech.entity.Staff;

public class LibraryManagementTest {

	@Test
	public void addShop() {
		GenericDao dao =  new GenericDao();
		Shop shop = new Shop();
		shop.setShop_address("Nagpur");
		shop.setAvailable_movie("Sholay|Bhool Bhulauya|RRR");
		shop.setMemmbership_no(1);
		shop.setOut_of_stock_movie("kapoor and sons|kites");
		shop.setShop_id(1);
		dao.save(shop);
	}
	
	@Test
	public void addStaff() {
		GenericDao dao =  new GenericDao();
		Staff staff=new Staff();
		staff.setAssigned_to_location("Nagpur");
		staff.setManager_id(1);
		staff.setStaff_id(1);
		staff.setStaff_name("Kiran");
		dao.save(staff);
	}
	@Test
	public void addMovie() {
		GenericDao dao=new GenericDao();
		Movie movie=new Movie();
		movie.setMovie_id(1);
		movie.setMovie_name("Sholay|Bhool Bhulauya|RRR|kapoor and sons|kites");
		dao.save(movie);
		
	}
	@Test
	public void addOrderDetails() {
		GenericDao dao=new GenericDao();
		OrderDetails od=new OrderDetails();
		od.setIssue_date(LocalDate.of(2022, 03, 01));
		od.setReturn_date(LocalDate.of(2022, 04, 30));
		od.setTotalCost(200);
		dao.save(od);
	}
	
	@Test
	public void addIssue() {
		GenericDao dao=new GenericDao();
		Issue issue=new Issue();
		issue.setIssued_date(LocalDate.of(2020, 03, 10));
		issue.setIssued_movie("Sholay");
		issue.setIssued_to(1);
	dao.save(issue);
	}
	@Test
	public void addManager() {
		GenericDao dao=new GenericDao();
		Manager m=new Manager();
		m.setAssigned_to_location("Nagpur");
		m.setManager_id(1);
		m.setManager_name("Deep");
		dao.save(m);
	}
	@Test 
	public void addCustomer() {
		GenericDao dao=new GenericDao();
		Customer c=new Customer();
		c.setAddress("Nagpur");
		c.setAge(25);
		c.setCustomer_id(1);
		c.setCustomer_name("Aman");
		c.setDateOfBirth(LocalDate.of(1997, 03, 20));
		c.setIssued_date(LocalDate.of(2022, 03, 04));
		c.setMembership_no(1);
		c.setMovie_id(1);
	}
	
}
