/**
 * 
 */
package Tema5.Relacion1;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej02Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		  
		 //Pedimos los valores a introducir por teclado
		  Scanner escaneo = new Scanner(System.in);
		  
		  System.out.println("Valores que desee introducir: ");
		  int num=escaneo.nextInt();
		  
		//Declaración de variables
		  char a[]= new char[num];
		  int n=0;
		  char caracter;
		  
		  while(n<num) {
			  
			  //Pedimos los caracteres
			  System.out.println("Introduzca un carácter: ");
			   
			 
			    caracter = escaneo.next().charAt(0);
                a[n]=caracter;
			    System.out.println(caracter);
			    System.out.println("El elemento a["+n+"]"+ a[n]);
			    
			    n++;
		  }
		  
		  //Recorro el array
		  for(int i=0; i<a.length;i++) {
		  System.out.print(a[i]);
		  }
		  System.out.println();
		  System.out.println("Caracteres " + a.length);
		 
	}

}
