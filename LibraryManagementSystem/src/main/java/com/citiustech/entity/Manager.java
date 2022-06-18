package com.citiustech.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Manager")
public class Manager {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int manager_id;
	private String manager_name;
	private String assigned_to_location;
	
	@JoinColumn(name="manager_id")  // foreign key mapping
    @ManyToOne
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getAssigned_to_location() {
		return assigned_to_location;
	}
	public void setAssigned_to_location(String assigned_to_location) {
		this.assigned_to_location = assigned_to_location;
	}
	
	@Override
	public String toString() {
		return "Manager [manager_id=" + manager_id + ", manager_name=" + manager_name + ", assigned_to_location="
				+ assigned_to_location + "]";
	}

}
