package lk.uov.fas.it.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class workshop {
	@Id
	private int id;
	private String description;
	private String end_date;
	private String name;
	private String start_date;
}
