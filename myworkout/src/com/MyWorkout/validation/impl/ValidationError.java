package com.MyWorkout.validation.impl;

public class ValidationError {
	private String field;
	private String inputValue;
	private String message;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getInputValue() {
		return inputValue;
	}

	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
