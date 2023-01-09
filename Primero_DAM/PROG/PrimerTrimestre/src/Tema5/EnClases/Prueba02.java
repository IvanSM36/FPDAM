/**
 * 
 */
package Tema5.EnClases;

/**
 * @author IvanSM
 *
 */
public class Prueba02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int suma = 0;
		int resta = 0;
		int producto = 0;
		
		int salario[] = new int[4];
		salario[0] = 1500;
		salario[1] = 1000;
		salario[2] = 1300;
		salario[3] = 0;
		
		
		for (int i = 0; i < salario.length; i++) {
			suma = salario[0] + salario[2];
			resta = salario[1] - salario[2];
			producto = salario[i] * salario[i];
			System.out.println("Los salarios de " + i + " es: " + salario[i]);					
			System.out.println("El producto de todos es: " + producto);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("La suma de los salarios 1 y 2 es: " + suma);
		System.out.println("El producto de todos es: " + producto);
		System.out.println("La resta de los salarios 2 y 3 es: " + resta);

	}

}
