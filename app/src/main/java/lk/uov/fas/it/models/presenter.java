package lk.uov.fas.it.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class presenter extends person{
	private String affiliation;
	private String country;
	private String job_title;
}
