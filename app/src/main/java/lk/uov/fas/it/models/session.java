package lk.uov.fas.it.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class session {
	@Id
	private String id;
	private String date;
	private String description;
	private String name;
	private String time;
	private int workshop_id;
}
