/**
 * 
 */
package Tema3.Relacion2;

/**
 * @author IvanSM
 *
 */
public class Ej07Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double inversion = 10000;
		double increm10 = 1.10;
		double pierde500 = 500;
		double increm12 = 1.12;
		double totalInversion = inversion;
		
		inversion *= increm10;
		System.out.println("El primer año incrementa 10%: " + inversion);
		inversion -= pierde500;
		System.out.println("El segundo año pierde 500: " + inversion);
		inversion *= increm12;				
		System.out.println("El tercer año icrementa un 12%: " + inversion);
		
	}

}
