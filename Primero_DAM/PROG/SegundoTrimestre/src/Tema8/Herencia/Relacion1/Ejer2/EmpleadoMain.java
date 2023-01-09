/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer2;

/**
 * @author IvanSM
 *
 */
public class EmpleadoMain {

	/**
	 * Metodos @param args
	 */
	public static void main(String[] args) {
		// Creamos los objetos de las clases hijas
		Comercial comercial1 = new Comercial("Antonio", "Lopez", 25, 600, 50);
		Repartidor repartidor1 = new Repartidor("Fernando", "Perez", 43, 400, "Este");

		// Invocamos los metodos de la clase padre
		comercial1.plus(300);
		repartidor1.plus(300);
		// Mostramos los atributos, usando los metodos get de la clase padre.
		// Datos Comercial1
		System.out.println("Datos Comercial 1");
		System.out.println("-----------------");
		System.out.println("Nombre: " + comercial1.getNombre());
		System.out.println("Apellido: " + comercial1.getApellido1());
		System.out.println("El salario actual del comercial es: " + comercial1.getSalario());
		System.out.println();
		// Datos Repartidor1
		System.out.println("Datos Repartidor 1");
		System.out.println("-----------------");
		System.out.println("Nombre: " + repartidor1.getNombre());
		System.out.println("Apellido: " + repartidor1.getApellido1());
		System.out.println("El salario actual del comercial es: " + repartidor1.getSalario());

		///Falla el metodo
	}

}
