/**
 * 
 */
package Tema2;

/**
 * @author IvanSM
 *
 */
public class Ej05Pag30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Lunes     Martes     Miercoles     Jueves     Viernes");
		System.out.printf("\033[35m%-10s\033[39;49m %-10s %-13s %-10s \033[35m%-5s \n", "PROG", "--", "--", "--", "PROG");
		System.out.printf("\033[35m%-10s\033[39;49m %-10s %-13s %-10s \033[35m%-5s \n", "PROG", "--", "--", "--", "PROG");
		System.out.printf("\033[35m%-10s\033[39;49m %-10s %-13s %-10s %-5s \n", "PROG", "--", "--", "--", "--");
		System.out.printf("\033[39;45m%26s %25s\033[39;49m \n", "RECREO", " ");
		System.out.printf("%-10s \033[35m%-10s\033[39;49m %-13s %-10s %-5s \n", "--", "PROG", "--", "--", "--");
		System.out.printf("%-10s \033[35m%-10s\033[39;49m %-13s %-10s %-5s \n", "--", "PROG", "--", "--", "--");
		System.out.printf("%-10s %-10s %-13s \033[35m%-10s\033[39;49m %-5s \n", "--", "--", "--", "PROG", "--");
	}

}
