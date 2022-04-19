package Ejercicio5a;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 /*Cargar una lista de empleados (máximo 20) preguntado en cada uno si son 
		 * administrativos o vendedores y cargar todos los datos respectivos.
		 * Luego listar los empleados indicando: dni, nombre, apellido y sueldo. 
		 * El sueldo debe calcularse en el método getSueldo() de la siguiente forma:
		 * 		Si es administrativo: sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes
		 * 		Si es vendedor: sueldoBase + (porcenComision*totalVtas/100)
		 *Restricciones:
		 *	Utilizar un único array para almacenar a todos los empleados. No usar colecciones 
		 *dinámicas.
		 *	Hacer uso de las ventajas de la programación orientada a objetos: herencia, 
		 *redefinición y polimorfismo.
		 *	Las clases lógicas (las del diagrama) no pueden tener entrada o salida de datos 
		 *por pantalla de ningún tipo. Esto debe ser realizado por otra clase que cree los 
		 *objetos de las clases lógicas y les asigne los datos necesarios.*/
		Empleado [] empleados = new Empleado[20];
		Scanner lector = new Scanner(System.in);
		int eleccion = 0;
		String nombre, apellido, email;
		int dni, band;
		float sueldo;
		
		for (int i = 0; i < empleados.length; i++) {
			System.out.println("Empleado número "+ i+ ":");
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
				empleados[i] = a1;
			}
			else {
				float porcentaje;
				int ventas;
				System.out.println("Porcentaje de Comisión:");
				porcentaje = lector.nextFloat();
				System.out.println("Total de ventas:");
				ventas = lector.nextInt();
				
				Vendedor v1 = new Vendedor(dni, nombre, apellido, email, sueldo, porcentaje, ventas);
				
				empleados[i] = v1;
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
