package com.aquarii.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquarii.domain.Exercise;
import com.aquarii.repository.ExerciseRepository;


@Service("excerciseService")
public class ExerciseServiceImpl implements ExerciseService{
	
	@Autowired
	private ExerciseRepository exerciseRepository;

	@Override
	public List<Exercise> findAll() {
		return this.exerciseRepository.findAll();
	}

	@Override
	public Exercise add(Exercise exercise) {
		return this.exerciseRepository.save(exercise);
	}

	@Override
	public Exercise findById(String id) {

		return null;
	
	}
	
	

}
