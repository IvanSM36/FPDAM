/**
 * 
 */
package Tema4;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej08Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int num2 = scan.nextInt();
		System.out.print("Introduzca el tercer numero: ");
		int num3 = scan.nextInt();

		 if(num > num2 && num2 > num3)
	            System.out.println( num + "" + num2 + "" + num3);
	        else{
	            if(num > num3 && num3 > num2)
	                System.out.println(num + "" + num3 + "" + num2);
	            else{
	               if(num2 > num && num > num3)
	                   System.out.println(num2 + " "+ num +" " + num3);
	               else{
	                  if(num2 > num3 && num3 > num)
	                      System.out.println(num2 + " " + num3 + " " + num);
	                  else{
	                      if(num3 > num && num > num2)
	                         System.out.println(num3 + " " + num + " " + num2);
	                      else{
	                         if(num3 > num2 && num2 > num)
	                            System.out.println(num3 + " " + num2 + " " + num);
	                        }
	                      }
	                   }
	                }
	            }
	        }
	    }