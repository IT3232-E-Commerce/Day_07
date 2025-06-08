package com.system.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
	private String name;
	private int age;
	private String gender;
}
