/**
 * 
 */
package Tema4;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class Ej03Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca dia de la semana ");
		int dia = scan.nextInt();
		
		if(dia == 1) {
			System.out.println("Hoy es Lunes.");
		}else if(dia == 2) {
			System.out.println("Hoy es Martes.");
		}else if (dia == 3){
			System.out.println("Hoy es Miercoles");
		}else if (dia == 4){
			System.out.println("Hoy es Jueves");
		}else if (dia == 5){
			System.out.println("Hoy es Viernes");
		}else if (dia == 6){
			System.out.println("Hoy es Sabado");
		}else if (dia == 7){
			System.out.println("Hoy es Domingo");
		}else {
			System.out.println("Introduzca un dia entre 1-7.");
		}
			
		
	}

}
