package lk.uov.fas.it.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class post_graduate extends person {
	private String institute;
	private String research_interest;
	private String second_degree;

}
