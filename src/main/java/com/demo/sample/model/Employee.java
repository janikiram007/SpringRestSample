package com.demo.sample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@javax.persistence.Id
	private Integer Id;
	
	private String username;
	private Integer pendingCount;
	private Integer claimedCount;
	

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
	public Integer getPendingCount() {
		return pendingCount;
	}
	public void setPendingCount(Integer pendingCount) {
		this.pendingCount = pendingCount;
	}
	public Integer getClaimedCount() {
		return claimedCount;
	}
	public void setClaimedCount(Integer claimedCount) {
		this.claimedCount = claimedCount;
	}
	
}
