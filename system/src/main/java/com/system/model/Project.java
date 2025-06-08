package com.system.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int id;
	private String name;
	private long totalCost;
	@ManyToMany
	private List<Employee> employee;
}
