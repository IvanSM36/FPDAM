/**
 * 
 */
package Tema3.Relacion4;
import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej05Relacion4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, uni, dec, cen, res;
        System.out.print("10. MOSTRAR LA UNIDAD, LA DECENA Y LA CENTENA.\n\n");
        System.out.print("Ingrese un número de 3 cífras : ");
        num = Integer.parseInt(scan.next());
        cen = num /100;
        res = num - (cen * 100);
        dec = res / 10;
        uni = res - (dec * 10);
        System.out.println("Centena : " + cen);
        System.out.println("Decena : " + dec);
        System.out.println("Unidad : " + uni);
		
	}

}
