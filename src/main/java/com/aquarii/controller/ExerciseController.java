package com.aquarii.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aquarii.domain.Exercise;
import com.aquarii.service.ExerciseService;




@RestController
@RequestMapping("/exercise")
public class ExerciseController {

	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping( method = RequestMethod.POST)
	public Exercise addMinutes(@Valid @RequestBody Exercise exercise) {
		
		System.out.println(exercise.toString());

		return this.exerciseService.add(exercise);
	}
	
	@RequestMapping( method = RequestMethod.GET)
	public List<Exercise> findAllActivities() {
		return exerciseService.findAll();
	}
	
	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public Exercise findById(@PathVariable("id") String id) {
		return this.exerciseService.findById(id);
	}
	
}