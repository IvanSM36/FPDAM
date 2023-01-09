/**
 * 
 */
package Tema5.ArrayACEJ.Bi;

/**
 * @author IvanSM
 *
 *///
public class Ej03Pag150 {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws InterruptedException {
		int[][] numeros = new int[4][5];
		int sumaTotal = 0;
		int sumaFila ;
		int sumaColum ;

		// Rellenamos array numeros
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				numeros[i][j] = (int)(Math.random()*(100-999)+999);
			}
		}
		System.out.println();
		System.out.println("Matriz numneros.");
		System.out.print("-------------------------------------------------------");
		System.out.println();
		// Sumamos las filas y las mostramos		
		for (int i = 0; i < numeros.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < numeros[0].length; j++) {
				sumaFila += numeros[i][j];
				System.out.printf("%-8s", numeros[i][j], " ");//Mostramos el contenido del array
			}
			//Calculamos el Total
			sumaTotal += sumaFila; 
			Thread.sleep(1000);
			System.out.println(" | " + sumaFila);
		}
		//Mostramos el separador para las columnas
		System.out.print("-------------------------------------------------------");
		System.out.println();
		//Sumamos las columnas
		for (int j = 0; j < numeros[0].length; j++) {
			sumaColum = 0;			
			for (int i = 0; i < numeros.length; i++) {			
				sumaColum = sumaColum + numeros[i][j];
			}
			sumaTotal += sumaColum; 
			Thread.sleep(1000);

			System.out.printf("%-8s", sumaColum);
		}
		Thread.sleep(1000);
		System.out.println(" | Total: " + sumaTotal);
	}

}
