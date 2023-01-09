/**
 * 
 */
package Tema5.EnClases.Bi;

/**
 * @author IvanSM
 *
 */
public class Prueba01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] numeros = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j <numeros.length; j++) {
				System.out.print(numeros[i][j]);
			}
		}
		
	}

}
