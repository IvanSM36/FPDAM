/**
 * 
 */
package Tema5.EnClases;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class TresEnRaya {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[][] tablero = new char[3][3];
		int posicionH;
		int posicionV;
		char player1 = 'O';
		char player2 = 'X';
		int i = 0;
		int j = 0;

		for (i = 0; i < tablero.length; i++) {
			for (j = 0; j < tablero[0].length; j++) {
				// Mostramos array
				System.out.println("Tablero 3 en rayas");
				System.out.print("---------------------");
				for (i = 0; i < tablero.length; i++) {
					System.out.println();
					for (j = 0; j < tablero[0].length; j++) {
						System.out.print("  |  ");
						System.out.print(tablero[i][j]);
					}
					System.out.print("  |");
				}
				System.out.println();
				System.out.println("---------------------");
				System.out.println();
				// Si ya esta pintada no se puede cambiar
				do {
					// Pedimos al jugador 1 que introduzca las posicion de la fila a pintar
					do {
						System.out.println("Turno Jugador 1");
						System.out.print("Introduce en que fila quieres introducir(0-2): ");
						posicionH = scan.nextInt();
						if (posicionH < 0 || posicionH > 2)
							System.out.println("Por favor introduce una posicion entre 0 y 2");
					} while (posicionH < 0 || posicionH > 2);
					// Pedimos la posicion en columna a pintar
					do {
						System.out.print("Introduce la columna que quieres introducir(0-2): ");
						posicionV = scan.nextInt();
						if (posicionV < 0 || posicionV > 2)
							System.out.println("Por favor introduce una posicion entre 0 y 2");
					} while (posicionV < 0 || posicionV > 2);
					if(tablero[i][j] == player1 && tablero[i][j] == player2)
						System.out.println("Esa posicion ya esta ocupada, selecciona otra");
				} while (tablero[i][j] == player1 || tablero[i][j] == player2); // 
				System.out.println();
				// Actualizamos array y Mostramos el array
				System.out.println("Tablero 3 en rayas");
				System.out.print("---------------------");
				for (i = 0; i < tablero.length; i++) {
					System.out.println();
					for (j = 0; j < tablero.length; j++) {
						System.out.print("  |  ");
						if (posicionH == i && posicionV == j) {
							tablero[i][j] = player1;
						}
						System.out.print(tablero[i][j]);
					}
					System.out.print("  |");
				}
				System.out.println();
				System.out.println("---------------------");
				System.out.println();
				// Turno del jugador 2
				// Si ya esta pintada no se puede cambiar
				do {
					// Pedimos al jugador 1 que introduzca las posicion de la fila a pintar
					do {
						System.out.println("Turno Jugador 1");
						System.out.print("Introduce en que fila quieres introducir(0-2): ");
						posicionH = scan.nextInt();
						if (posicionH < 0 || posicionH > 2)
							System.out.println("Por favor introduce una posicion entre 0 y 2");
					} while (posicionH < 0 || posicionH > 2);
					// Pedimos la posicion en columna a pintar
					do {
						System.out.print("Introduce la columna que quieres introducir(0-2): ");
						posicionV = scan.nextInt();
						if (posicionV < 0 || posicionV > 2)
							System.out.println("Por favor introduce una posicion entre 0 y 2");
					} while (posicionV < 0 || posicionV > 2);
					if(tablero[i][j] == player1 || tablero[i][j] == player2)
						System.out.println("Esa posicion ya esta ocupada, selecciona otra");
				} while (tablero[i][j] == player1 && tablero[i][j] == player2); // 
				System.out.println();
				// Actualizamos array y Mostramos el array
				System.out.println("Tablero 3 en rayas");
				System.out.print("---------------------");
				for (i = 0; i < tablero.length; i++) {
					System.out.println();
					for (j = 0; j < tablero.length; j++) {
						System.out.print("  |  ");
						if (posicionH == i && posicionV == j) {
							tablero[i][j] = player2;
						}
						System.out.print(tablero[i][j]);
					}
					System.out.print("  |");
				}
				System.out.println();
				System.out.println("---------------------");
				System.out.println();
			}

		}
	}

}
