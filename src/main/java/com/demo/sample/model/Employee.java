package com.demo.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	private String username;
	
	private Integer pending_count;
	
	private Integer claimed_count;
	

	public String getUsername() {
		return username;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getPending_count() {
		return pending_count;
	}
	public void setPending_count(Integer pending_count) {
		this.pending_count = pending_count;
	}
	public Integer getClaimed_count() {
		return claimed_count;
	}
	public void setClaimed_count(Integer claimed_count) {
		this.claimed_count = claimed_count;
	}
	
	
}
