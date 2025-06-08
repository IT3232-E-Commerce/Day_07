package com.system.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee extends Person {
	@Id
	private String empNo;
	private double salary;
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department department;
	@ManyToMany
	@JoinTable(name = "project_assignments", joinColumns = @JoinColumn(name = "emp_id"), inverseJoinColumns = @JoinColumn(name = "pro_id"))
	private List<Project> project;
}
