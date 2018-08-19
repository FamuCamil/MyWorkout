package com.MyWorkout.validation.impl;

import com.MyWorkout.model.Exercise;

public class ExerciseValidatorImpl {
	
	
	public ValidationResult validate(Exercise exercise) {
		ValidationResult result = new ValidationResult();
		
		if(exercise.getName() == null || exercise.getName().trim().isEmpty()) {
			ValidationError newError = new ValidationError();
			newError.setField("name");
			newError.setMessage("El nombre no puede estar vacio.");
			newError.setInputValue(exercise.getName());
			result.getErrors().add(newError);
		}
		
		if(exercise.getDescription().length() > 1000) {
			ValidationError newError = new ValidationError();
			newError.setField("description");
			newError.setMessage("La descripcion no puede ser superior a 1000 caracteres.");
			newError.setInputValue(exercise.getDescription());
			result.getErrors().add(newError);
		}
		
		return result;
	}
}
