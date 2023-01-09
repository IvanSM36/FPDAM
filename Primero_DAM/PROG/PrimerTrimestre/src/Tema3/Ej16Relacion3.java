/**
 * 
 */
package Tema3;

/**
 * @author IvanSM
 *
 */
public class Ej16Relacion3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=3, b=6, e; 
		
		e= a/ b; 		
		System.out.println( "El valor de e es: " + e);
		
		e= a% b;		
		System.out.println("El valor de e es: " + e); 
		
		a++; //Se incrementa a tomando valor 4 para la siguiente sentencia.
		System.out.println("El valor de a es: " + a); 
		
		a++; //Se incrementa atomando valor 5 para la siguiente sentencia.
		System.out.println("El valor de a es: .. " + a); 
		
		e= a++ + b++;  //Cambia el valor de e siendo a incrementado a 6 + b incrementado a 7 e seria 11
		System.out.println("El valor de a es: .. " + a); // Vale 6
		System.out.println("El valor de b es: " + b); // Vale 7
		System.out.println("El valor de e es: .. " + e); //E vale 11 por que suma a y b y luego se incrementa a y b para la siguiente sentencia
		
		e= a++ + b++; //Cambia el valor de e siendo a = 7 y b = 8
		System.out.println("El valor de a es: " + a); //Vale 7
		System.out.println("El valor de b es: " + b); //Vale8
		System.out.println("El valor de e es: .. " + e);  //E vale 13 por que suma a y b y luego se incrementa a y b para la siguiente sentencia
	}

}
