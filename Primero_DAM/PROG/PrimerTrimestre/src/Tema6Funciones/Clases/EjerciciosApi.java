/**
 * 
 */
package Tema6Funciones.Clases;

/**
 * @author IvanSM
 *
 */
public class EjerciciosApi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String asignatura = "Programacion";
		String prueba = "Programacion";
		// 1� Devuelve caracteres de una cadena
		System.out.println(asignatura.length());
		
		// 2� Devuelve el caracter en el indice i
		System.out.println(asignatura.charAt(3));
		
		// 3� Devuelve subcadena desde caracter i-esimo al final de la cadeana.
		System.out.println(asignatura.substring(3));
		
		// 4� Devuelve subcadena i al j-esimo
		System.out.println(asignatura.substring(0, 3));
		
		// 5� Concatenamos 2 cadenas
		System.out.println(asignatura.concat(asignatura));
		
		// 6� Devolver indice de la cadena especificada
		System.out.println(asignatura.indexOf(3));

		// 7� Comparar dos cadenas
		System.out.println(asignatura.equals("Programacion"));
		System.out.println(asignatura.compareTo(asignatura));
	
		//8� Quitar espacios en blancos detras de una cadena
		System.out.println(asignatura.strip());
	}

}
