package Ejercicio6a;

public class Principal {

	/*Resolver:

Crear una clase Product que contenga los siguientes atributos: id:int, name:String, description:String, price:double, stock: int, shippingIncluded: boolean
Crear la base de datos javaMarket con la tabla Product para almacenar objetos de la clase Product con id autoincremental y los dem�s atributos seg�n corresponda.
Cargar al menos 3 registros en la base de datos para realizar el desarrollo.
Crear una app que se conecte a la DB y permita:

list. Listar todos los productos indicando: id, name y price.
search. Mostrar los datos completos de un Product. El usuario debe ingresar un id y la app debe mostrar todos los datos de ese articulo.
new. Cargar nuevos Products (sin id) e insertarlos en la tabla. Durante la inserci�n debe recuperar el id generado en la BD y mostrarlo al usuario (no puede realizar un nuevo select)
delete. Eliminar un Product. El usuario debe ingresar un id y la app debe eliminar el registro
update. Modificar un Product. El usuario debe ingresar un id y la app debe mostrar los datos actuales y preguntar los nuevos datos. Finalmente debe aplicar el cambio en la base de datos.
Restricciones:

Todo el manejo de la base de datos debe hacerse en una clase que no sea el programa principal ni la clase Product.
La clase Product no puede contener c�digo para leer o escribir datos de/a la interfaz, ni de o hacia la DB.
Cada operaci�n debe realizarse en un m�todo (puede invocar a otros si desea reusar el c�digo).
Cada m�todo solo puede recibir y/o devolver objetos Product o una colecci�n (array, ArrayList, LinkedList, etc) de objetos Product. Por ejemplo el listar no necesita recibir nada y devuelve una colecci�n de Product, el mostrar recibe un bbjeto Product con el id y devuelve uno completo.
El archivo .jar del conector a la DB debe ubicarse localmente en el proyecto.
Sugerencias:

No preocuparse por validaciones.
Hacer un menu simple que itere y pregunte por las opciones requeridas (agregar una opci�n para salir)
Primero cree la clase l�gica, luego el men� sin realizar acciones y finalmente desarrollar las acciones una a una por el orden indicado, ya que se han listado en orden de dificultad.
	 */
	
	public static void main(String[] args) {
		new Menu().start();
	}

	
}
