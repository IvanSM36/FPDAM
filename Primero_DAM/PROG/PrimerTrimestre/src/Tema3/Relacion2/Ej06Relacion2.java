/**
 * 
 */
package Tema3.Relacion2;

/**
 * @author IvanSM
 *
 */
public class Ej06Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double zapatillas = 85;
		double rebaja = 0.15;	
		double descuento = zapatillas * rebaja;
		double total = zapatillas - descuento;
		
		System.out.println("El descuento es de: " + descuento);
		System.out.println("El precio total a pagar es: " + total);
	}

}
