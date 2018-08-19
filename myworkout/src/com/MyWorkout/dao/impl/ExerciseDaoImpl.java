package com.MyWorkout.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.MyWorkout.model.Exercise;

public class ExerciseDaoImpl {
	
	private List<Exercise> baseDatos = new ArrayList<Exercise>();

	public void create(Exercise newExercise) {
		baseDatos.add(newExercise);
	}
	
}
