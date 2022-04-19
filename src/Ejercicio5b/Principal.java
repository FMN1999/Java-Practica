package Ejercicio5b;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 /*Resolver los ejercicios 4 y 5 usando LinkedList o ArrayList en lugar de Arrays. */
		LinkedList<Empleado> empleados = new LinkedList<Empleado>();
		Scanner lector = new Scanner(System.in);
		int eleccion = 0;
		String nombre, apellido, email;
		int dni, band;
		float sueldo;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Empleado número "+ (i+1) + ":");
			System.out.println("Nombre:");
			nombre = lector.nextLine();
			System.out.println("Apellido:");
			apellido = lector.nextLine();
			System.out.println("Email:");
			email = lector.nextLine();
			System.out.println("DNI:");
			dni= lector.nextInt();
			System.out.println("Sueldo base:");
			sueldo = lector.nextFloat();
			
			
			
			
			while(eleccion < 1 || eleccion > 2) {
				System.out.println("Tipo de empleado:");
				System.out.println("1- Administrativo.");
				System.out.println("2. Vendedor.");
				eleccion = lector.nextInt();
			}
			
			if(eleccion == 1) {
				int extras, meses;
				System.out.println("Horas Extra:");
				extras = lector.nextInt();
				System.out.println("Horas del mes:");
				meses = lector.nextInt();
				
				Administrativo a1 = new Administrativo(dni, nombre, apellido, email, sueldo, extras, meses);
				empleados.add(a1);
			}
			else {
				float porcentaje;
				int ventas;
				System.out.println("Porcentaje de Comisión:");
				porcentaje = lector.nextFloat();
				System.out.println("Total de ventas:");
				ventas = lector.nextInt();
				
				Vendedor v1 = new Vendedor(dni, nombre, apellido, email, sueldo, porcentaje, ventas);
				
				empleados.add(v1);
			}
			eleccion = 0;
			System.out.println("**************¿Ingresa otro?**************");
			System.out.println("Para salir presione 0, para continuar presione cualquier número...");
			band = lector.nextInt();
			if(band == 0) {
				break;
			}
			
		}
		
		for (Empleado empleado : empleados) {
			if(empleado != null) {
				empleado.getDetalle(true);
			}
		}
		
		
		lector.close();
	}

}
