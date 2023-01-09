/**
 * 
 */
package TomoNota;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class NumFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int multi = 1;
		
		do {
			System.out.println("Introduzca un numero: ");
			num = scan.nextInt();
		} while(num < 0);
				
		for(int i = 1; i <= num; i++) {		
			
			multi *= i;
			System.out.println(i+ "! = " + multi );	
		}
		
	}

}
