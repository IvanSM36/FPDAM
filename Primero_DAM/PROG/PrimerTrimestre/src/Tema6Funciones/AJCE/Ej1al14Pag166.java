/**
 * 
 */
package Tema6Funciones.AJCE;
import java.util.Scanner;

import Tema6Funciones.AJCE.FuncionesAzul;
/**
 * @author IvanSM
 *
 */
public class Ej1al14Pag166 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  int opcion = 0;
		  int num;
		  int num2;
		
		  System.out.println("┌──────────────────────────────────────────────────────────────────────────────────────────────────────────┐");
		  System.out.println("│  1º esCapicua: Indica si es capicua o no                                                                 │");
		  System.out.println("│  2º esPrimo: Indica si es primo o no                                                                     │");
		  System.out.println("│  3º siguientePrimo: Devuelve el siguienteprimo al introducido.                                           │");
		  System.out.println("│  4º potencia: Dada una base y un exponente devuelve la potencia.                                         │");
		  System.out.println("│  5º digitos: Cuenta el numero de digitos de un numero entero.                                            │");
		  System.out.println("│  6º voltea:  Le da la vuelta a un numero.                                                                │");
		  System.out.println("│  7º digitoN: Devuelve el digito que esta en la posicion n se cuenta el 0                                 │");
		  System.out.println("│  8º posicionDigito: da la posicion de la primera ocurrencia de un digito, si no devuelve -1              │");
		  System.out.println("│  9º quitaPorDetras: Le quita a un numero n digitos porla derecha.                                        │");
		  System.out.println("│ 10º quitaPorDelante: Le quita a un numero n digitos por la izquierda.                                    │");
		  System.out.println("│ 11º pegaPorDetras: Añade un digito a un numero por la derecha                                            │"); 
		  System.out.println("│ 12º pegaPorDelante: Añade un digito a un numero por la izquierda                                         │");
		  System.out.println("│ 13º trozoDeNumero: Toma como parametro las posicion inicial y final y devuelve el trozo correspondiente. │");
		  System.out.println("│ 14º juntaNumeros: Pega dos numeros para formar uno.                                                      │");
		  System.out.println("└──────────────────────────────────────────────────────────────────────────────────────────────────────────┘");
		  
		  do {
			  System.out.print("Elige una opcion: ");
			  opcion = scan.nextInt();
			  if(opcion < 0) 
				  System.out.println("Error, introduzca un numero mayor que 0");
			  if(opcion > 14)
				  System.out.println("Error, introduzca un numero menor de 15");
			  
		  }while( opcion < 0 || opcion > 15);
		  
			switch (opcion) {
		case 1:
			System.out.print("Introduzca un numero: ");
			num = scan.nextInt();
			if(FuncionesAzul.esCapicua(num)) 
				System.out.println("El numero " + num + " es capicuo");
			else 
				System.out.println("El numero " + num + " no es capicuo");			
			break;
		case 2:
			System.out.print("Introduzca un numero: ");
			num = scan.nextInt();
			if (FuncionesAzul.esPrimo(num))
				System.out.println("El numero " + num + " es primo");
			else
				System.out.println("El numero " + num + " no es primo");
			break;
		case 3:
			System.out.print("Introduzca un numero: ");
			num = scan.nextInt();
			System.out.print("El siguiente numero primo es: " + FuncionesAzul.siguientePrimo(num));
			break;
		case 4:
				System.out.print("Introduzca una base: ");
				num = scan.nextInt();
				System.out.print("Introduzca un exponente: ");
				num2 = scan.nextInt();
				
				System.out.println("La potencia de " + num + "^" + num2 + " es: " +	FuncionesAzul.potencia(num, num2));
				
			break;
		case 5:
			System.out.print("Introduzca una numero: ");
			num = scan.nextInt();
			System.out.println("El numero " + num + " tiene " + FuncionesAzul.digitos(num) + " digitos");
			break;
		case 6:
			System.out.print("Introduzca un numero: ");
			num = scan.nextInt();
			System.out.print("Numero introducido: " + num);
			System.out.println();
			System.out.print("Numero volteado: " + FuncionesAzul.voltea(num));
			
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			
			break;
		case 10:
			
			break;
		case 11:
			
			break;
		case 12:
			
			break;
		case 13:
			
			break;
		case 14:
			
			break;
		default:
			break;
		} 
		  
	}

}
