package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    
    
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project( String name, String description, String startDate, String endDate) {
		super();
		
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
    
    
    
}
