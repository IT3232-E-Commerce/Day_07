package lk.uov.fas.it.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class under_graduate extends person {
	private String degree;
	private String university;
}
