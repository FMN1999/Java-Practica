package Ejercicio5a;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 /*Cargar una lista de empleados (m�ximo 20) preguntado en cada uno si son 
		 * administrativos o vendedores y cargar todos los datos respectivos.
		 * Luego listar los empleados indicando: dni, nombre, apellido y sueldo. 
		 * El sueldo debe calcularse en el m�todo getSueldo() de la siguiente forma:
		 * 		Si es administrativo: sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes
		 * 		Si es vendedor: sueldoBase + (porcenComision*totalVtas/100)
		 *Restricciones:
		 *	Utilizar un �nico array para almacenar a todos los empleados. No usar colecciones 
		 *din�micas.
		 *	Hacer uso de las ventajas de la programaci�n orientada a objetos: herencia, 
		 *redefinici�n y polimorfismo.
		 *	Las clases l�gicas (las del diagrama) no pueden tener entrada o salida de datos 
		 *por pantalla de ning�n tipo. Esto debe ser realizado por otra clase que cree los 
		 *objetos de las clases l�gicas y les asigne los datos necesarios.*/
		Empleado [] empleados = new Empleado[20];
		Empleado e1 = new Empleado();
		Scanner lector = new Scanner(System.in);
		
		for (int i = 0; i < empleados.length; i++) {
			System.out.println("Empleado n�mero "+ i+ ":");
			System.out.println("Nombre:");
			e1.setNombre(lector.nextLine());
			System.out.println("Apellido:");
			e1.setApellido(lector.nextLine());
			System.out.println("DNI:");
			e1.setDni(lector.nextInt());
			System.out.println("Email:");
			e1.setEmail(lector.nextLine());
			System.out.println("Sueldo base:");
			e1.setSueldoBase(lector.nextFloat());
			
		}
		
		
		System.out.println(e1.getDetalle(true));
		
		lector.close();
	}

}
