/**
 * 
 */
package Tema5.ArrayACEJ.Bi;

/**
 * @author IvanSM
 *
 *///
public class Ej05Pag150 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] numeros = new int [6][10];
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int filaMayor = 0;
		int columMayor = 0;
		int fila = 0;
		int columna = 0;
//d
		//Rellenamos el array con numeros randoms
		for(int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				numeros[i][j] = (int)(Math.random()*1001);
			}
		}
		//Mostramos el array numeros y localizamos el mayor y el menor.
		for(int i = 0; i < numeros.length; i++) {
			System.out.println();
			for (int j = 0; j < numeros[0].length; j++) {
				//Localizamos el menor
				if(numeros[i][j] > mayor) {
					fila = i;
					columna = j;
					mayor = numeros[i][j];				
				//Localizamos el mayor
				}if (numeros[i][j] < menor) {
					filaMayor = i;
					columMayor = j;		
					menor = numeros[i][j];				
				}
				System.out.printf("%5s", numeros[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("El numero mas pequeño es: " + menor + " en la fila " + fila + " columna " + columna);
		System.out.println("El numero mas grande es: " + mayor + " en la fila " + fila + " columna " + columna);
	}

}
