package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Leer 10 palabras y mostrarlas en orden inverso al que fueron ingresadas.
		Scanner lector = new Scanner(System.in);
		String[] palabras = new String[10];
		
		System.out.println("Ingrese 10 palabras");
		for (int i = 0; i < 10; i++) {
			System.out.println("Palabra número: " + (i+1));
			palabras[i] = lector.nextLine();
		}
		
		System.out.println("Palabras en orden inverso al ingresado:");
		for (int i = 9; i >= 0; i--) {
			System.out.println(palabras[i]);
		}
		
		lector.close();
	}

}
