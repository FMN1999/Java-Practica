package Ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Mostrar por consola los 10 primeros números enteros y los 10 primeros números impares
		
		System.out.println("Primeros 10 números enteros:");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			if (i != 10) {
				System.out.print(", ");
			}
			else
			{
				System.out.print(".");
			}			
		}
		
		System.out.println("");
		System.out.println("Primeros 10 números impares:");
		for (int i = 1; i <= 19; i++) {
			if (i%2 != 0) {
				System.out.print(i);
				if (i != 19) {
					System.out.print(", ");
				}
				else
				{
					System.out.print(".");
				}	
			}			
		}
	}

}
