package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4b {

	public static void main(String[] args) {
		// Resolver los ejercicios 4 y 5 usando LinkedList o ArrayList en lugar de Arrays.

		Scanner lector = new Scanner(System.in);
		Integer num, var_num;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("Ingrese el número inicial");
		num = lector.nextInt();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Ingrese el número " + (i+1)+ ":");
			var_num = lector.nextInt();
			if(num < var_num) {
				numeros.add(var_num);
			}
		} 
		
		System.out.println("Números mayores a " + num + " :");
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
		lector.close();
	}

}
