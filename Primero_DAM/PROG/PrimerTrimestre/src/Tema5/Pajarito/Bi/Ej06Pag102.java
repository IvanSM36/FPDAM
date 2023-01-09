/**
 * 
 */
package Tema5.Pajarito.Bi;

/**
 * @author IvanSM
 *
 */
public class Ej06Pag102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] matriz = new int [10][10];
		int sumaFila = 0;
		int sumaColum = 0;
		int contaColum = 0;
		
		//Rellenamos el arrat con numeros randoms
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (int)(Math.random()*10);
			}		
		}
		//Mostramos el array matriz
		System.out.println("Tabla matriz.");
		System.out.print("--------------------");
		for (int i = 0; i< matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("%2s", matriz[i][j] , " ");
			}
		}
		System.out.println();
		System.out.println();
		//Sumamos las filas y mostramos
		for (int i = 0; i< matriz.length; i++) {
			sumaFila= 0; //Suma cada fila, sin esto sumaria todas las filas,
			for (int j = 0; j < matriz[i].length; j++) {	
				sumaFila = sumaFila + matriz[i][j];
			}
			System.out.println("Suma de la fila " + i + ": " + sumaFila);
		}
		System.out.println();
		System.out.println();
		//Sumamos las columnas y mostramos
		//Para la columna debemos  recorrer primero con la J y despues con la I
		for (int j = 0; j < matriz[0].length; j++) {
			sumaColum = 0;
			contaColum ++;
			for (int i = 0; i < matriz.length; i++) {			
				sumaColum = sumaColum + matriz[i][j];
			}
			System.out.println("Suma de la columna " + contaColum + ": " + sumaColum);
		}//d
	}
}
