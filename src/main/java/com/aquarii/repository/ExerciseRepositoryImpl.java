package com.aquarii.repository;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.aquarii.domain.Activity;
import com.aquarii.domain.Exercise;

@Repository("exerciseRepository")
@Transactional
public class ExerciseRepositoryImpl implements ExerciseRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Exercise save(Exercise exercise) {

		Iterator<Activity> activities = exercise.getActivity().iterator();
		while(activities.hasNext()) {
			Activity activity = activities.next();
			activity.setExercise(exercise);
			em.persist(activity);
		}
		em.persist(exercise);
		em.flush();
		return exercise;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Exercise> findAll() {
		
		Query query = em.createQuery("Select e from Exercise e");
		return query.getResultList();
	}
	

}
