package com.MyWorkout.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.MyWorkout.validation.impl.ValidationError;

public class ValidationException extends Exception {

	private static final long serialVersionUID = 1680089627877582383L;

	private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

	public List<ValidationError> getValidationErrors() {
		return validationErrors;
	}

	public void setValidationErrors(List<ValidationError> validationErrors) {
		this.validationErrors = validationErrors;
	}

}
