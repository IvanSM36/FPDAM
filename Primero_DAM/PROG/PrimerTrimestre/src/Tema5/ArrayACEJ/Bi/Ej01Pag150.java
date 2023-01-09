/**
 * 
 */
package Tema5.ArrayACEJ.Bi;

/**
 * @author IvanSM
 *
 */
public class Ej01Pag150 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num = new int[3][6]; // array de 3 filas por 6 columnas

	    num[0][0] = 0;
	    num[0][1] = 30;
	    num[0][2] = 2;
	    num[0][5] = 7;
	    num[1][0] = 75;
	    num[1][4] = 0;
	    num[2][2] = -2;
	    num[2][3] = 9;
	    num[2][5] = 11;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println();
			for(int j = 0; j < num[0].length; j++) {
				System.out.printf("%5s", num[i][j], " ");
				
			}
		}//
	}

}
