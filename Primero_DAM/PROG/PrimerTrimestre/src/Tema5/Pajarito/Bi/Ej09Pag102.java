/**
 * 
 */
package Tema5.Pajarito.Bi;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej09Pag102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t[][][];
        int i,j,k;
        t = new int[9][9][9];
        for (i=0;i<9;i++){
            for (j=0;j<9;j++){
                for (k=0;k<9;k++){
                    if(i==0 || i==8 || j==0 || j==8 || k==0 || k==8)
                        // si estamos en la primera o última columna, fila o capa de la matriz
                        t[i][j][k]=1;
                }
            }
        }
        // Mostramos la matriz capa a capa
        System.out.println("Matriz: ");
        for (i=0;i<9;i++)
        {
            System.out.println("Capa: " +i);
            for (j=0;j<9;j++)
            {
                for (k=0;k<9;k++)
                {
                    System.out.print(t[i][j][k] + " ");
                }
                System.out.println ();
            }
            System.out.println (" -------------- ");
        }

		/*int[][][] matriz = new int[9][9][9];

		//Rellenamos matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				for (int k = 0; k < matriz.length; k++) {
					if(i == 0 || i == 8 || j == 0 || j == 8 || k == 0|| k ==8)
						matriz[i][j][k] = 1;
				}
			}
		}
		
		//Mostramos contenido matriz
		System.out.println("Matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(i);
			for (int j = 0; j < matriz.length; j++) {
				for (int k = 0; k < matriz.length; k++) {
					System.out.println(matriz[i][j][k] + " ");				
				}
				System.out.println();
			}
			System.out.println(" -------------- ");
		}*/
	}

}
