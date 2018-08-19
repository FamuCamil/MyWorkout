package com.MyWorkout.service.impl;

import com.MyWorkout.dao.impl.ExerciseDaoImpl;
import com.MyWorkout.exceptions.ValidationException;
import com.MyWorkout.model.Exercise;
import com.MyWorkout.validation.impl.ExerciseValidatorImpl;
import com.MyWorkout.validation.impl.ValidationResult;

public class ExerciseServiceImpl {

	public ExerciseDaoImpl exerciseDao;
	public ExerciseValidatorImpl exerciseValidator;
	
	public ExerciseServiceImpl() {
		exerciseDao = new ExerciseDaoImpl();
		exerciseValidator = new ExerciseValidatorImpl();
	}

	public void createExercise(String name, String description) throws ValidationException {

		Exercise newExercise = new Exercise();
		newExercise.setName(name);
		newExercise.setDescription(description);
		
		ValidationResult result = exerciseValidator.validate(newExercise);
		
		if(result.isValid()) {
			exerciseDao.create(newExercise);
		}else {
			ValidationException validationException = new ValidationException();
			validationException.setValidationErrors(result.getErrors());
			throw validationException;
		}
	}
}
