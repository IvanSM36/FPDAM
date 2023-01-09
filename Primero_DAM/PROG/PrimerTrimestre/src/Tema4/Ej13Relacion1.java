/**
 * 
 */
package Tema4;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej13Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
		 System.out.println("Introduzca su salario bruto:");
		 float salario=s.nextFloat();
		 
		 System.out.println("Introduzca el número de hijos que tiene");
		 int hijos=s.nextInt();
		 
		 if(hijos<=2) {
			 System.out.println("Su retención es del 20%");
			 System.out.println("Descuento en euros de: "+salario*0.2);
			 System.out.println("Tendrá un salario neto de: "+salario*0.8);
			 
		 }else if(hijos>=3 &&  hijos<=5) {
			 System.out.println("Su retención es del 15%");
			 System.out.println("Descuento en euros de: "+salario*0.15);
			 System.out.println("Tendrá un salario de: "+salario*0.85);
			 

		 }else if(hijos>=7 &&  hijos<=9) {
			 System.out.println("Su retención es del 5%");
			 System.out.println("Descuento en euros de "+salario*0.5);
			 System.out.println("Tendrá un salario de: "+salario*0.95);
			

		 }else {
			 System.out.println("Su retención es del 0%");
			 System.out.println("Tendrá un salario de: "+salario*1);
		 }
		
		
	}

}