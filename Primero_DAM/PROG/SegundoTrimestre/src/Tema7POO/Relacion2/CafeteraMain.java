/**
 * 
 */
package Tema7POO.Relacion2;

/**
 * @author IvanSM
 *
 */
public class CafeteraMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cafetera cafe1 = new Cafetera();
		
		System.out.println("Llenar cafetera");		
		cafe1.llenarCafe();
		System.out.println(cafe1.getCantidadActual());
		System.out.println();
		
		
		System.out.println("Vaciar cafetera");
		cafe1.vaciarCafetera();
		System.out.println(cafe1.getCantidadActual());
		System.out.println();
		
		System.out.println("Añadir café la cantidad deseada: ");
		cafe1.agregarCafe(500);
		System.out.println(cafe1.getCantidadActual());
		
		MisCafeteras cafeteras = new MisCafeteras();
		
	}
}
