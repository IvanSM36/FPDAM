/**
 * 
 */
package Tema5.Relacion1;

/**
 * @author IvanSM
 *
 */
public class Ej04Relacion1 {

	/**
	 * Realiza un programa que sea capaz de rellenar una matriz 3x2 con cadenas de caracteres, 
	 * y sea capaz de devolver la cadena que contenga el mayor número de caracteres.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int longCadenaMasLarga=0;//Va a contener la longitud de la cadena más larga
		String cadenaMasLarga="";//Va a Contener la cadena más larga del Array
		String[][] arrayCadena = new String[3][2];//Declaración del array bidimensional
	
		//Rellenamos la matriz
		arrayCadena[0][0]="hola";
		arrayCadena[0][1]="que";
		arrayCadena[1][0]="tal";
		arrayCadena[1][1]="estas";
		arrayCadena[2][0]="nombrenombre";
		arrayCadena[2][1]="hola";
		
		
		for(int i=0; i<arrayCadena.length; i++) {
			for(int j=0;j<arrayCadena[i].length;j++) {
				
				if(arrayCadena[i][j].length() > longCadenaMasLarga){
					
					longCadenaMasLarga = arrayCadena[i][j].length();//Volcamos la mayor cadena
					cadenaMasLarga=arrayCadena[i][j];
				}
		}
		}
			System.out.println("El elemento que contiene mayor longitud es:" + cadenaMasLarga + " con longitud: " + longCadenaMasLarga);
		
	}
		
		
	

}
