/**
 * 
 */
package Tema3;

/**
 * @author IvanSM
 *
 */
public class Ej17Relacion3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean expresion; 
			int a= 7; 
			//
			expresion= 2 * 5 < 5 * 2 || a + 1 < 10 && a++ % 2 == 0; // expresion1 es falso y la expesion 2
			System.out.println("El valor de laexpresion es: "+ expresion); 
			
			expresion= 3 < 2 || a++ > 6; 
			System.out.println("El valor de la expresion es: "+ expresion); 
			
			expresion= (a++ < 10) && (a % 2 == 0 ) && a<= 10; 
			System.out.println( "El valor de la expresion es: " + expresion); 
			
			expresion= a++ < 10 || a% 3 == 2; 
			System.out.println("El valor de la expresion es: " + expresion); 
			System.out.println( "El valor de a es: " + a);
	}

}
