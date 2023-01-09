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
		// 1º Devuelve caracteres de una cadena
		System.out.println(asignatura.length());
		
		// 2º Devuelve el caracter en el indice i
		System.out.println(asignatura.charAt(3));
		
		// 3º Devuelve subcadena desde caracter i-esimo al final de la cadeana.
		System.out.println(asignatura.substring(3));
		
		// 4º Devuelve subcadena i al j-esimo
		System.out.println(asignatura.substring(0, 3));
		
		// 5º Concatenamos 2 cadenas
		System.out.println(asignatura.concat(asignatura));
		
		// 6º Devolver indice de la cadena especificada
		System.out.println(asignatura.indexOf(3));

		// 7º Comparar dos cadenas
		System.out.println(asignatura.equals("Programacion"));
		System.out.println(asignatura.compareTo(asignatura));
	
		//8º Quitar espacios en blancos detras de una cadena
		System.out.println(asignatura.strip());
	}

}
