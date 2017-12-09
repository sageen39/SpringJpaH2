package com.aquarii.repository;

import java.util.List;

import com.aquarii.domain.Exercise;

public interface ExerciseRepository {
	
	public Exercise save(Exercise exercise);

	public List<Exercise> findAll();

}
