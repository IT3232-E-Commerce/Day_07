package lk.uov.fas.it.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class person {
	@Id
	private String id;
	private String email;
	private String gender;
	private String name;
	private int phone;
}
