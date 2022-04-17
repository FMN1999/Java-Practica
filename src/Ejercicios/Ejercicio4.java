package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Leer un entero y luego una lista de 20 enteros. Guardar los 
		//mayores al número inicial y mostrarlos al final. Usar arrays, no otras colecciones.
		Scanner lector = new Scanner(System.in);
		Integer num, var_num;
		Integer[] numeros =new Integer[20];
		Integer band = 0;
		
		System.out.println("Ingrese el número inicial");
		num = lector.nextInt();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Ingrese el número " + (i+1)+ ":");
			var_num = lector.nextInt();
			if(num < var_num) {
				if (band == 0) {
					numeros[0] = var_num;
					band = 1;
				}
				else {
					numeros[band] = var_num; 
					band++;
				}
			}
		} 
		
		System.out.println("Números mayores a " + num + " :");
		for (Integer numero : numeros) {
			if(numero != null) {
				System.out.println(numero);
			}
			
		}
		
		lector.close();
	}

}
