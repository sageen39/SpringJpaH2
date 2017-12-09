package com.aquarii.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "exercise")
public class Exercise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Range(min = 1, max = 120)
	@Column(name="mins")
	private int minutes;
	
	@NotNull
	@OneToMany(mappedBy="exercise", cascade=CascadeType.ALL)
	private List<Activity> activity= new ArrayList<>();
	
	public String getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public List<Activity> getActivity() {
		return activity;
	}

	public void setActivity(List<Activity> activity) {
		this.activity = activity;
	}

	@Override
	public String toString() {
		return "Exercise [id=" + id + ", minutes=" + minutes + ", activity=" + activity + "]";
	}
	
	

}
