/**
 * 
 */
package Tema3.Relacion2;

/**
 * @author IvanSM
 *
 */
public class Ej04Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int saldo = 5000;
		double intereses = 0.06;
		double anio = saldo * intereses;
		double total = saldo + anio;
		
		System.out.println("Al anio tendremos: " + total);
		
	}

}
