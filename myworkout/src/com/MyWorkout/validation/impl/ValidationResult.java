package com.MyWorkout.validation.impl;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {

	private List<ValidationError> errors = new ArrayList<ValidationError>();

	public boolean isValid() {
		return errors.isEmpty();
	}

	public List<ValidationError> getErrors() {
		return errors;
	}

	public void setErrors(List<ValidationError> errors) {
		this.errors = errors;
	}

}
