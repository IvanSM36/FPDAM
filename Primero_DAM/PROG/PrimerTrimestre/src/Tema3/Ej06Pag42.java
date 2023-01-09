/**
 * 
 */
package Tema3;

/**
 * @author IvanSM
 *
 */
public class Ej06Pag42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double baseImponible = 50;

	    System.out.printf("Base imponible %8.2f\n", baseImponible);
	    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
	    System.out.printf("-----------------------\n");
	    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
		
	}

}
