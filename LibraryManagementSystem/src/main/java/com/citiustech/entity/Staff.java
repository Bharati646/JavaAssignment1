package com.citiustech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Staff")
public class Staff {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staff_id;
	
	@JoinColumn(name="manager_id")  // foreign key mapping
    @ManyToOne
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	@Override
	public String toString() {
		return "Staff [staff_id=" + staff_id + ", staff_name=" + staff_name + ", assigned_to_location="
				+ assigned_to_location + ", manager_id=" + manager_id + "]";
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public String getAssigned_to_location() {
		return assigned_to_location;
	}
	public void setAssigned_to_location(String assigned_to_location) {
		this.assigned_to_location = assigned_to_location;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	private String staff_name ;
	private String assigned_to_location;
	private int manager_id;
	
}
