package com.aquarii.service;

import java.util.List;

import com.aquarii.domain.Exercise;

public interface ExerciseService {
	
	public List<Exercise> findAll();
	public Exercise add(Exercise exercise);
	public Exercise findById(String id);

}
