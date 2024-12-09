package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
////	many to one
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="task_id", referencedColumnName="id")
//	private Task tasks;
//	
	
	
	
//	one to many mapping
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id", referencedColumnName="id")
	private List<Task> task;
	
	
}
