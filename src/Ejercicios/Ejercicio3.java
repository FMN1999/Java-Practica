package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Leer 10 palabras, luego leer una nueva palabra e 
		//indicar si la misma ya había sido ingresada en las 10 primeras.
		String[] palabras = new String[10];		
		String palabra_final;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingrese 10 palabras: ");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra " + (i+1) + ":");
			palabras[i] = lector.nextLine();
		}
		
		System.out.println("Indique la palabra final:");
		palabra_final = lector.nextLine();
		
		for (String palabra: palabras) {
			if(palabra.equalsIgnoreCase(palabra_final)) {
				System.out.println("La palabra " + palabra_final +" ya ah sido ingresada.");
				break;
			}
		}
		
		lector.close();
	}

}
