package com.MyWorkout.controller;

import java.util.Scanner;

import com.MyWorkout.exceptions.ValidationException;
import com.MyWorkout.service.impl.ExerciseServiceImpl;
import com.MyWorkout.validation.impl.ValidationError;

public class ConsoleController {
	
	private static Scanner lectorTeclado = new Scanner(System.in);
	private static ExerciseServiceImpl servicio = new ExerciseServiceImpl();
	
	public static void main (String[] args){
		
		while(true) {
			mostrarMenu();
			recogerOpcionUsuario();
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("==============");
		System.out.println("1) Crear ejercicio");
	}
	
	public static void recogerOpcionUsuario() {
		System.out.println("\n >> Elija opción: ");
		String opcionElegida = lectorTeclado.nextLine();
		switch(opcionElegida) {
			case "1":
				opcionCrearEjercicio();
				break;
			default:
				System.out.println("La opcion elegida no es válida.");
		}
	}
	
	public static void opcionCrearEjercicio() {
		String nombre = "";
		String descripcion = "";
		
		System.out.println("     - Introduzca el nombre del nuevo ejercicio (obligatorio): ");
		nombre = lectorTeclado.nextLine();
		System.out.println("     - Introduzca la descripcion del nuevo ejercicio (opcional): ");
		descripcion = lectorTeclado.nextLine();
		
		try {
			servicio.createExercise(nombre, descripcion);
			System.out.println("Ejercicio creado correctamente.");
		} catch (ValidationException e) {
			System.err.println(" ** Se han producido errores al validar el ejercicio: ");
			for(ValidationError error : e.getValidationErrors()){
				System.err.println(" **  > Campo: "+error.getField()+" | Error: "+error.getMessage() + " | Texto introducido: "+error.getInputValue());
			}
		}
		
	}
}
