/**
 * 
 */
package Tema5.ArrayACEJ.Bi;

/**
 * @author IvanSM
 *
 *///
public class Ej11Pag150 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] num = new int[10][10]; 
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int suma = 0;
		int media = 0;
		//d
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				num [i][j] = (int)(Math.random()*(200-301)+300);
			}
		}
		//Mostramos el contenido del array
		System.out.println("Array Numeros.");
		System.out.print("-----------------------------------------------------------");
		for (int i = 0; i < num.length; i++) {
			System.out.println();
			for (int j = 0; j < num.length; j++) {
				System.out.printf(" %-5s", num[i][j]);
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		//Cogemos los numeros de la diagonal
		System.out.println("Estos son los numeros de la diagonal.");
		System.out.println("-------------------------------------");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(i == j) {
					suma += num[i][j];
					media = suma /num.length;
					if (num[i][j] > mayor) {
						mayor = num [i][j];
					} else if (num[i][j] < menor) {
						menor = num[i][j];
					}
					System.out.println("Fila " + i + " columna " + j + " : " + num[i][j]);
				}
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("La media es de: " + media );
		System.out.println("El mayor de todos es: " + mayor);
		System.out.println("El menor de todos es: " + menor);
	}

}
