package com.system.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private String empNo;
	private String name;
	private int age;
	private double salary;
	private String gender;
	@ManyToOne
	private Department department;
	@ManyToMany(mappedBy = "employee")
	private List<Project> Project;
}
