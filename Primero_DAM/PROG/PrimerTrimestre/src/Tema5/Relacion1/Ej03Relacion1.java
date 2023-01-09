/**
 * 
 */
package Tema5.Relacion1;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej03Relacion1 {

	/**
	 * Realiza un programa que rellene un array con String pedidas por teclado, 
	 * genere otro array con los enteros correspondientes a los caracteres de dichas cadenas 
	 * y los imprima por pantalla.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Pedimos los valores a introducir por teclado
		  Scanner escaneo = new Scanner(System.in);
		  String cadena="";
		  
		  //Pedimos los valores que desea introducir el usuario
		  System.out.println("Valores que desee introducir: ");
		  int num=escaneo.nextInt();
		  String[] arrayCadena = new String[num];//Array que almacena las String introducidas por el usuario
		  int[] tamannoArray=new int[num];//Array que almacena la longitud de las String introducidas por el usuario
		  int n=0;
		  
		  
		  //Rellenamos el array cadenas
		  while(n<num) {
			  
			//Pedimos los caracteres
			  System.out.println("Introduzca una cadena: ");
			  cadena = escaneo.next();
			  arrayCadena[n]=cadena;//Annado la cadena al Array de cadenas
			  System.out.println("El elemento a["+n+"]"+ arrayCadena[n]);
			  
			 //Generamos un array con las longitudes	
			  tamannoArray[n]=arrayCadena[n].length();//Annado la longitud de cada cadena, al Array de longitudes
			  n++;
		  }
		  
		//Recorremos el nuevo array para visualizar las longitudes de cada String
		for(int i=0; i< tamannoArray.length;i++) {
			System.out.print(tamannoArray[i]);
		}

}
}
